package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double array [] = new double[100];
        for (int i = 0; i <array.length ; i++) {
            array[i] = Math.random();

        }
        double min = array [0];
        double max = array [0];
        double avg = array [0];
        for (int i = 0; i <array.length ; i++) {
            if(max < array.length)
            {max = array [i];};
            if(min > array.length)
            {min = array [i];}
            avg += array[i]/array.length;
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
        System.out.println("avg="+avg);










    }
}
