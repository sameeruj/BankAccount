package com.codewithsameer;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // create an interface of type Account interface.. With interfaces we can build loosely coupled interfaces.
        // demonstrates encapsulation and data hiding
	    var account = new Account();
	    account.deposit(10);
	    account.withdraw(5);
        System.out.println(account.getBalance());

        // demonstrates abstraction principle. This means the end user do not need to know the hidden complexities.
        var mailService = new MailService();
        mailService.sendEmail();

        // Inheritance demonstration. Code reuse.
        var textBox = new TextBox();
        // you can see enabled gets printed textBox object is inheriting the functions defined in the base class UIControl.
        // Inheritance helps reuse of the code across classes without code duplication.
        textBox.enable();

        //Polymorphism in action. Runtime polymorphism. Function taking different forms. draw() has different implementation in inherited classes.
        //If you see below using the abstract class UIControl we are calling draw function of classes TextBox and Button.
        System.out.println("\n \nDrawing widgets");
        //Object can take different forms. It can behave as TextBox and Button.
        drawUIControl(new TextBox());
        drawUIControl(new Button());

        //Jframe
        JFrame frame = new JFrame();
        frame.setTitle("Welcome Sameer!!!");
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }
}
