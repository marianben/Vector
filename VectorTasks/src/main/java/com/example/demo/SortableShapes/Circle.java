package com.example.demo.SortableShapes;

class Circle extends Shape{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*(radius*radius);
    }
    
    public int compareTo(Shape other){
        return Double.compare(this.getArea(),other.getArea());
    }
}