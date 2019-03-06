package com.Test;

public class Square extends Rectangle implements Drawable{

    public Square(final String color, final double w) {
        super(color);
        W=w;
    }
    @Override
    public double calcArea() {
        return W * W;
    }
}
