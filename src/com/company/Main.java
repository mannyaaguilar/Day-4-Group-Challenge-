package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<String> hrQuestions = new ArrayList();

        hrQuestions.add("Enter employee's first name:");
        hrQuestions.add("Enter employee's last name:");
        hrQuestions.add("Enter employee's ID #:");
        hrQuestions.add("Enter employee's annual salary:");

        String[] userResponses = {"firstName = sc.nextLine()", "lastName = sc.nextLine()", "employeeNum = sc.nextLine()", "annualSalary = sc.nextLine()"};

        System.out.println("Hello.  Welcome to HR Salary Calculator. Enter employee information to calculator annual salary broken out by monthly, bi-monthly and every two weeks.");
        Scanner sc = new Scanner(System.in);

        Boolean ask = true;

        while (ask) {
            System.out.println("Do you want to enter an employee's information?");
            String userAnswer = sc.nextLine();
            if (userAnswer.equals("Yes")) {

                ask = true;

                System.out.println(hrQuestions[0]);
                String annualSalary = sc.nextLine();

                int calcSalary = Integer.parseInt(annualSalary);

                System.out.println("Monthly Salary: $" + calcSalary / 12);
                System.out.println("Bi-Monthly Salary: $" + calcSalary / 24);
                System.out.println("Salary every two weeks: $" + calcSalary / 26);
            } else {
                ask = false;
                System.out.println("Thank you for using the HR Salary Calculator");


//        System.out.println("Hello.  Welcome to HR Salary Calculator. Enter employee information to calculator annual salary broken out by monthly, bi-monthly and every two weeks.");
//        Scanner sc = new Scanner(System.in);
//
//        Boolean ask = true;
//        while (ask) {
//            System.out.println("Do you want to enter an employee's information?");
//            String userAnswer = sc.nextLine();
//            if (userAnswer.equals("Yes")) {
//
//                ask = true;
//
//                System.out.println("Enter employee's first name:");
//                String firstName = sc.nextLine();
//
//                System.out.println("Enter employee's last name:");
//                String lastName = sc.nextLine();
//
//                System.out.println("Enter employee's ID #:");
//                String employeeNum = sc.nextLine();
//
//                System.out.println("Enter employee's annual salary:");
//                String annualSalary = sc.nextLine();
//
//                int calcSalary = Integer.parseInt(annualSalary);
//
//                System.out.println("Monthly Salary: $" + calcSalary / 12);
//                System.out.println("Bi-Monthly Salary: $" + calcSalary / 24);
//                System.out.println("Salary every two weeks: $" + calcSalary / 26);
//            } else {
//                ask = false;
//                System.out.println("Thank you for using the HR Salary Calculator");


//            }
//
//        }
//    }
            }
        }
    }
}
