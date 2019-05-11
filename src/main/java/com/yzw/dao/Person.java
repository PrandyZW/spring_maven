package com.yzw.dao;

/**
 * Created by yzw on 2017/12/20.
 */
public class Person {
    private String name;

    private int age;

    private void sayHi(){
        System.out.println("hi");
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
}

