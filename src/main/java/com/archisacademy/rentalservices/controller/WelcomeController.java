package com.archisacademy.rentalservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/welcome")
    public String welcomeToTriaining() {
        return "hello from archis";
    }

    @GetMapping(value = "/welcome")
    public String helloToTriaining() {
        return "hello to training";
    }
}
