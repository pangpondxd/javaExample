import java.util.Scanner;

/**
 * book
 */

public class book {
    // public static book aboutBook(String name, int page) {
    //     return 
    // }
    public book() {
        String name = "Hello";
        int page = 0;
    }
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);
        

        System.out.println("Enter a line text: ");
        //Wait user enter 
        String line = input.nextLine();
        System.out.println("You Enter: " + line);
    }
    
}