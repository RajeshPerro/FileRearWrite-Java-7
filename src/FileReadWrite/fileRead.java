/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReadWrite;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Rajesh Ghosh
 * @since 2017-03-10
 */
public class fileRead {
    public static void ReadFromTextFile() throws IOException{
        Path myFile = null;
        try {
            myFile = Paths.get(ClassLoader.getSystemResource("resources/readfile.txt").toURI());
        } catch (URISyntaxException ex) {
            Logger.getLogger(fileRead.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean myFileExists = Files.exists(myFile,new LinkOption[]{ LinkOption.NOFOLLOW_LINKS});
        
        if(!myFileExists){
            System.out.println("Sorry.! your file does not exists.!");
        }
        else
        {
            System.out.println("Reading Your File.\n******-----***------***-----******");
           //The actual code for reading file.....
           byte[] byteArray = Files.readAllBytes(myFile);
            System.out.println(new String(byteArray));
      }
    }
}
