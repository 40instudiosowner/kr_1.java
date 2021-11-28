package com.company;
import java.util.*;
import java.util.Collections;

public class Company
{
    private List<Employee> employees;
    private double Income;
    private boolean Flag;

    public Company(double income) {
         Income = income;
         if (Income > 10000000)
             Flag = true;
         else Flag = false;
         employees = new ArrayList<>();
    }
    public void hire(String str) {
         if (str.equals("top manager"))
              employees.add(new Employee("top manager", Flag));
         else if (str.equals("manager"))
             employees.add(new Employee("manager", Flag));
         else if (str.equals("operator"))
             employees.add(new Employee("operator", Flag));
         else System.out.println("Invalid activity, sir");
    }
    public void fire(int percent) {
         for (int amount = employees.size() * percent / 100 + 1; amount <= employees.size(); amount++)
             employees.remove(amount);
    }
    public void hireAll(String str, int n) {
        if (str.equals("top manager"))
            for (int i = 0; i < n; i++)
            employees.add(new Employee("top manager", Flag));
        else if (str.equals("manager"))
            for (int i = 0; i < n; i++)
            employees.add(new Employee("manager", Flag));
        else if (str.equals("operator"))
            for (int i = 0; i < n; i++)
            employees.add(new Employee("operator", Flag));
        else System.out.println("Invalid activity, sir");
    }
    public double getIncome() {
          return Income;
    }
    public List<Employee> getTopSalaryStaff(int count){
        ArrayList<Double> list = new ArrayList<>(count);
       for (int i = 0; i < count; i++)
           list.set(i, employees.get(i).getMonthSalary());

          Collections.sort(list);
     // List<Employee> emp = new ArrayList<Employee>(count);
       for (int i = 0; i < count; i++)
           employees.get(i).setMonthSalary(list.get(i));
       return employees;
    }
    public List<Employee> getLowestSalaryStaff(int count){
        ArrayList<Double> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++)
            list.set(i, employees.get(i).getMonthSalary());

        Collections.reverse(list);
       // List<Employee> emp = new ArrayList<Employee>(count);
        for (int i = 0; i < count; i++)
            employees.get(i).setMonthSalary(list.get(i));
        return employees;
    }
    public void printStaff( List<Employee> emp, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(emp.get(i).getMonthSalary() + "рублей");
    }
}
