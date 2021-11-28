package com.company;

public class Employee
{
    private double salary;

    public Employee(String str, boolean flag){
        if (str.equals("top manager")) {
            TopManager topManager = new TopManager(flag);
            this.salary = topManager.getMonthSalary();
        }
        else if (str.equals("manager")) {
            Manager manager = new Manager();
            this.salary = manager.getMonthSalary();
        }
        else if (str.equals("operator")) {
            Operator operator = new Operator();
            this.salary = operator.getMonthSalary();
        }
    }
    public Employee(){
        this.salary = 0;
    }
    public double getMonthSalary() {
        return this.salary;
    }
    public void setMonthSalary(double n){
        this.salary = n;
    }
}
