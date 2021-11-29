package com.company;

public class Main {

    public static void main(String[] args) {
        ChelovekInf inf = new ChelovekInf(43,"Alex");
        /*inf.setAge(23);
        inf.setName("Vlada");*/ //можно входные данные задать и так
        Naslednik2 nasl = new Naslednik2(43,"Masha","BMW");
        Person p = new Person();
        nasl.Employee();
    }
}
