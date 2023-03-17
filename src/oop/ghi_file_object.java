/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author Pixel
 */
public class ghi_file_object implements Serializable{
    String ten, ns;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten");
        ten=sc.nextLine();
        System.out.println("Nhap ngay sinh");
        ns=sc.nextLine();
    }
    public void xuat(){        
        System.out.println("Ho ten: "+ten+"\n"+"Ngay sinh: "+ns);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileOutputStream fos=new FileOutputStream(new File("D:\\ghi_file_object.txt"));
        ObjectOutputStream oos=new ObjectOutputStream(fos); 
        ghi_file_object p=new ghi_file_object();
        p.nhap();
        oos.writeObject(p);
        oos.close();
        FileInputStream fis=new FileInputStream("D:\\ghi_file_object.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ghi_file_object p1=(ghi_file_object) ois.readObject();
        p1.xuat();
    }
}
