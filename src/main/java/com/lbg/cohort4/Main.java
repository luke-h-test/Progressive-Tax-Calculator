package com.lbg.cohort4;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    double salaryInput()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your salary:");
        double userSalaryInput = parseDouble(sc.nextLine());
        return userSalaryInput;

    }
    double taxCalculator(double salary)
    {
        double totalTaxSum = 0;
        double tempSalary = salary;

        double[] rates = {0.25, 0.2, 0.15, 0.1, 0};
        double[] boundaries = {45000, 30000, 20000, 15000, 0};

        for (int i = 0; i < rates.length ; i++)
        {
            if(tempSalary >= boundaries[i])
            {
                totalTaxSum += rates[i] * (tempSalary - (boundaries[i] -1));
                tempSalary = boundaries[i] - 1;
            }
        }

        return totalTaxSum;

    }
    public static void main(String[] args) {

        Main mm = new Main();
        double salary = mm.salaryInput();

        double taxPaid = mm.taxCalculator(salary);

        System.out.println("The total tax to pay on a salary of " + salary + " is: " + taxPaid);



    }
}