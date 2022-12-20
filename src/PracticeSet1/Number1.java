package PracticeSet1;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
      /* question 1
        int a = 11;
        if(a ==10){
            System.out.println(" I am 11");



        }else
            System.out.println("I am not 11");


       */
        // question 2
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in mathematics");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Mathematics");
        m3 = sc.nextByte();
        float avg = (m1 +m2+m3)/3.0f;
        System.out.println("Your overall percentage is:" + avg);

        if(avg>=40 && m1 >=33 && m2 >=33 && m3>=33){
            System.out.println("Congrulations, you have been promoted");

        }else {
            System.out.println("Sorry, you have not beenn promoted ! please try again.");


        }



    }
}
