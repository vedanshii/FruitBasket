package com.app.fruits;

public class Mango extends Fruit {

    public Mango(String color, int weight){
        super("Mango",color,weight);
    }
    public String taste(){
        return "Sweet";
    }

    public void pulp(){
        System.out.println("Creating pulp from "+getName()+" of color "+getColor());
    }

}
