package com.example.didvc_demo.service

import id.walt.crypto.keys.jwk.JWKKey
import id.walt.did.dids.DidService
import kotlinx.coroutines.reactor.mono
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class DIDService {

    fun createDIDJwk(key: String): Mono<String> {
        println("### DIDService.createDIDJwk ###")
        return mono {
            DidService.minimalInit()
            val jwkKey = JWKKey.importJWK(key)
            val didJwk = DidService.registerByKey("jwk", jwkKey.getOrThrow())
            println("did:")
            println(didJwk.did)
            println("did Document:")
            println(didJwk.didDocument)
            println()
            return@mono didJwk.did
        }
    }
}