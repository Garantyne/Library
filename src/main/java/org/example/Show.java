package org.example;

public class Show {
    public static void showEmployees(Employee[] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int sumUpTheSalary(Employee[] arr){
        int summ = 0;
        for(int i = 0; i < arr.length; i++){
            summ+=arr[i].getSalary();
        }
        return summ;
    }
    public static String showMinimumWage(Employee[]arr){
        int min = arr[0].getSalary();
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(min > arr[i].getSalary()){
                min = arr[i].getSalary();
                j = i;
            }
        }
        return arr[j].getLastName();
    }
    public static String showTheMaximumSalary(Employee[]arr){
        int max = arr[0].getSalary();
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(max<arr[i].getSalary()){
                max=arr[i].getSalary();
                j = i;
            }
        }
        return arr[j].getLastName();
    }
    public static double showAverageSalary(Employee[] arr){
        double summ = 0;
        for(int i = 0; i < arr.length; i++){
            summ+=arr[i].getSalary();
        }
        return summ / arr.length;
    }
    public static void showEmployeeNames(Employee[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].getLastName()+ " " + arr[i].getFirstName()+ " "+arr[i].getTwoName());
        }
    }
}