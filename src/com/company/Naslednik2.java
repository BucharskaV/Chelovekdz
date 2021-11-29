package com.company;

public class Naslednik2 extends ChelovekInf{
    String Employee;
    public Naslednik2(int age,String name, String Employee){
        this.age = age;
        this.name = name;
        this.Employee = Employee;
        System.out.println("(" + name + " " + age + " "+ Employee + ")");
    }
    public String getEmployee() {
        return Employee;
    }
    public void setEmployee(String name) {
        this.Employee = Employee;
    }
    void Employee(){
        System.out.println("Manager");
    }

}
