package com.teksystems;

public class Trainee extends Employee {

    Trainee (long id, String name, String address, long phone) {
        super(id,name,address,phone);
        this.setBasicSalary(45000);
    }
}
