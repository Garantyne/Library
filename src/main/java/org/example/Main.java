package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        Main mains = new Main();
        mains.go();
    }
    public static void go(){
        Employee[] Employees = new Employee[6];
        Employees [0] = new Employee("ivan","ivanovich","ivanov",
                10000,1);
        Employees [1] = new Employee("petor","petrovich","petrov",
                11000,2);
        Employees [2] = new Employee("zahar","zaharovich","zaharov",
                12000,3);
        Employees [3] = new Employee("pendos","pendosovich","pendosov",
                13000,4);
        Employees [4] = new Employee("vasili","vasilievich","vasilev",
                14000,5);
        Employees [5] = new Employee(null,"vasilievich","vasilev",
                14000,5);

        Show.showEmployees(Employees);
        System.out.println("Суммарная зарплата " + Show.sumUpTheSalary(Employees));
        System.out.println("минимальная зарплата у " + Show.showMinimumWage(Employees));
        System.out.println("максимальная зарплата у " + Show.showTheMaximumSalary(Employees));
        System.out.println("Средняя зарплата  " + Show.showAverageSalary(Employees));



    }
}