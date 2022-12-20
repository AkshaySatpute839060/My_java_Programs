import java.util.Scanner;

public class Vowelswitch1 {
    public static void main(String[] args) {
        char ch = 'O';
        System.out.println("Enter a Vowel");
        Scanner sc = new Scanner((System.in));
        ch = (char) sc.nextInt();

       switch(ch)
       {
           case 'a' : System.out.println("vowel"); break;
           case 'e' : System.out.println("vowel"); break;
           case 'i' : System.out.println("vowel"); break;
           case 'o' : System.out.println("vowel"); break;
           case 'u' : System.out.println("vowel"); break;
           case 'A' : System.out.println("vowel"); break;
           case 'E' : System.out.println("vowel"); break;
           case 'I' : System.out.println("vowel"); break;
           case 'l' : System.out.println("vowel"); break;
           case 'U' : System.out.println("vowel !"); break;
           default:
               System.out.println("Not a vowel");




       }
        System.out.println("Thanks for using my java code");

    }
}
