package com.codewithsameer;

public class Main {

    public static void main(String[] args) {
        // create an interface of type Account interface.. With interfaces we can build loosely coupled interfaces.
        // demonstrates encapsulation and data hiding
	    var account = new Account();
	    account.deposit(10);
	    account.withdraw(5);
        System.out.println(account.getBalance());

        // demonstrates abstraction principle.
        var mailService = new MailService();
        mailService.sendEmail();

        // Inheritance demonstration
        var textBox = new TextBox();
        // you can see enabled gets printed textBox object is inheriting the functions defined in the base class UIControl.
        // Inheritance helps reuse of the code across classes without code duplication.
        textBox.enable();
    }
}
