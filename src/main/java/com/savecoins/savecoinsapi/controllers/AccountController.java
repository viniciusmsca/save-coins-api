package com.savecoins.savecoinsapi.controllers;

import com.savecoins.savecoinsapi.controllers.request.CreateAccountRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "account")
public class AccountController {

    @PostMapping
    public ResponseEntity<Void> createAccount(@Validated @RequestBody CreateAccountRequest body) {
        return ResponseEntity.ok().build();
    }

}
