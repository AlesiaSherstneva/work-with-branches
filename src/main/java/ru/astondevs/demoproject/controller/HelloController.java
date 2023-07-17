package ru.astondevs.demoproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/yo")
    public String hello(@RequestParam(required = false) String name) {
        return "Helloooooo " + (name == null ? "" : name);
    }

    @GetMapping("/hello")
    public String hi() {
        return "Hi";
    }
}