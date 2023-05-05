package com.inaracademy.springcoredemo;

import org.springframework.stereotype.Component;


@Component
public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Practice first touch for 15 minutes!!!";
    }
}
