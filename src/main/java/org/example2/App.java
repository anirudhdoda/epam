package org.example2;


import java.util.Scanner;


public class App {

    static {
        Construction c=new Construction();
        System.out.format("%s","Enter 1 for Standard\nEnter 2 for Above Standard\nEnter 3 for High Standard\nEnter 4 for Above Standard and Automated home\n");
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        System.out.format("%s","Enter House Area\n");
        double area=sc.nextDouble();
        sc.close();
        c.setData(type,area);
        c.calculateTotalCost();
    }
    public static  void main(String args[])
    {

    }
}
