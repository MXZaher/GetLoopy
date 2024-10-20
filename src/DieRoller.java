import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        int die1;
        int die2;
        int die3;
        int sum;
        int j;
        boolean done = false;
        boolean validInput = false;
        String choice;
        do {
            j = 0;
            System.out.println("Roll   Die1   Die2   Die3   Sum");
            System.out.println("-------------------------------");
            for (int i = 0; i < 1;) {
                Random rnd = new Random();
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                j++;
                System.out.println(j + "      " + die1 + "      " + die2 + "      " + die3 + "      " + sum);
                if ((die1 == die2) && (die2 == die3)) {
                    i++;
                }
            }
            do {
                System.out.print("Would you like to play again? (Y/N): ");
                Scanner in = new Scanner(System.in);
                choice = in.next();
                switch (choice.toUpperCase()) {
                    case "Y":
                        validInput = true;
                        break;
                    case "N":
                        System.out.println("Goodbye!");
                        validInput = true;
                        done = true;
                        break;
                    default:
                        System.out.println("Please enter a valid input");
                        break;
                }
            }while(!validInput);
        }while(!done);
    }
}
