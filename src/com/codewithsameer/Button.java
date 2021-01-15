package com.codewithsameer;

public class Button extends UIControl{
    @Override
    public void draw() {
        System.out.println("Drawing a button");
    }

    @Override
    public void enable() {
        System.out.println("Enabled");
    }

}
