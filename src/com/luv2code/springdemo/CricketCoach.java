package com.luv2code.springdemo;

/**
 * com.luv2code.springdemo Created by MałyKriszo on 2018-11-14.
 */
public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
