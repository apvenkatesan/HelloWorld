package com.venkat.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping("/{name}")
    public String sayHello(@PathVariable(value = "name", required = false) String name) {
        return "Hi " + name + " Welcome.";
    }
}
