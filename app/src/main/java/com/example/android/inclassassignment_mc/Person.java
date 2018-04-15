package com.example.android.inclassassignment_mc;

/**
 * Created by mclark on 4/9/18.
 */

public class Person {
    public String id;
    public String name;
    public int age;
    public boolean alive;

    public Person() {}

    public Person(String id, String name, int age, boolean alive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}

