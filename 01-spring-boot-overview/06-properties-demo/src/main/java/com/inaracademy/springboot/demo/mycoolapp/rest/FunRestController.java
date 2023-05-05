package com.inaracademy.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    @Value("${initial.message}")
    private String name;

    @Value("${team.name}")
    private String teamName;

    @Value("${player.name}")
    private String playerName;

    // expose '/' endpoint that return "Hello World"
    @GetMapping("/teamInfo")
    public String getHello(){
        return String.format("Player Name : %s\nTeam Name :%s",playerName,teamName);
    }

    // expose '/' endpoint that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return name;
    }

    // expose '/workout' endpoint that return daily activity
    @GetMapping("/workout")
    public String getDailyWorkOut(){
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is your lucky day";
    }

}
