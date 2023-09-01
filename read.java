import java.io.*;
import java.util.Scanner;

public class read {

    /*
     1. [data type] arrayName = new {data type} [array size]
     2. Math.random() * ____
     3. int array = new int [10];
     4. for(int i = 0; i <= array.length; i++) {
        array[i] = i;
     }
     5. for (int k = 0; k <= array.length; k++){
        System.out.println(array[k]);
     }
     6. public static void methodName(parameter ) {} I forgot the names of each of these parts
     7. import java.io and import java.util.Scanner 
     8. Scanner input = new Scanner (new File ("fileName"))
     while (input.hasNext()) {
        String line = input.next();
        System.out.println(line);
     }
     9. explained in 8 I think
     10. typecast. Example: int() DoubleVar
     */

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(new File("num.txt"));

        // this array will hold the strings we receive from the num.txt file
        String[] array = new String[10];

    // my main concern at this moment (9/01/23 1:26pm ) is that I cant find a way to skip over the first element in the num.txt file. In our case its the number 10
    // we need to not have 10 in our final array
  
/* method 1 ( I think I'm on the right path )  this will store ALL the values from the num.txt file.
        for ( int k = 1; k < array.length ; k++) {
           
                String line = input.nextLine();
            
                array[k] = line;
            }
          */
          /*
           method 1 ^^ output: 
           null
           10
           8
           12
           9
           11
           2
           24
           32
           8
           */

        for (int k = 1; k< array.length; k++) {
            String line = input.nextLine();
            array[k] = line; 
        }
        
// simple for loop to iterate and display every element in our string array 
        for ( int j = 0; j < array.length; j++) {

            System.out.println(array[j]);
        }

       


    }

}
