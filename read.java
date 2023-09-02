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

     // part II

/*Write a program called RemedialActivity.java, where you implement the following instructions
1. In the main, reads a file called numbers.txt. This file contains numbers, one per line. The
first line in the file represents the total number of values in the file.
2. Read the file and store the values into an array of ints.
3. Print the elements of the array by calling the method print()
4. Calculate the sum of the array by calling the method findSum()
5. Calculate the average of the array by calling the method findAVG(). 
*/
    public static void print(int[] a) {
        for (int i = 0; i <a.length; i++){

            System.out.println(a[i]);
        }
    }

    public static int findSum(int[] a){
        int sum=0;

        for( int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        return sum;
    }

    public static double findAVG (int[] a ) {
         double sum=0;
         double avg = 0;

        for( int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        return sum/a.length;
    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(new File("num.txt"));

        // this array will hold the strings we receive from the num.txt file
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

 
  


   for(int i = 0; i <stringArray.length; i++){
    if (input.hasNext()) {
        String line = input.nextLine();
        stringArray [i] = line;
    }

   }

    
        for ( int j = 0; j < stringArray.length; j++) {
           String lineTwo = stringArray [j];
           int myInt = Integer.parseInt(lineTwo); 
            intArray[j] = myInt;
            System.out.println("my intArray now :" + intArray[j]);
        }

        // at this point I have a int array 
         System.out.println("-------------- print method ----------");

        print (intArray);

        System.out.println("-------------- findSum method  ----------");
        System.out.println(findSum(intArray));

        System.out.println("-------------- findAVG method  ----------");
        System.out.println(findAVG(intArray));


       


    }

}
