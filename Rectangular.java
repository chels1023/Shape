/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Random;

/**
 *
 * @author andre
 */
public class Rectangular {  // 14:00
    private int width;
    private int length;
    private static int numOfSide = 4;

    /**
     * Default constructor, random width and length in range [1, 10]
     */
    public Rectangular() {
        int min = 1;
        int max = 10;
        Random rand = new Random();
        this.width = rand.nextInt(max - min + 1) + min;      
        this.length = rand.nextInt(max - min + 1) + min;
    }
    
    /**
     * Constructor with width and length
     * @param width the width of a rectangular
     * @param length the length of a rectangular 
     */
    public Rectangular(int width, int length) {
        this.width = width;
        this.length = length;
    }
    
    /**
     * Copy constructor
     * @param rectangular another constructor 
     */
    public Rectangular(Rectangular rectangular) {
        this.width = rectangular.width;
        this.length = rectangular.length;
    }
    
    /**
     * To calculate the area of a rectangular
     * @return the area of a rectangular
     */
    public int calcArea() {
        return width * length;
    }
    
    /**
     * To calculate the perimeter of a rectangular
     * @return the perimeter of a rectangular
     */
    public int calcPerimeter() {
        return (width + length) * 2;
    }
    
    /**
     * To compare two rectangular
     * @param rectangular another rectangular
     * @return if the two rectangular are the same
     */
    public boolean equals(Rectangular rectangular) {
        return this.width == rectangular.width && this.length == rectangular.length;
    }

    /**
     * To generate a string to represent a rectangular
     * @return a string to represent a rectangular
     */
    @Override
    public String toString() {    
        String str = "";
        
        str += String.format("%-10s: %d\n", "Width", width);
        str += String.format("%-10s: %d\n", "Length", length);
        str += String.format("%-10s: %d\n", "Area", calcArea());
        str += String.format("%-10s: %d\n", "Perimeter", calcPerimeter());
        
        return str;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
