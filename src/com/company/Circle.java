package com.company;

public class Circle extends Figure implements Moveable {

    private float radius;
    private double PI = 3.1415927;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI*radius*radius;
    }

    @Override
    public float getPerimeter() {
        return (float) ((float) 2*Math.PI*radius);
    }

    @Override
    public void move(float dx, float dy) {
        super.setX( super.getX() + dx );
        super.setY( super.getY() + dy );
    }

    @Override
    public void resize(float koeff) {
        radius = radius * koeff;
    }

    @Override
    public String toString() {
        return "Circle Center: " + '(' + super.getX() + ", " + super.getY() + ')' + " Radius: " + radius;
    }
}
