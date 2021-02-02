package org.example2;

public class Construction{
    double areaHouse;
    int materialType;
    void setData(int type,double area)
    {
        areaHouse=area;
        materialType=type;
    }
    void calculateTotalCost()
    {
        double result=0.0;
        switch (materialType)
        {
            case 1:result=areaHouse*1200;
                break;
            case 2:result=areaHouse*1500;
                break;
            case 3:result=areaHouse*1800;
                break;
            case 4:result=areaHouse*2500;
                break;
        }
        System.out.format("%.2f",result);
    }
}
