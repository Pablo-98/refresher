import java.io.*;
import java.util.Scanner;

public class remedialActivity {
// lab pair: 
//Pablo Hernandez 
// John Guajardo 
// You are awesome professor Karichev!!!

    /*
    Part I
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

   
/**
 This method will iterate through an array given and print out all values of that array 
 * @param a - integer array provided by user 
 *
 */
    public static void print(int[] a) {
        for (int i = 0; i <a.length; i++){

            System.out.println(a[i]);
        }
    }
/**
 This method will iterate through an array given and 
  store the value of each element in the array into a 
  variable called sum. This sum variable will be returned 
 * @param a - integer array provided by user 
 * @return the sum of the all the values in the array
 */
    public static int findSum(int[] a){
        int sum=0;

        for( int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        return sum;
    }
/**
 This method will iterate through an array given and 
  store the value of each element in the array into a 
  variable called sum. After the sum variable is determined, 
  the method will divide that value by the length of the array 
  and return that value as the average
 * @param a - integer array provided by user 
 * @return the average value of the of the array 
 */
    public static double findAVG (int[] a ) {
         double sum=0;
       

        for( int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        return sum/a.length;
    }

/*
Part II
Write a program called RemedialActivity.java, where you implement the following instructions
1. In the main, reads a file called numbers.txt. This file contains numbers, one per line. The
first line in the file represents the total number of values in the file.
2. Read the file and store the values into an array of ints.
3. Print the elements of the array by calling the method print()
4. Calculate the sum of the array by calling the method findSum()
5. Calculate the average of the array by calling the method findAVG(). 
*/

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(new File("num.txt"));

        // this array will hold the strings we receive from the num.txt file
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

 
  

// initialize my string array 
   for(int i = 0; i <stringArray.length; i++){
    if (input.hasNext()) {
        String line = input.nextLine();
        stringArray [i] = line;
    }

   }

    // initialize my integer array 
        for ( int j = 0; j < stringArray.length; j++) {
           String lineTwo = stringArray [j];
           int myInt = Integer.parseInt(lineTwo); 
            intArray[j] = myInt;
            System.out.println("my intArray now :" + intArray[j]);
        }

       
         System.out.println("-------------- print method ----------");

        print (intArray);

        System.out.println("-------------- findSum method  ----------");
        System.out.println(findSum(intArray));

        System.out.println("-------------- findAVG method  ----------");
        System.out.println(findAVG(intArray));

        /*
        Part III
          Now that you know how to read a file and populate the values of the file into an array.
1. Write a file called ‘‘results.txt’’. The file must contain the following information
• the values that are in the array in the following format: e1 +e2 +...+en
where the e1 is the first number from the file, e2 is the second number from the file, etc
• the sum:
• the average:
E.g., the file results.txt must have the following information
3 + 7 + 7 + 3 + 10 + 1 + 1 + 1 + 3 + 9 = 45
sum: 45
average: 4.5

         
         */
        System.out.println("-------------------part III-------------------");
        PrintWriter myPrinter = new PrintWriter("results.txt");
        for (int g=0; g <intArray.length; g++) {
            if (g < 9){
            myPrinter.print(intArray[g] + " + ");
            }
            else if (g==9){
                myPrinter.print(intArray[g]);
            }
        }
        myPrinter.println();
        myPrinter.println("the sum " + findSum(intArray));
        myPrinter.println("the average " + findAVG(intArray));
        myPrinter.close();

        




       


    }

}
