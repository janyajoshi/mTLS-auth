package com.mtls.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/base-api")
public class BasicController {

    @GetMapping
    public Mono<String> message(){
        return Mono.just("Hello");
    }
}
