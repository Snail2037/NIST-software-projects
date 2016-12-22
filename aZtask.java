package tasks;
import java.io.*;
import java.util.*;

public class aZtask {
	
	public static void main(String[] args) {
		String fileName = "KLSadd.tex"; //specified file to convert

        try {
            FileReader inputFile = 
                new FileReader(fileName);

            BufferedReader br = //buffers input from the file
                new BufferedReader(inputFile);
            PrintWriter outputFile = (new PrintWriter(new FileWriter("aZoutput.txt"))); //sets up the output file
            int x;
            Character readLetter;
            
            while((x = br.read()) != -1) {
            	readLetter = Character.valueOf((char) x);
            	if (Character.isUpperCase(readLetter))     //if M, print m
            		outputFile.write(Character.toLowerCase(readLetter));
            	else outputFile.write(Character.toUpperCase(readLetter)); //vice versa
            	
            	}   

            br.close();     
            outputFile.close(); //closes files!
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'"); 
	}
  }
}
