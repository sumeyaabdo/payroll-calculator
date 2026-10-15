package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        // names
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of employees: ");
        String name = input.nextLine();

        // Hours Worked
        System.out.print("Please enter the hours worked: ");
        float hours = input.nextFloat();

        // Pay Rate
        System.out.print("Please enter the pay rate : ");
        float payRate = input.nextFloat();

        // calculate gross pay
        double grossPay = hours * payRate;

        // print name and gross pay
        System.out.printf(" Name: %s grossPay: %f", name, grossPay);
    }
}
