package com.oop;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Tanuja",50.00);
        Account account2 = new Account("Avinash",7.53);

        System.out.println(
        );
        System.out.println(
        );

        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit amount for account1:");

        double depositAmount = input.nextDouble();
        System.out.println();
        account1.deposit(depositAmount);


        System.out.println(
        );
        System.out.println(
        );

        System.out.println("Enter deposit amount for account2:");
        depositAmount = input.nextDouble();
        System.out.println();
        account2.deposit(depositAmount);

        System.out.println(
        );
        System.out.println(
        );

    }
}