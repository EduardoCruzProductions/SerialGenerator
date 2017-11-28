package test;

import gerador.SerialGenerator;

public class Test {

    public static void main(String[] args) {

        while (true) {
            
            SerialGenerator sg = new SerialGenerator();
            System.out.println(sg.generateAlphaNumericSerial(5, 4, false));
            
        }
    }

}
