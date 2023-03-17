/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Pixel
 */
public class doc_ghi_file_nguyen_thuy {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File f=new File("D:\\file_nt.txt");
        FileOutputStream fos=new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(5);
        dos.writeInt(7);
        dos.close();
        FileInputStream fis=new FileInputStream("D:\\file_nt.txt");
        DataInputStream dis=new DataInputStream(fis);
        System.out.println("Doc tu file:"+dis.readInt());
        dis.close();
    }
}
