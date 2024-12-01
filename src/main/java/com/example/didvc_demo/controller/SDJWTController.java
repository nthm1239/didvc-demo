package com.example.didvc_demo.controller;

import com.example.didvc_demo.service.DIDService;
import com.example.didvc_demo.service.KeyService;
import com.example.didvc_demo.service.SDJWTService;
import com.example.didvc_demo.service.vo.CreateECSecp256k1OutVO;
import com.nimbusds.jose.jwk.ECKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.text.ParseException;

@RestController
public class SDJWTController {

    @Autowired
    KeyService keyService;

    @Autowired
    DIDService didService;

    @Autowired
    SDJWTService sdjwtService;

    @GetMapping("/hello")
    public void hello(){
        CreateECSecp256k1OutVO outVO = keyService.createECSecp256k1().block();
        if (outVO == null) throw new RuntimeException("outVO is null");
        String publicKey = outVO.getPublicKey();
        String privateKey = outVO.getPrivateKey();
        String didJwk = didService.createDIDJwk(publicKey).block();
        try {
            String sdJwt = sdjwtService.createSDJwt(ECKey.parse(privateKey)).block();
            if (sdJwt == null) throw new RuntimeException("sdJwt is null");
            sdjwtService.verifySDJwt(sdJwt, ECKey.parse(publicKey)).block();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return;
    }
}
