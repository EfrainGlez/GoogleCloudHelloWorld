package com.efrain.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    String sayHello() {
        return "Hola Efra desde Google Cloud!";
    }
}
