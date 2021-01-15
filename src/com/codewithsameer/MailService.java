package com.codewithsameer;

public class MailService {
    public void sendEmail(){
        connect();
        Authenticate();
        sendTheEmail();
        disconnect();
    }

    private  void connect(){
        System.out.println("Connect to a mail server");
    }

    private void Authenticate(){
        System.out.println("Authenticate the email");
    }

    private void sendTheEmail(){
        System.out.println("Send an email");
    }

    private void disconnect(){
        System.out.println("Disconnect from the email server");
    }

}
