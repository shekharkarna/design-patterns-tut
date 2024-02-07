package com.example;

import com.example.component.Shape;
import com.example.component.ShapeFactory;

public class DemoClass {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("Square");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("Rectangle");
        shape3.draw();
    }
}
