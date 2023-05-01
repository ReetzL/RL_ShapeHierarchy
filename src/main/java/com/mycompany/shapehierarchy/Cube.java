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
public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return 6 * side * side;
    }

    public double getVolume() {
        return side * side * side;
    }

    public String toString() {
        return String.format("Cube with side %.2f", side);
    }
}

