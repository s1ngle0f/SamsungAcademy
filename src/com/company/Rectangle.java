package com.company;

public class Rectangle extends Figure implements Moveable {

    private float height;
    private float width;

    public Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public float getArea() {
        return height*width;
    }

    @Override
    public float getPerimeter() {
        return 2*(height+width);
    }

    @Override
    public void move(float dx, float dy) {
        super.setX( super.getX() + dx );
        super.setY( super.getY() + dy );
    }

    @Override
    public void resize(float koeff) {
        height = height * koeff;
        width = width * koeff;
    }

    @Override
    public String toString() {
        return "Rectangle Center: " + '(' + super.getX() + ", " + super.getY() + ')' + " Height: " + height + " Width: " + width;
    }
}
