package org.example;

public class CompoundInterest extends Interest{
    public void setData(double p,double t,double r)
    {
        this.principle=p;
        this.time=t;
        CompoundInterest.setRate(r);
    }
    public void calculateAndDisplay()
    {
        double result=this.principle*Math.pow((1+rate/100),time)-(principle);
        System.out.format("%.2f\n",result);
    }
}