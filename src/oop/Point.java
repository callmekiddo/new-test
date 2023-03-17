/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import oop.Shape;

/**
 *
 * @author Pixel
 */
public class Point extends Shape{
    protected int x, y;
    public Point(int xx, int yy) {
    	x = xx;  y = yy;
    }
    public void draw() {
    	System.out.println("(" + x + "," + y + ")");
    }
    public static void main(String args[]){
        Point p=new Point(10,10);
    }
}
