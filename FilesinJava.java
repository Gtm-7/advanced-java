
package advancedjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesinJava {
    public static void main(String[] args) {
        // code to create file
    /*    File myFile = new File("textfile.txt");
        try{
            myFile.createNewFile();
        }
        catch (Exception e){
            e.getMessage();
        }
        try {
            FileWriter fileWriter = new FileWriter("textfile.txt");
            fileWriter.write("This the first time creating and writing a string in program generated file\n bye bye bro \n OMGG ");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        File myFile = new File("textfile.txt");
        try {
            Scanner sc = new Scanner(myFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
