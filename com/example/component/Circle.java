package com.example.component;

import com.example.component.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("inside Circle draw method");
    }
}
