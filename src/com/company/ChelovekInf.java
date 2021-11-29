package com.company;

public class ChelovekInf {
    int age;
    String name;
    public ChelovekInf(int age,String name){
        this.age = age;
        this.name = name;
        System.out.println("(" + name + " " + age + ")");
    }
    public ChelovekInf(){}
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}
