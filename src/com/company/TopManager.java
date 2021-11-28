package com.company;

public class TopManager
{
    private double salary;
    private int fixedPart = 20000;

    public TopManager(boolean flag) {
        if (flag == true)
            this.salary = fixedPart + 1.5 * fixedPart;
        else this.salary = fixedPart;
    }
    public double getMonthSalary() {
        return this.salary;
    }
}
