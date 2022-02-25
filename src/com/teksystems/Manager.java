package com.teksystems;

public class Manager extends Employee {

    Manager (long id, String name, String address, long phone) {
        super(id,name,address,phone);
        this.setBasicSalary(65000);
    }

    @Override
    public void calculateTransportAllowance () {
        double transportAllow = getSalary() * 0.15;
        System.out.println("Transport Allowance: " + transportAllow);
    }
}
