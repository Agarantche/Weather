package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {;
        String city = "Columbus";
        String ZipCode = "43123";
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + ZipCode);

        int[] dailyHighs = {32,25,27,40,45};
        float avg = (float)((dailyHighs[0] + dailyHighs[1] + dailyHighs[2] + dailyHighs[3] + dailyHighs[4]) / 5.0);
        System.out.println(avg);



    }
}