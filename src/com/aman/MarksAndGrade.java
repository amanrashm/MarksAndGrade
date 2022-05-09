package com.aman;
import java.util.Scanner;
public class MarksAndGrade {
    public static void main(String[]args){
        System.out.println("Enter Your Roll Number :- ");
        //write code here
/*        pseudo code :-
        WAP get out put as marks , grade , student name , roll number
        input :- rollnumber
        output :- Student Name
                  Roll Number
                  Marks
                  Grade
                  School Name
                   */

        String SchoolName = "Oasis Public High School";
        String StudentName = "Aman raj";
        int RollNumber = 5;
        Double Marks = Double.valueOf(75);
        char Grade = 'A' ;



        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        System.out.println(SchoolName +"\n" + StudentName +"\n" + RollNumber +"\n" + Marks +"\n" + Grade);

    }
}
