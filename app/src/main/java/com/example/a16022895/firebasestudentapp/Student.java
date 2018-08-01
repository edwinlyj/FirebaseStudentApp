package com.example.a16022895.firebasestudentapp;

import java.io.Serializable;

public class Student implements Serializable{

    private String name;
    private int age;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Student(){

    }

    @Override
    public String toString() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
