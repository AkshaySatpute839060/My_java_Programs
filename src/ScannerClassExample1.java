
import java.util.Scanner;

public class ScannerClassExample1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in); //Input stream is used

        System.out.println("Enter any name:");
        String name = read.next();

        System.out.println("Enter your age in years:");
        int age = read.nextInt();

        System.out.println("Enter your salary:");
        double salary = read.nextDouble();

        System.out.println("Enter any message");
        read = new Scanner(System.in);
        String msg = read.nextLine();


        System.out.println("\n---------------------------");
        System.out.println("Hello, " + name);
        System.out.println("you are " + age + "years old.");
        System.out.println("You are earning Rs." + salary + " per month.");
        System.out.println("Words From" + name + " - " + msg);
    
        
    }
    
}
