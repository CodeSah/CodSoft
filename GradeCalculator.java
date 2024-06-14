import java.util.Scanner;

import java.util.*;
class GradeCalculator{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n_subjects=6;
    int totalmarks=0;
    int[] marks =new int[n_subjects];
    String[] Subjects={"Java","DBMS","COA","Economics","Maths","OS"};
    for(int i=0;i<n_subjects;i++){
        System.out.println("Enter marks obtained in "+Subjects[i]+":");
        marks[i]=sc.nextInt();
        totalmarks +=marks[i];
    }
    double average =(double) totalmarks/n_subjects;
    String grade;
    if(average >=90){
        grade="O";

    }else if (average >= 80){
        grade="E";

    }else if(average >=70){
        grade="A";
    }else if (average >=60){
        grade="B";
    }else if(average >=50){
        grade="c";
    }else if (average >=40){
        grade="D";
    }else{
        grade="F";
    }

    System.out.println("Total Marks:"+totalmarks);
    System.out.println("Average Percentage:"+average);
    System.out.println("Grade:"+grade);

    }
}
