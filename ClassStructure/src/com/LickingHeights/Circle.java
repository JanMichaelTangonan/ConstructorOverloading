package com.LickingHeights;

public class Circle {

private int diameter;

public Circle(int diameter) {
    this.diameter = diameter;
}

public int getDiameter() {
    return diameter;
}

public double getArea(){
    double radius = this.diameter/2;
    double pi = Math.PI;
    return pi*Math.pow(radius,2);
}

public double getPerimeter(){
    double radius = this.diameter/2;
    return 2*Math.PI*radius;
}










}
