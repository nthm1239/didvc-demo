package com.example.didvc_demo.service

import com.nimbusds.jose.JWSAlgorithm
import com.nimbusds.jose.crypto.ECDSASigner
import com.nimbusds.jose.crypto.ECDSAVerifier
import com.nimbusds.jose.jwk.ECKey
import com.nimbusds.jwt.JWTClaimsSet
import id.walt.sdjwt.SDJwt
import id.walt.sdjwt.SDPayload
import id.walt.sdjwt.SimpleJWTCryptoProvider
import kotlinx.coroutines.reactor.mono
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class SDJWTService {
    /**
     * Create and sign an SD-JWT using the NimbusDS-based JWT crypto provide
     */
    fun createSDJwt(privateKey: ECKey): Mono<String> {
        println("### SDJWTService.createSDJwt ###")
        return mono {
            val cryptoProvider = SimpleJWTCryptoProvider(JWSAlgorithm.ES256, ECDSASigner(privateKey), null)

            // Create original JWT claims set, using nimbusds claims set builder
            val originalClaimsSet = JWTClaimsSet.Builder()
                .subject("123")
                .audience("456")
                .build()

            // Create undisclosed claims set, by removing e.g. subject property from original claims set
            val undisclosedClaimsSet = JWTClaimsSet.Builder(originalClaimsSet)
                .subject(null)
                .build()

            // Create SD payload by comparing original claims set with undisclosed claims set
            val sdPayload = SDPayload.createSDPayload(originalClaimsSet, undisclosedClaimsSet)

            // Create and sign SD-JWT using the generated SD payload and the previously configured crypto provider
            val sdJwt = SDJwt.sign(sdPayload, cryptoProvider)

            println("SD JWT:")
            println(sdJwt)

            println("SD JWT disclosed all:")
            println(sdJwt.present(true))

            val aud = "test-audience"
            val nonce = "test-nonce"
            val sdJwtWithKB = sdJwt.present(true, aud, nonce, cryptoProvider)
            println("SD JWT disclosed all with KB:")
            println(sdJwtWithKB)
            println()

            return@mono sdJwtWithKB.toString()
        }
    }

    fun verifySDJwt(sdJwt: String, publicKey: ECKey): Mono<Unit> {
        println("### SDJWTService.verifySDJwt ###")
        return mono {
            val cryptoProvider = SimpleJWTCryptoProvider(JWSAlgorithm.ES256, null, ECDSAVerifier(publicKey))

            // verify and parse presented SD-JWT with all fields undisclosed, throws Exception if verification fails!
            val parsedVerifiedUndisclosedJwt = SDJwt.verifyAndParse(sdJwt, cryptoProvider)

            // print full payload with disclosed fields only
            println("JWT payload:")
            println(parsedVerifiedUndisclosedJwt.toString())
            println("verified:")
            println(parsedVerifiedUndisclosedJwt.verified)
            println("signatureVerified:")
            println(parsedVerifiedUndisclosedJwt.signatureVerified)
            println("disclosuresVerified:")
            println(parsedVerifiedUndisclosedJwt.disclosuresVerified)
            println("message:")
            println(parsedVerifiedUndisclosedJwt.message)
            println("sdJwt.algorithm:")
            println(parsedVerifiedUndisclosedJwt.sdJwt.algorithm)
            println("sdJwt.fullPayload:")
            println(parsedVerifiedUndisclosedJwt.sdJwt.fullPayload)
            println("sdJwt.undisclosedPayload:")
            println(parsedVerifiedUndisclosedJwt.sdJwt.undisclosedPayload)
            println("sdJwt.sdPayload:")
            println(parsedVerifiedUndisclosedJwt.sdJwt.sdPayload)
            println("sdJwt.disclosures:")
            println(parsedVerifiedUndisclosedJwt.sdJwt.disclosures)
            println("sdJwt.disclosureObjects:")
            println(parsedVerifiedUndisclosedJwt.sdJwt.disclosureObjects)
            println("sdJwt.digestedDisclosures:")
            println(parsedVerifiedUndisclosedJwt.sdJwt.digestedDisclosures)
            println("sdJwt.keyBindingJwt:")
            println(parsedVerifiedUndisclosedJwt.sdJwt.keyBindingJwt)
            println()
        }
    }
}