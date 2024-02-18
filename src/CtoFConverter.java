import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Declaration of Variables
        String trash = "";
        double temp1 = 0.0;
        double temp2 = 0.0;
        boolean done = true;


        do {
            // Getting user input
            System.out.print("Enter a temperature in Celsius: ");

              do {

                  //Check for valid input
                  if (in.hasNextDouble()) {

                      temp1 = in.nextDouble(); // Ok to read as a number
                      in.nextLine(); // Clears buffer
                      done = true;


                  }
                  // Bad input not  an int or within range
                  else {

                      trash = in.nextLine(); // Read as a string
                      System.out.println("You said the temperature is " + temp1 + "C");
                      System.out.println("That is not valid input or out or range try again.");
                      done = false;
                  }
              }while(!done);


        } while (temp1 >= 100 && temp1 <= 0);


        temp2 = (temp1 * 1.8) + 32;
        System.out.println("The temperature in Fahrenheit: " + temp2 + "F");


    }
}