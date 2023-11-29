package com.zafer.objectorientedprograming;

public class Mucusian {
    private String Name;
    private String Insturment;

    public void setAge(int age , String password) {
        if (password == "123"){
            Age = age;
        }
    }

    private int Age;

    public String getName() {
        return Name;
    }

    public String getInsturment() {
        return Insturment;
    }

    public int getAge() {
        return Age;
    }

    public Mucusian(String name, String insturment, int age) {
        this.Name = name;
        this.Insturment = insturment;
        this.Age = age;
    }
}
