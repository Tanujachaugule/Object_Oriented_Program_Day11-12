package com.oop;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {


    {
        Account account1 = new Account( 50.00 ); // create Account object
        Account account2 = new Account( -7.53 ); // create Account object

        // display initial balance of each object
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

        // create Scanner to obtain input from command window
        Scanner input = new Scanner ( System.in );
        double withdrawAmount; // debit amount read from user

        System.out.print( "Enter debit amount for account1: " ); // prompt
        withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf("\ndeducting %.2f from account1 balance\n\n", withdrawAmount );
        account1.debit(withdrawAmount); // deduct from account1 balance

        // display balances
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

        System.out.print( "Enter withdraw amount for account2: "); // prompt
        withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf( "\ndeducting %.2f from account2 balance\n\n", withdrawAmount );
        account2.debit( withdrawAmount ); //deduct from account2 balance

        // display balances
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
    } // end main
} // end class AccountTest

    }