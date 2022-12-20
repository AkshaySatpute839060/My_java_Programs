package PracticeAssingment;

import java.util.Scanner;

public class NewAssing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter cost  = ");
        int cost= sc.nextInt();
        System.out.println("enter quantity = ");
        int quantity= sc.nextInt();
        if (cost>1000){
            System.out.println("the total discount cost =" +(quantity - (quantity/100*10)));
        }
        else
            System.out.println("The total cost =" + quantity);

}}
