package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            try {
                Scanner myScanner = new Scanner(new File("input.txt"));
                while(myScanner.hasNext()){
                    //you have to read the entire line as a string.
                    String lineIn = myScanner.nextLine();
                    //then split the line into a String array
                    String[] input = lineIn.split(",");
                    int sum = 0;
                    for (int i = 0; i <input.length; i++){
                        try {
                            sum += Integer.parseInt(input[i]);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input: " + input[i]);
                        }
                    }
                    System.out.println(sum);
                }



            } catch (IOException e) {
                System.out.println("File not found");
            }
            // Print out a running total of all the
            // values in the input file.
        }
}