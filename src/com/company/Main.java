package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String name;
        double kg, m, BMI;
        int lbs;
        int in;
        int ft;

        System.out.println(" Hello my name is Juan, what is your name?");
        name = keyboard.nextLine();
        System.out.println("How tall are you in inches?");
        in = keyboard.nextInt();
        System.out.println("How much do you weigh in pounds?");
        lbs = keyboard.nextInt();
        kg =  lbs*.4535;
        ft = in/12;
        m = ft*.3048;
        BMI = kg/(m*m);
        System.out.println("Your BMI would be... "+BMI+".");



        //BMI = kg/(m*m);
       /*
        lbs = 2.205lbs/1 kg;
        m = ft*(1m/3.281ft);
        ft = m*(3.281ft/1m);
        in = ft*(12in/1ft);*/







    }
// notes
    // BMI = kg/m*m;
    // kg = 1kg/2.205lbs;
    //lbs = 2.205lbs/1 kg;
    //m = ft*(1m/3.281ft);
    //ft = m*(3.281ft/1m);
    //in = ft*(12in/1ft);


}
