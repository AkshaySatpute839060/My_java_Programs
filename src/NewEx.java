import java.util.Scanner;

public class NewEx  {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your age");
        Scanner sc= new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 18 :
                System.out.println("You are going to become an Adult!");break;
            case 23:
                    System.out.println("You are going to join a job!");
                    break;

            case 60 :
                System.out.println("You are going to be retire!");
                break;
            default:
                System.out.println("enjoy your life !");


        }
    }
}