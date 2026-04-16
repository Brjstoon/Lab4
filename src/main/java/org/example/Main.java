package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        //-------Circle Test---------//
        Circle c = new Circle(6.5);
        System.out.println( "Initial Radius: " + c.getRadius());
        System.out.println( "The Area for a circle with 6.5 radius: "+ String.format("%.2f" , c.calculateArea()));
        System.out.println("The Circumference for a circle with 6.5 radius: " + String.format("%.2f" , c.calculateCircumference()));
        c.setRadius(8);
        System.out.println("Setting the radius to 8.");
        System.out.println( "The Area for a circle with 8 radius: "+ String.format("%.2f" , c.calculateArea()));
        System.out.println("The Circumference for a circle with 8 radius: " + String.format("%.2f" , c.calculateCircumference()));


        System.out.println("\n");


        //--------Rectangle Test---------//
        Rectangle r = new Rectangle(3 , 4);
        System.out.println("The Area of a Rectangle with " + r.getWidth() + " Width and " + r.getHeight() + " Height = " + String.format("%.2f" , r.calculateArea()));
        System.out.println("The Perimeter of a Rectangle with " + r.getWidth() + " Width and " + r.getHeight() + " Height = " + String.format("%.2f" , r.calculateCircumference()));
        r.setHeight(5);
        r.setWidth(6);
        System.out.println("The Area of a Rectangle with " + r.getWidth() + " Width and " + r.getHeight() + " Height = " + String.format("%.2f" , r.calculateArea()));
        System.out.println("The Perimeter of a Rectangle with " + r.getWidth() + " Width and " + r.getHeight() + " Height = " + String.format("%.2f" , r.calculateCircumference()));


        System.out.println("\n");

        //--------Triangle Test---------//
        Triangle t = new Triangle(7 , 9);
        System.out.println("The Area of a Triangle with " + t.getBase() + " Width and " + t.getHeight() + " Height = " + String.format("%.2f" , t.calculateArea()));
        System.out.println("The Perimeter of a Triangle with " + t.getBase() + " Width and " + t.getHeight() + " Height = " + String.format("%.2f" , t.calculateCircumference()));
        t.setHeight(5);
        t.setBase(6);
        System.out.println("The Area of a Triangle with " + t.getBase() + " Width and " + t.getHeight() + " Height = " + String.format("%.2f" , t.calculateArea()));
        System.out.println("The Perimeter of a Triangle with " + t.getBase() + " Width and " + t.getHeight() + " Height = " + String.format("%.2f" , t.calculateCircumference()));







    }
}