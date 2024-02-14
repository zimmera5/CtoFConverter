import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Declaration of Variables
        String trash ="";
        int temp1;
        double temp2 = (temp1 * 9/5) + 32;


    do {
         // Getting user input
         System.out.print("Enter a temperature in Celsius: ");

         //Check for valid input
        if(in.hasNextInt());

            temp1 = in.nextInt(); // Ok to read as a number
            in.nextLine(); // Clears buffer

        // Bad input not  an int or within range
        else

             trash = in.nextLine(); // Read as a string
             System.out.println("You said the temperature is " + temp1 + "C");
             System.out.println("That is not valid input or out or range try again.");


    }while (temp1<=100 && temp1>=32);


          System.out.println("The temperature in Farhenheit: " + temp2 + "F");






}