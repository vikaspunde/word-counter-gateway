package com.word.counter.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @GetMapping("/defaultFallback")
    public String getDefaultMessage() {
        return "The service is temporary unavailable";
    }

}
