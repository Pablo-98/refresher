import java.io.*;
import java.util.Scanner;

public class read {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(new File("num.txt"));

        // baseline
        String[] array = new String[10];

        //while (input.hasNext() ) {
                    //String line = input.nextLine();}
  

        for ( int k = 1; k < array.length ; k++) {
           
                String line = input.nextLine();
            
                array[k] = line;
            }
          
        

        for ( int j = 0; j < array.length; j++) {

            System.out.println(array[j]);
        }

       


    }

}
