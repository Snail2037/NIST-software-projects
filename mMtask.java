package tasks;
import java.io.*;
import java.util.*;

public class mMtask {
	
	public static void main(String[] args) {
		String fileName = "KLSadd.tex";

        try {
            FileReader inputFile = 
                new FileReader(fileName);

            BufferedReader br = 
                new BufferedReader(inputFile);
            PrintWriter outputFile = (new PrintWriter(new FileWriter("mMoutput.txt")));
            int x;
            Character readLetter;
            
            while((x = br.read()) != -1) {
            	readLetter = Character.valueOf((char) x);
            	if ((readLetter == 'm') || (readLetter == 'M')) {   	
            	if (Character.isUpperCase(readLetter)) 
            		outputFile.write(Character.toLowerCase(readLetter));
            	else outputFile.write(Character.toUpperCase(readLetter));
            		}
            	else outputFile.write(readLetter);
            	}   //while

            br.close();     
            outputFile.close();
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