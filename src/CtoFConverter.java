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

        do
        {
            // Getting user input
            System.out.print("Enter a temperature in Celsius: ");

            //Check for valid input

            if (in.hasNextDouble()){

                temp1 = in.nextDouble(); // Ok to read as a number
                in.nextLine(); // Clears buffer
                //this is a good place to put your 'done' flag, allows an exit to the loop
                //sometimes people just put 'break;' and dont rely on a flag to exit a loop
                //flags vs breaks is a topic debated a lot, and the answer between them is it depends
                //breaks are nice when you have lots of loops or your loop is small
                //flags are better for larger loops because of readability/control

                //if you want to test for range, do it here instead
                //if it falls within range, you can set done = true - - else sout that number is out of range - - your loop will begin again
 
            }
            // Bad input not  an int or within range
            else {

                trash = in.nextLine(); // Read as a string
                System.out.println("You said the temperature is " + trash + "C");
                System.out.println("That is not valid input or out or range try again.");
            }
        }while( (!(temp1 < 101)) || (temp1 < -1)); //I wouldn't worry too much about this being your sentinel, make done your sentinel

        //}while(done == false);
        //now you can just have a simple flag, instead of going through the range testing

        temp2 = (temp1 * 1.8) + 32;
        System.out.printf("The temperature in Fahrenheit: %.2f", + temp2);


    }
}
