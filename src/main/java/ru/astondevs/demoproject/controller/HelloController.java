package ru.astondevs.demoproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.astondevs.demoproject.service.DateService;

@RestController
public class HelloController {
    @Autowired
    DateService dateService;

    @GetMapping("/yo")
    public String hello(@RequestParam(required = false) String name) {
        return "Helloooooo " + (name == null ? "" : name);
    }

    @GetMapping("/hello")
    public String hi() {
        return "Hi, right now is " + dateService.getDate() + ".";
    }
}