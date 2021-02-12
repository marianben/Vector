package com.example.demo.SortableShapes;

public class Triangle extends Shape{

    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return (base*height)/2;
    }

    public int compareTo(Shape other){
        return Double.compare(this.getArea(),other.getArea());
    }

}
