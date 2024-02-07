package com.example.component;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {

        if(shapeType == "Circle") {
            return new Circle();
        }

        if(shapeType == "Square") {
            return new Square();
        }

        if(shapeType == "Rectangle") {
            return new Rectangle();
        }
        return null;
    }
}
