import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Declaration of Variables
        String trash = "";
        double temp1 = 0.0;
        double temp2 = 0.0;
        boolean done = false;  //this needs to be false to start, so we can flip it to true when we get what we want

        do
        {
            // Getting user input
            System.out.print("Enter a temperature in Celsius: ");

            //Check for valid input

            if (in.hasNextDouble()){

                
                temp1 = in.nextDouble(); // Ok to read as a number
                in.nextLine(); // Clears buffer
                done = true;  //this is your sentinel to exit the loop
                
 
            }
            // Bad input not  an int or within range
            else {

                trash = in.nextLine(); // Read as a string
                System.out.println("You said the temperature is " + trash + "C");
                System.out.println("That is not valid input or out or range try again.");
            }
        }while(done==false); //as long as done is false, we keep looping.  Can also write this as (!done) instead

        //don't need a range, just see if the known boiling/freezing points match what you would expect

        temp2 = (temp1 * 1.8) + 32;
        System.out.printf("The temperature in Fahrenheit: %.2f", + temp2);


    }
}
