package com.example.didvc_demo.service

import id.walt.crypto.keys.KeyType
import id.walt.crypto.keys.jwk.JWKKey
import kotlinx.coroutines.reactor.mono
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class KeyService {

    fun createECSecp256k1(): Mono<String> {
        return mono {
            val jwkKey = JWKKey.generate(KeyType.secp256k1)
//            val publicKey = jwkKey.getPublicKey().exportJWK()   // PublicKey
            val privateKey = jwkKey.exportJWK()   // PrivateKey
            return@mono privateKey
        }
    }
}