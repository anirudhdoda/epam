package org.example;


public class SimpleInterest extends Interest{
    public void setData(double p,double t,double r)
    {
        this.principle=p;
        this.time=t;
        SimpleInterest.setRate(r);
    }
    public void calculateAndDisplay()
    {
        double result=this.principle*this.time*rate/100;
        System.out.format("%.2f\n",result);
    }
}