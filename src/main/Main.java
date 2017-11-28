package main;

import gerador.SerialGenerator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean proceed = false;

        Scanner e = new Scanner(System.in);

        int n_groups = 0;
        int n_char = 0;
        boolean permitLetter = false;
        boolean permitCaseSensitive = false;
        int runTime = 0;

        try {

            System.out.println("Insert the number of charactere groups:");
            n_groups = e.nextInt();

            System.out.println("Insert the number of charactere of a group:");
            n_char = e.nextInt();

            System.out.println("Do you want to put letters? (y/n)");
            String temp = e.nextLine();

            if (temp.equals("y") || temp.equals("Y")) {
                permitLetter = true;
            } else if (temp.equals("n") || temp.equals("N")) {
                permitLetter = false;
            } else {
                proceed = false;
            }

            System.out.println("Is case sensetive? (y/n)");
            temp = e.nextLine();

            if (temp.equals("y") || temp.equals("Y")) {
                permitCaseSensitive = true;
            } else if (temp.equals("n") || temp.equals("N")) {
                permitCaseSensitive = false;
            } else {
                proceed = false;
            }

            System.out.println("Insert the number of serial for generating:");
            runTime = e.nextInt();

            if (n_char != 0 && n_groups != 0 && runTime != 0) {
                proceed = true;
            }

        } catch (Exception ex) {
            proceed = false;
            
            System.err.println("Error!");
            
        }

        if (proceed) {

            SerialGenerator sg = new SerialGenerator();

            if (permitLetter) {

                for (int i = 0; i < runTime; i++) {
                    sg.generateAlphaNumericSerial(n_groups, n_char, permitCaseSensitive);
                }

            } else {

                for (int i = 0; i < runTime; i++) {
                    sg.generateNumberSerial(n_groups, n_char);
                }
                
            }

        }

    }

}
