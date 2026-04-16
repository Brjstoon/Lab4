package org.example;

public class Rectangle extends Shape{
    public double height;
    public double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int x, int y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return getHeight() * getWidth() ;
    }
    @Override
    public double calculateCircumference() {
        return 2 * (getHeight() + getWidth() );
    }
}
