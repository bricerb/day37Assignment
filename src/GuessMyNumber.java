/**
 * Created by Brice on 9/27/16.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessMyNumber {


    public static void main(String[] args) {

        while (true) {
            int userNumber = 0;
            System.out.println("GuessMyNumber is running!");

            // Ask the user for their number
            // and store it in an int variable
            System.out.println("Please enter a number between 0 and 10");

            try {
                Scanner inputScanner = new Scanner(System.in);
                userNumber = inputScanner.nextInt();
                if (userNumber > 10 || userNumber < 0) {
                    throw new Exception();
                }
            } catch (InputMismatchException typeEx) {
                System.out.println("Please try again");
                continue;
            } catch (Exception ex) {
                System.out.println("That's not between 0 and 10!");
                continue;
            }

            System.out.println("You entered: " + userNumber);


            // Generate a random number between 0 and 10
            // and store it in another int variable
            int computerNumber = (int) (Math.random() * 10);
            System.out.println("Computer generated: " + computerNumber);

            if (decideRules()) {
                // Compare the two and display who won with Greater Than Rules
                System.out.println("Rules are Larger Number wins!");
                if (userNumber > computerNumber) {
                    System.out.println("You win!");
                } else {
                    System.out.println("I win!");
                }
                System.out.println("Thank you for playing!");
            } else {
                // Compare the two and display who won with Less Than Rules
                System.out.println("Rules are Smaller Number wins!");
                if (userNumber < computerNumber) {
                    System.out.println("You win!");
                } else {
                    System.out.println("I win!");
                }
            }
        }
    }

    // Decide winning rules between being greater than or less than PC
    // True: Greater than - False: Less Than
    public static boolean decideRules() {
        boolean ruleFlag;
        double ruleRNG = (Math.random() * 10);

        if (ruleRNG >= 5) {
            ruleFlag = true;
        } else {
            ruleFlag = false;
        }
        return ruleFlag;
    }

}