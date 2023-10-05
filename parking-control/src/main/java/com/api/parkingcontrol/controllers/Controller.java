package com.api.parkingcontrol.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class Controller {

    @GetMapping
    public String greetings(){
        return "Hello world";
    }
}
