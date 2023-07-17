package ru.astondevs.demoproject.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DateService {
    public String getDate() {
        return LocalDate.now().toString();
    }

    public Integer getDayOfTheYear() {
        return LocalDate.now().getDayOfYear();
    }
}