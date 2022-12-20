package PracticeAssingment;


import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Assingment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenagth = sc.nextInt();
        int breadth = sc.nextInt();
        if (lenagth == breadth) {
            System.out.println("it is a square");


        } else {
            System.out.println("it is a reactangle");

        }
    }


}
