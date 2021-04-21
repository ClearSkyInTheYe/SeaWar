package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner num = new Scanner(System.in);
       double a;
       double b;
       double x;
       double x1;
       double c;
       double D;
        System.out.println("введите a,b,c ");
       a = num.nextDouble();
       b = num.nextDouble();
       c = num.nextDouble();
       D = b*b-4*a*c;
       if(D<0)
       {System.out.println("нет корней");}
       else if(D == 0){
       x = -b/2*a;
       System.out.println(x);}
       else if (D>0){
           x = (-b + Math.sqrt( D ) )/2*a;
           x1 = (-b - Math.sqrt( D ) )/2*a;
           System.out.println(x+",");
           System.out.println(x1);
       }






    }
}
