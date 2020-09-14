import java.util.Scanner;
/**
 * This program converts degrees celcius to degrees farenheit
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask user for the degrees celcius
    System.out.println("Please enter the degrees celcius:");

    // declare and initialize a variable for the degrees celcius
    int degreesCelcius = input.nextInt();

    int degreesFarenheit = (degreesCelcius * 9) / 5 + 32;

    // tell the user the degrees farenheit
    System.out.println("It is " + degreesFarenheit + " degrees farenheit outside.");


  }
}
