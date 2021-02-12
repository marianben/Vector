package com.example.demo.SortableShapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {

        int height = 5;
        int width = 7;
        int side = 3;
        int radius = 1;
        int base = 5;

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(radius));
        shapes.add(new Rectangle(height,width));
        shapes.add(new Square(side));
        shapes.add(new Triangle(base,height));

        Collections.sort(shapes);
        for(Shape area : shapes){

            System.out.println( area.getArea());
        }

    }
}


