package ru.astondevs.demoproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.astondevs.demoproject.service.DateService;
import ru.astondevs.demoproject.service.RandomService;

@RestController
public class HelloController {
    @Autowired
    DateService dateService;

    @Autowired
    RandomService randomService;

    @GetMapping("/yo")
    public String hello(@RequestParam(required = false) String name) {
        return "Helloooooo " + (name == null ? "" : name);
    }

    @GetMapping("/hello")
    public String hi() {
        return "Hi, right now is " + dateService.getDate() + ".";
    }

    @GetMapping("/future")
    public String future() {
        return "You will die in " + randomService.getRandom() + " seconds";
    }
}