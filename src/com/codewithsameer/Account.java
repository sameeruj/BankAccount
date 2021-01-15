package com.codewithsameer;
// Object of type class Account have methods deposit, withdraw, get balance is an interface that is a contract that specifies the capabilities that a class can provide.
// Demonstrates the Encapsulation concept of OOP
// Bundles data and methods into one unit of a class (Encapsulation) hiding the values/data using private access specifier (Data Hiding).
// With this we can create robust apps and prevent an object going into an invalid state.
public class Account {
    private float balance;

    public void deposit(float amount){
        if(amount > 0)
            this.balance +=amount;
    }

    public void withdraw(float amount){
        if(amount > 0)
            balance -= amount;
    }

    public float getBalance(){
        return this.balance;
    }

}
