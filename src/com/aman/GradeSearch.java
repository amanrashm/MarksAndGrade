package com.aman;
import java.util.Scanner;
public class GradeSearch {
    public static void main(String []args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the total percentage");
        int D = x.nextInt();

        if ((D>=65)&&(D<=100)) {
            System.out.println("Grade A");
        }
        else if ((D>=33)&&(D<=64)){
            System.out.println("Grade B");
        }
        else
            System.out.println("Grade C");
        if (D<=100){
            System.out.println();
        }
    }
}
