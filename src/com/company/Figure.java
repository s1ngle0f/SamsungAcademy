package com.company;

public abstract class Figure {
    private float x;
    private float y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    abstract public float getArea();
    abstract public float getPerimeter();
}
