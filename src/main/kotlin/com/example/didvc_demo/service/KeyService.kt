package com.example.didvc_demo.service

import com.example.didvc_demo.service.vo.CreateECSecp256k1OutVO
import id.walt.crypto.keys.KeyType
import id.walt.crypto.keys.jwk.JWKKey
import kotlinx.coroutines.reactor.mono
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class KeyService {

    fun createECSecp256k1(): Mono<CreateECSecp256k1OutVO> {
        println("### KeyService.createECSecp256k1 ###")
        return mono {
            val jwkKey = JWKKey.generate(KeyType.secp256r1)
            val publicKey = jwkKey.getPublicKey().exportJWK()   // PublicKey
            val privateKey = jwkKey.exportJWK()   // PrivateKey

            println("publicKey:")
            println(publicKey)
            println()
            return@mono CreateECSecp256k1OutVO(publicKey, privateKey)
        }
    }
}