package com.codewithsameer;

// Abstract class is like an half baked cake. You cannot instantiate it. We cannot create new instance of an abstract class.
public abstract class UIControl {
    //Each widget should know how to draw itself.
    public abstract void draw();
    public abstract void enable();
}
