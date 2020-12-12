package com.company;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 1);
        Rectangle rectangle = new Rectangle(10, 10, 1, 1);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Moveable m = new Moveable() {
            @Override
            public void resize(float koeff) {
            }
            @Override
            public void move(float dx, float dy) {
            }
        };
        circle.resize(2);
        rectangle.resize(2);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
        circle.move(2,3);
        rectangle.move(2,3);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
    }

}
