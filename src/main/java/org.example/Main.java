package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Hello, enter CC num: ");
            long cc = input.nextLong();
            if(Credit.findDigits(cc)==16){
                if(Credit.getDigit(cc, 16)==4){
                    System.out.println("TYPE VISA: ");
                    break;
                }else if(Credit.getDigit(cc, 16)==5){
                    System.out.println("MASTER CARD: ");
                    break;
                }
            }

        }
    }
}
