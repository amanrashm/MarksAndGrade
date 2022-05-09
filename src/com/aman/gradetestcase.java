package com.aman;

import java.util.Scanner;

import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.D;

public class gradetestcase {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number Of TestCases");
        
        // using for loop condition


        int B = x.nextInt();
        for (int A = 1; A <= B; A++) {
            System.out.println("Enter Your Percentage");
            int D = x.nextInt();
            if ((D >= 65) && (D <= 100)){
                System.out.println("Grade A");
            }
               else if ((D<=0)&&(D >= 100)) {
                System.out.println("ERROR");

            } else if ((D >= 33) && (D <= 64)) {
                System.out.println("Grade B");
            } else
                System.out.println("Grade C");


            }
        }

    }