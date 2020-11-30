/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Random;

/**
 *
 * @author Chelsea
 */
public class Ellipse {
    private double majorAxis;
    private double minorAxis;

    public Ellipse() {
        Random rand = new Random();
        int minNum = 5;
        int maxNum = 10;
        
        this.majorAxis = rand.nextInt(maxNum - minNum + 1) + minNum;
        this.minorAxis = rand.nextInt(maxNum - minNum + 1) + minNum;
    }

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }
    
    public Ellipse(Ellipse ellipse) {
        this.majorAxis = ellipse.majorAxis;
        this.minorAxis = ellipse.minorAxis;
    }
    
    /**
     * To calculate the area of an ellipse
     * @return the area of the ellipse
     */
    public double calcArea() {
        return Math.PI * minorAxis * majorAxis;
    }
    
    /**
     * To calculate the area of an ellipse
     * @return the area of the ellipse
     */
    public double calcPerimeter() { 
        return (2 * Math.PI) * (Math.sqrt((Math.pow(majorAxis, 2) + 
                Math.pow(minorAxis, 2)) / 2));
    }
    
    /**
     * Checks if the ellipse is a circle by checking if the major and minor axis
     * are equal to each other
     * @return true if the major axis and minor axis are equal to each other and 
     * false if they are not
     */
    public boolean isCrcle() {
        return majorAxis == minorAxis;
    }
    
    /**
     * Checks if the axis is valid by checking if it is less than or equal to 0
     * @return true if the axis is bigger than 0 or false if it is not
     */
    public boolean isAxisValid() {
        return minorAxis > 0 || majorAxis > 0;
    }
    
    @Override
    public String toString() { 
        String str = "";
        
        str += String.format("%-10s : %.5s\n", "Major-Axis", majorAxis);
        str += String.format("%-10s : %.5s\n", "Minor-Axis", minorAxis);
        str += String.format("%-10s : %.5s\n", "Area", calcArea());
        str += String.format("%-10s : %.5s\n", "Perimeter", calcPerimeter());

        if(isCrcle())
            return String.format(str + "This ellipse is not a circle");
        else 
            return str;
    }
    
    public boolean equals(Ellipse ellipse) {
        return this.minorAxis == ellipse.minorAxis && 
                this.majorAxis == ellipse.majorAxis;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        if(isAxisValid())
            this.majorAxis = majorAxis;
        else 
            System.out.println("the new value must be a positive value");
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        if(isAxisValid())
            this.minorAxis = minorAxis;
        else 
            System.out.println("the new value must be a positive value");
    }
}
