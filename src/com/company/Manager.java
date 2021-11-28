package com.company;

public class Manager
{
    private int fixedPart = 20000;
    private double salary = fixedPart + 0.05 * (115000 + Math.random() * 25000);

    public double getMonthSalary() {
        return this.salary;
    }
}
