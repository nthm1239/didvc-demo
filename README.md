# Example

```
### KeyService.createECSecp256k1 ###
publicKey:
{"kty":"EC","crv":"P-256","kid":"YOQ7pQKOxRc4F4L5M64fB8bKhxMPWSxA69_ae9CigFk","x":"1YPE9uW9InZ1w5Qglx8_PIM7GwxLwp2WgOFwmERaDVc","y":"IzBA8F7LTwBdNmZU6ZIWA9a556FClKVsp2R4SUPExyk"}

### DIDService.createDIDJwk ###
did:
did:jwk:eyJrdHkiOiJFQyIsImNydiI6IlAtMjU2Iiwia2lkIjoiWU9RN3BRS094UmM0RjRMNU02NGZCOGJLaHhNUFdTeEE2OV9hZTlDaWdGayIsIngiOiIxWVBFOXVXOUluWjF3NVFnbHg4X1BJTTdHd3hMd3AyV2dPRndtRVJhRFZjIiwieSI6Ikl6QkE4RjdMVHdCZE5tWlU2WklXQTlhNTU2RkNsS1ZzcDJSNFNVUEV4eWsifQ
did Document:
{"@context":["https://www.w3.org/ns/did/v1","https://w3id.org/security/suites/jws-2020/v1"],"id":"did:jwk:eyJrdHkiOiJFQyIsImNydiI6IlAtMjU2Iiwia2lkIjoiWU9RN3BRS094UmM0RjRMNU02NGZCOGJLaHhNUFdTeEE2OV9hZTlDaWdGayIsIngiOiIxWVBFOXVXOUluWjF3NVFnbHg4X1BJTTdHd3hMd3AyV2dPRndtRVJhRFZjIiwieSI6Ikl6QkE4RjdMVHdCZE5tWlU2WklXQTlhNTU2RkNsS1ZzcDJSNFNVUEV4eWsifQ","verificationMethod":[{"id":"did:jwk:eyJrdHkiOiJFQyIsImNydiI6IlAtMjU2Iiwia2lkIjoiWU9RN3BRS094UmM0RjRMNU02NGZCOGJLaHhNUFdTeEE2OV9hZTlDaWdGayIsIngiOiIxWVBFOXVXOUluWjF3NVFnbHg4X1BJTTdHd3hMd3AyV2dPRndtRVJhRFZjIiwieSI6Ikl6QkE4RjdMVHdCZE5tWlU2WklXQTlhNTU2RkNsS1ZzcDJSNFNVUEV4eWsifQ#0","type":"JsonWebKey2020","controller":"did:jwk:eyJrdHkiOiJFQyIsImNydiI6IlAtMjU2Iiwia2lkIjoiWU9RN3BRS094UmM0RjRMNU02NGZCOGJLaHhNUFdTeEE2OV9hZTlDaWdGayIsIngiOiIxWVBFOXVXOUluWjF3NVFnbHg4X1BJTTdHd3hMd3AyV2dPRndtRVJhRFZjIiwieSI6Ikl6QkE4RjdMVHdCZE5tWlU2WklXQTlhNTU2RkNsS1ZzcDJSNFNVUEV4eWsifQ","publicKeyJwk":{"kty":"EC","crv":"P-256","kid":"YOQ7pQKOxRc4F4L5M64fB8bKhxMPWSxA69_ae9CigFk","x":"1YPE9uW9InZ1w5Qglx8_PIM7GwxLwp2WgOFwmERaDVc","y":"IzBA8F7LTwBdNmZU6ZIWA9a556FClKVsp2R4SUPExyk"}}],"assertionMethod":["did:jwk:eyJrdHkiOiJFQyIsImNydiI6IlAtMjU2Iiwia2lkIjoiWU9RN3BRS094UmM0RjRMNU02NGZCOGJLaHhNUFdTeEE2OV9hZTlDaWdGayIsIngiOiIxWVBFOXVXOUluWjF3NVFnbHg4X1BJTTdHd3hMd3AyV2dPRndtRVJhRFZjIiwieSI6Ikl6QkE4RjdMVHdCZE5tWlU2WklXQTlhNTU2RkNsS1ZzcDJSNFNVUEV4eWsifQ#0"],"authentication":["did:jwk:eyJrdHkiOiJFQyIsImNydiI6IlAtMjU2Iiwia2lkIjoiWU9RN3BRS094UmM0RjRMNU02NGZCOGJLaHhNUFdTeEE2OV9hZTlDaWdGayIsIngiOiIxWVBFOXVXOUluWjF3NVFnbHg4X1BJTTdHd3hMd3AyV2dPRndtRVJhRFZjIiwieSI6Ikl6QkE4RjdMVHdCZE5tWlU2WklXQTlhNTU2RkNsS1ZzcDJSNFNVUEV4eWsifQ#0"],"capabilityInvocation":["did:jwk:eyJrdHkiOiJFQyIsImNydiI6IlAtMjU2Iiwia2lkIjoiWU9RN3BRS094UmM0RjRMNU02NGZCOGJLaHhNUFdTeEE2OV9hZTlDaWdGayIsIngiOiIxWVBFOXVXOUluWjF3NVFnbHg4X1BJTTdHd3hMd3AyV2dPRndtRVJhRFZjIiwieSI6Ikl6QkE4RjdMVHdCZE5tWlU2WklXQTlhNTU2RkNsS1ZzcDJSNFNVUEV4eWsifQ#0"],"capabilityDelegation":["did:jwk:eyJrdHkiOiJFQyIsImNydiI6IlAtMjU2Iiwia2lkIjoiWU9RN3BRS094UmM0RjRMNU02NGZCOGJLaHhNUFdTeEE2OV9hZTlDaWdGayIsIngiOiIxWVBFOXVXOUluWjF3NVFnbHg4X1BJTTdHd3hMd3AyV2dPRndtRVJhRFZjIiwieSI6Ikl6QkE4RjdMVHdCZE5tWlU2WklXQTlhNTU2RkNsS1ZzcDJSNFNVUEV4eWsifQ#0"],"keyAgreement":["did:jwk:eyJrdHkiOiJFQyIsImNydiI6IlAtMjU2Iiwia2lkIjoiWU9RN3BRS094UmM0RjRMNU02NGZCOGJLaHhNUFdTeEE2OV9hZTlDaWdGayIsIngiOiIxWVBFOXVXOUluWjF3NVFnbHg4X1BJTTdHd3hMd3AyV2dPRndtRVJhRFZjIiwieSI6Ikl6QkE4RjdMVHdCZE5tWlU2WklXQTlhNTU2RkNsS1ZzcDJSNFNVUEV4eWsifQ#0"]}

### SDJWTService.createSDJwt ###
SD JWT:
eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJhdWQiOiI0NTYiLCJfc2QiOlsiS1lwMjBWVmdGdGcxRlZ3cGotaV9sbG5pdjZrUG9ON19vUU00UldQUnJaayJdfQ.zgO2wJwwVkELC3okUF2XYHhCy2--WMUXPkh11OscPz2SUPpJ65b35U9AWK_bezaaZEcBS1tOb0qRKIMgfAyS8g~WyItdklPSkFlWG54Z0hKaU43OGZGeTFBPT0iLCJzdWIiLCIxMjMiXQ
SD JWT disclosed all:
eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJhdWQiOiI0NTYiLCJfc2QiOlsiS1lwMjBWVmdGdGcxRlZ3cGotaV9sbG5pdjZrUG9ON19vUU00UldQUnJaayJdfQ.zgO2wJwwVkELC3okUF2XYHhCy2--WMUXPkh11OscPz2SUPpJ65b35U9AWK_bezaaZEcBS1tOb0qRKIMgfAyS8g~WyItdklPSkFlWG54Z0hKaU43OGZGeTFBPT0iLCJzdWIiLCIxMjMiXQ~
SD JWT disclosed all with KB:
eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJhdWQiOiI0NTYiLCJfc2QiOlsiS1lwMjBWVmdGdGcxRlZ3cGotaV9sbG5pdjZrUG9ON19vUU00UldQUnJaayJdfQ.zgO2wJwwVkELC3okUF2XYHhCy2--WMUXPkh11OscPz2SUPpJ65b35U9AWK_bezaaZEcBS1tOb0qRKIMgfAyS8g~WyItdklPSkFlWG54Z0hKaU43OGZGeTFBPT0iLCJzdWIiLCIxMjMiXQ~eyJ0eXAiOiJrYitqd3QiLCJhbGciOiJFUzI1NiJ9.eyJzZF9oYXNoIjoiTHpTa1hrNmZMNjJOM1IyMVFabWhkd215QUdTeXlVVEtSNW50WlhJZEtaTSIsImF1ZCI6InRlc3QtYXVkaWVuY2UiLCJpYXQiOjE3MzMwNjU3NzIsIm5vbmNlIjoidGVzdC1ub25jZSJ9.FZd4OmyebLguoR0T4KsokNv16jQBWhGlqNgTFKNwLqB0dHQrOZqwepWREzEsPXpRfrCeCrW5mHZR4gVM9WCMMQ

### SDJWTService.verifySDJwt ###
JWT payload:
VerificationResult(sdJwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJhdWQiOiI0NTYiLCJfc2QiOlsiS1lwMjBWVmdGdGcxRlZ3cGotaV9sbG5pdjZrUG9ON19vUU00UldQUnJaayJdfQ.zgO2wJwwVkELC3okUF2XYHhCy2--WMUXPkh11OscPz2SUPpJ65b35U9AWK_bezaaZEcBS1tOb0qRKIMgfAyS8g~WyItdklPSkFlWG54Z0hKaU43OGZGeTFBPT0iLCJzdWIiLCIxMjMiXQ~eyJ0eXAiOiJrYitqd3QiLCJhbGciOiJFUzI1NiJ9.eyJzZF9oYXNoIjoiTHpTa1hrNmZMNjJOM1IyMVFabWhkd215QUdTeXlVVEtSNW50WlhJZEtaTSIsImF1ZCI6InRlc3QtYXVkaWVuY2UiLCJpYXQiOjE3MzMwNjU3NzIsIm5vbmNlIjoidGVzdC1ub25jZSJ9.FZd4OmyebLguoR0T4KsokNv16jQBWhGlqNgTFKNwLqB0dHQrOZqwepWREzEsPXpRfrCeCrW5mHZR4gVM9WCMMQ, signatureVerified=true, disclosuresVerified=true, message=null)
verified:
true
signatureVerified:
true
disclosuresVerified:
true
message:
null
sdJwt.algorithm:
ES256
sdJwt.fullPayload:
{"aud":"456","sub":"123"}
sdJwt.undisclosedPayload:
{"aud":"456","_sd":["KYp20VVgFtg1FVwpj-i_llniv6kPoN7_oQM4RWPRrZk"]}
sdJwt.sdPayload:
SDPayload(undisclosedPayload={"aud":"456","_sd":["KYp20VVgFtg1FVwpj-i_llniv6kPoN7_oQM4RWPRrZk"]}, digestedDisclosures={KYp20VVgFtg1FVwpj-i_llniv6kPoN7_oQM4RWPRrZk=SDisclosure(disclosure=WyItdklPSkFlWG54Z0hKaU43OGZGeTFBPT0iLCJzdWIiLCIxMjMiXQ, salt=-vIOJAeXnxgHJiN78fFy1A==, key=sub, value="123")})
sdJwt.disclosures:
[WyItdklPSkFlWG54Z0hKaU43OGZGeTFBPT0iLCJzdWIiLCIxMjMiXQ]
sdJwt.disclosureObjects:
[SDisclosure(disclosure=WyItdklPSkFlWG54Z0hKaU43OGZGeTFBPT0iLCJzdWIiLCIxMjMiXQ, salt=-vIOJAeXnxgHJiN78fFy1A==, key=sub, value="123")]
sdJwt.digestedDisclosures:
{KYp20VVgFtg1FVwpj-i_llniv6kPoN7_oQM4RWPRrZk=SDisclosure(disclosure=WyItdklPSkFlWG54Z0hKaU43OGZGeTFBPT0iLCJzdWIiLCIxMjMiXQ, salt=-vIOJAeXnxgHJiN78fFy1A==, key=sub, value="123")}
sdJwt.keyBindingJwt:
eyJ0eXAiOiJrYitqd3QiLCJhbGciOiJFUzI1NiJ9.eyJzZF9oYXNoIjoiTHpTa1hrNmZMNjJOM1IyMVFabWhkd215QUdTeXlVVEtSNW50WlhJZEtaTSIsImF1ZCI6InRlc3QtYXVkaWVuY2UiLCJpYXQiOjE3MzMwNjU3NzIsIm5vbmNlIjoidGVzdC1ub25jZSJ9.FZd4OmyebLguoR0T4KsokNv16jQBWhGlqNgTFKNwLqB0dHQrOZqwepWREzEsPXpRfrCeCrW5mHZR4gVM9WCMMQ

```

