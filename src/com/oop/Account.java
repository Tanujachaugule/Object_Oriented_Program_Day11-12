package com.oop;

public class Account{
    public Account ( double initialBalance )
    {
        // validate that initialBalance is greater than 0.0;
        // if it is not, balance is initialized to the default value 0.0
        double balance;
        if ( initialBalance > 0.0 )
            balance = initialBalance;
    } // end Account constructor

    // credit (add) an amount to the account
    public void credit( double amount )
    {
        Object balance;    // add amount to balance
    } // end method credit

    // debit (deduct) an amount to the account
    public void debit( double debitAmount )
    {


        double balance = 0;
        if (debitAmount > balance)
        {
            debitAmount = 0.0;
            System.out.println( "Debit amount exceeded account balance." );
        }
        balance = balance - debitAmount;
    } // end method debit

    // return the account balance
    public double getBalance()
    {
        double balance = 0;
        return balance; // gives the value of balance to the calling method
    } // end method getBalance

} // end class Account



