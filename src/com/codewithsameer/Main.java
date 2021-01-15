package com.codewithsameer;

public class Main {

    public static void main(String[] args) {
	    var account = new Account();
	    account.deposit(10);
	    account.withdraw(5);
        System.out.println(account.getBalance());
        System.out.println("EOF");

        var mailService = new MailService();
        mailService.sendEmail();
    }
}
