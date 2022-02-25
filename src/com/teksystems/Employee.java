package com.teksystems;

public class Employee {
    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long employeePhone;
    private double basicSalary;
    private double specialAllowance;
    private double hra;

    Employee (long id, String name, String address, long phone) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.specialAllowance = 250.8;
        this.hra = 1000.50;
    }

    public void setBasicSalary (double salary) {
        this.basicSalary = salary;
    }

    public void calculateSalary () {
        double salary = getSalary();
        System.out.println("Salary: " + salary);
    }

    public double getSalary () {
        //the problem said that calculateSalary had to output to console, so helper method
        return (basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100));
    }

    public void calculateTransportAllowance () {
        double transportAllow = getSalary() * 0.1;
        System.out.println("Transport Allowance: " + transportAllow);
    }
}
