package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //HR Team User
        //X - Greet User
        //? - Tell them how it works - Use for end user
        //X - User enters info
        //X - - First Name
        //X - - Last Name
        //X - - Employee Number
        //X - - Annual Salary
        //X - Salary Breakdown
        //X - - Monthly - paid 12 times
        //X - - Twice a month - paid 24 times
        //X - - Every two weeks - paid 26 times
        //X - Ask user if another employee?
        //X - - If yes, repeat
        //X - - If no, close

        Boolean ask = true;
        Scanner sc = new Scanner(System.in);


            System.out.println("Welcome to the HR Salary Calculator!");
            System.out.println("This application will calculate an employee's monthly, Bi-monthly and Every two weeks Salary.");
            System.out.println("");
            while (ask){
            System.out.println("Please enter Employee First Name:");
            String firstName = sc.nextLine();
            System.out.println("Please enter Employee Last Name:");
            String lastName = sc.nextLine();
            System.out.println("Please enter Employee ID Number:");
            String id = sc.nextLine();
            System.out.println("Please enter Employee Annual Salary:");


//            List<String> answers = new ArrayList<>();
//
//            for (int i = 0; i < questions.length; i++) {
//                System.out.println(questions[i]);
//                String userEntry = sc.nextLine();
//                answers.add(userEntry);
//
//            }

            String salaryString = sc.nextLine();
            double salary = Integer.parseInt(salaryString);

            double monthlySalary = salary / 12;
            double twiceMonthSalary = salary / 24;
            double everyTwoWeeksSalary = salary / 26;

            System.out.println("Monthly Salary: " + monthlySalary);
            System.out.println("Twice a Month Salary: " + twiceMonthSalary);
            System.out.println("Paid every two weeks Salary: " + everyTwoWeeksSalary);

            Employee employee1 = new Employee(firstName, lastName, id, salary, monthlySalary, twiceMonthSalary, everyTwoWeeksSalary);

            System.out.println("(Summary - Employee Name:" + employee1.firstName + " " + employee1.lastName + "," + " Employee ID:" + employee1.id + "," + " " + "Annual Salary:" + employee1.salary + "," +
                   " " + "Monthly Salary:" + employee1.monthlySalary + "," + " " + "Twice a Month Salary:" + employee1.twiceAMonthSalary + "," + " " + "Every Two Weeks Salary:" + employee1.everyTwoWeeksSalary + ")");
            System.out.println("Do you want to enter another employee?");
            String responseFromUser = sc.nextLine();
            if (responseFromUser.equalsIgnoreCase("yes") ||
                    responseFromUser.equalsIgnoreCase("y")) {
                ask = true;
            } else {
                ask = false;
            }




    }
}}
