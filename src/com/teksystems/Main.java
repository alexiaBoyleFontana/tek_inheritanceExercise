package com.teksystems;

public class Main {

    public static void main(String[] args) {

        Manager m1 = new Manager (126534, "Peter", "Chennai India", 237844);
        m1.calculateSalary();
        Trainee m2 = new Trainee (29846, "Jack", "Mumbai India", 442085);
        m2.calculateSalary();

        m1.calculateTransportAllowance();
        m2.calculateTransportAllowance();
    }
}
