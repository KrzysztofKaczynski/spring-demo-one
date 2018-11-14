package com.luv2code.springdemo;

/**
 * com.luv2code.springdemo Created by MałyKriszo on 2018-11-14.
 */
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day!!!";
    }
}
