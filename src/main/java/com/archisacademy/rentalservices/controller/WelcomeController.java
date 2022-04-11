package com.archisacademy.rentalservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/welcome")
    public String welcomeToTriaining() {
        return "hello from archis";
    }

    @GetMapping(value = "/hello")
    public String helloToTriaining() {
        return "hello to training";
    }

    @GetMapping(value = "/spotless")
    public String helloToSpotless() {
        return "hello to spotless";
    }
}
