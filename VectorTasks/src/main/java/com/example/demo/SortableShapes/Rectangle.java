package com.example.demo.SortableShapes;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return height*width;
    }

    public int compareTo(Shape other){
        return Double.compare(this.getArea(),other.getArea());
    }

}
