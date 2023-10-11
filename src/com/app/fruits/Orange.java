package com.app.fruits;

public class Orange extends Fruit{

    public Orange(String color, int weight){
        super("Orange",color,weight);
    }
    public String taste(){
        return "sour";
    }

    public void juice(){
        System.out.println("The juice of "+getName()+" of the color"+getColor());
    }
}
