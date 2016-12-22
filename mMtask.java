package tasks;
import java.io.*;
import java.util.*;

public class mMtask {
	
	public static void main(String[] args) {
		String fileName = "KLSadd.tex"; //specified file to convert

        try {
            FileReader inputFile = 
                new FileReader(fileName);

            BufferedReader br = 
                new BufferedReader(inputFile);
            PrintWriter outputFile = (new PrintWriter(new FileWriter("mMoutput.txt"))); //output file setup
            int x;
            Character readLetter;
            
            while((x = br.read()) != -1) {  //reading character by character until the end of the stream has been reached (-1)
            	readLetter = Character.valueOf((char) x);
            	if ((readLetter == 'm') || (readLetter == 'M')) {   //lowercase or uppercase conditionals
            	if (Character.isUpperCase(readLetter)) 
            		outputFile.write(Character.toLowerCase(readLetter));
            	else outputFile.write(Character.toUpperCase(readLetter));
            		}
            	else outputFile.write(readLetter);
            	}   

            br.close();     
            outputFile.close(); //closes both files
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
