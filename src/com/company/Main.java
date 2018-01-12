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

        while(ask) {
            System.out.println("Welcome to thee HR application.");
            System.out.println("***PLACEHOLDER - HOW IT WORKS***");

            String[] questions = {
                    "Please enter Employee First Name:",
                    "Please enter Employee Last Name:",
                    "Please enter Employee Number:",
                    "Please enter Employee Salary:"
            };

            List<String> answers = new ArrayList<>();

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                String userEntry = sc.nextLine();
                answers.add(userEntry);
            }

            String salaryString = answers.get(3);
            int salary = Integer.parseInt(salaryString);

            int monthlySalary = salary / 12;
            int twiceMonthSalary = salary / 24;
            int everyTwoWeeksSalary = salary / 26;

            System.out.println("Monthly Salary: " + monthlySalary);
            System.out.println("Twice a Month Salary: " + twiceMonthSalary);
            System.out.println("Paid every two weeks Salary: " + everyTwoWeeksSalary);

            System.out.println("Do you want to enter another employee?");
            String responseFromUser = sc.nextLine();
            if (responseFromUser.equalsIgnoreCase("yes") ||
                    responseFromUser.equalsIgnoreCase("y")) {
                ask = true;
            } else {
                ask = false;
            }
        }
    }
}