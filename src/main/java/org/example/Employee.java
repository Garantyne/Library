package org.example;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Objects;

public class Employee {
    private String firstName;
    private String twoName;
    private String lastName;
    private int salary;
    private int department;
    private final int id;
    public static int idCounter = 0;

    public Employee(String firstName,String twoName, String lastName,int salary, int department){
        if(StringUtils.isEmpty(firstName)){
            throw new RuntimeException("400 Bad Request");
        }else {
            this.firstName = StringUtils.capitalize(firstName);
        }
        if(StringUtils.isEmpty(twoName)){
            throw new RuntimeException("400 Bad Request");
        }else {
            this.twoName = StringUtils.capitalize(twoName);
        }
        if(StringUtils.isEmpty(lastName)){
            throw new RuntimeException("400 Bad Request");
        }else {
            this.lastName = StringUtils.capitalize(lastName);
        }
        this.salary = salary;
        this.department = department;
        this.id = idCounter;
        idCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTwoName() {
        return twoName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setTwoName(String twoName) {
        this.twoName = twoName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Работник " +
                " Имя " + firstName + '\'' +
                " Отчество " + twoName + '\'' +
                " Фамилия " + lastName + '\'' +
                " Зарплата " + salary +
                " Отдел " + department +
                " id= " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department &&
                id == employee.id && firstName.equals(employee.firstName) &&
                twoName.equals(employee.twoName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, twoName, lastName, salary, department);
    }

}