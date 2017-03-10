/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import FileReadWrite.fileRead;
import FileReadWrite.fileWrite;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rajesh
 */
public class Main {
    public static void main(String [ ] args) throws IOException
    {
        String data;
        fileRead fr = new fileRead();
        fr.ReadFromTextFile();
        
        fileWrite fw  = new fileWrite();
        Scanner sc = new Scanner(System.in);
        System.out.println("Write something for writing in File : ");
        data = sc.nextLine();
        
        fw.WriteInTextFile(data);
    }
}
