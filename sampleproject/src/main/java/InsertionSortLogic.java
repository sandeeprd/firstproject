import java.util.Scanner;

/**
 * Created by Sandeep Dongapure on 19-10-2015.
 */
public class InsertionSortLogic {
    public static void main(String[] args) {

        // screate a scanner instance for user input
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first number");

        // get user input for min range
        int min = reader.nextInt();

        System.out.println("Enter a second number");

        // get user input for max range
        int max = reader.nextInt();

        System.out.println("Here is your output");

        for (int i = min; i < max + 1; i++) {
            System.out.println(i);
        }

    }
}
