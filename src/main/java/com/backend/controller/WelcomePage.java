package com.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePage {

    @GetMapping("/")
    public ResponseEntity<String> welcome() {
        return new ResponseEntity<>("welcome page", HttpStatus.ACCEPTED);
    }
}
