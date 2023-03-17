/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author Pixel
 */
public class MyDate {
    private int day, month, year;
    
    public MyDate(){
        day=1;
        month=1;
        year=2014;
        System.out.println("a new date created");
    }
    
    public MyDate(MyDate d){
        day=d.day;
        month=d.month;
        year=d.year;
    }
    
    public int getYear(){
        return year;
    }
    
    public static void main(String[] args){
        MyDate d=new MyDate();
        MyDate d1=new MyDate(d);
        System.out.println("Year: "+d1.getYear());
    }
}
