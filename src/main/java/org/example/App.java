package org.example;

import java.io.PrintStream;

public class App 
{
    static{
        System.out.format("%s","SI and CI calculator \n");
        SimpleInterest s = new SimpleInterest();
        s.setData(1000,2,5);
        s.calculateAndDisplay();
        CompoundInterest c = new CompoundInterest();
        c.setData(1000,2,5);
        c.calculateAndDisplay();
    }
    public static void main( String[] args )
    {

    }
}
