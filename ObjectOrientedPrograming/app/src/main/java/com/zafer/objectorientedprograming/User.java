package com.zafer.objectorientedprograming;

public class User extends People{
    String Name;
    String Surname;
    int Age;

    public User(String name, String surname, int age) {
        this.Name = name;
        this.Surname = surname;
        this.Age = age;
    }
}
