/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shapehierarchy;

/**
 *
 * @author behlt
 */
public class TestShapes {
 public static void main(String[] args) {
    Shape[] shapes = new Shape[4];
    shapes[0] = new Circle(3.0);
    shapes[1] = new Square(4.0);
    shapes[2] = new Sphere(2.0);
    shapes[3] = new Cube(2.5);

    for (Shape shape : shapes) {
        System.out.println(shape);
        if (shape instanceof TwoDimensionalShape) {
            System.out.printf("Area: %.2f%n", ((TwoDimensionalShape) shape).getArea());
        } else if (shape instanceof ThreeDimensionalShape) {
            System.out.printf("Surface area: %.2f%n", ((ThreeDimensionalShape) shape).getArea());
            System.out.printf("Volume: %.2f%n", ((ThreeDimensionalShape) shape).getVolume());
        }
        System.out.println();
    }
 }
}

    
