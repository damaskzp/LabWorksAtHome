package com.Test;

class Rectangle extends Shape implements Comparable {
    protected double W;
    private double H;

    public Rectangle(String color, double w, double h) {
        super(color);
        W = w;
        H = h;
    }

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public double calcArea() {
        return W*H;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "W=" + W +
                ", H=" + H +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
