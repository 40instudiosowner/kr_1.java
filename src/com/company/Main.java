package com.company;

import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
         Company hooli = new Company(10000000);
         hooli.hireAll("operator", 180);
         hooli.hireAll("manager", 80);
         hooli.hireAll("top manager", 10);
        System.out.println("Самые высокие зарплаты: ");

        hooli.printStaff(hooli.getLowestSalaryStaff(10), 10);
        System.out.println("Самые низкие зарплаты: ");
        hooli.printStaff(hooli.getTopSalaryStaff(30), 30);
        hooli.fire(50);
        System.out.println("После увольнения 50%: ");
        System.out.println("Самые высокие зарплаты: ");
        hooli.printStaff(hooli.getLowestSalaryStaff(10), 10);
        System.out.println("Самые низкие зарплаты: ");
        hooli.printStaff(hooli.getTopSalaryStaff(30), 30);
    }
}
