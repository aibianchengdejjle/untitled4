package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class studentdemo {
    public static void main(String[] args) {
       /* student []x=new student[3];
        Scanner sc=new Scanner(System.in);
        for(int j=0;j<3;j++) {
            x[j]  = new student(sc.next(), sc.nextInt());
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(x[i].getName()+"------"+x[i].getAge());
        }*/
       student []x=new student[3];
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<3;i++)
       {
           x[i]=new student(sc.next(),sc.nextInt());
       }
       for(int i=0;i<3;i++)
       {
           System.out.println(x[i].getName()+"-----"+x[i].getAge());
    }

    }
}
