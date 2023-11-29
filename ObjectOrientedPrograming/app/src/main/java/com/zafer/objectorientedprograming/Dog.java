package com.zafer.objectorientedprograming;

public class Dog extends Animals{
    public void test(){
        super.sing();
    }

    public String sing(){
        return "Hello Dog";
    }
}
