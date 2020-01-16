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
        Scanner scanner = new Scanner(System.in);
        // int value = scanner.nextInt();
        // while(value != 5){
        //     System.out.println("Enter correct number: ");
        //      value = scanner.nextInt();
        //     System.out.println();
        // }
        // System.out.println("Got it");
        int value = 0;
        do {
            System.out.println("Enter correct number: ");
             value = scanner.nextInt();
        } while (value != 5);
        System.out.println("Gotcha!!!");
    }
    
}