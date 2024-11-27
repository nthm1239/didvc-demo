package com.example.didvc_demo.controller;

import com.example.didvc_demo.service.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SDJWTController {

    @Autowired
    KeyService keyService;

    @GetMapping("/hello")
    public String hello(){
        String jwkKey = keyService.createECSecp256k1().block();;
        return jwkKey;
    }
}
