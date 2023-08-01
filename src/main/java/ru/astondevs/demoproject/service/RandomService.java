package ru.astondevs.demoproject.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService {
    public Integer getRandom() {
        Random random = new Random();
        return random.nextInt(10);
    }
}