package com.example.demo.SortableShapes;

public class Square extends Shape{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }

    public int compareTo(Shape other){
        return Double.compare(this.getArea(),other.getArea());
    }

}
