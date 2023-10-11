package com.app.fruits;

public class Fruit {
    private String name;
    private String color;
    private int weight;
    private boolean fresh;

    Fruit(String fname , String fcolor,int fweight){
        name = fname;
        color = fcolor;
        weight = fweight;
        fresh = true;
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getWeight(){
        return weight;
    }
    public boolean isFresh(){
        return fresh;
    }

    public String toString(){
        return "Name: "+ name+" Color: "+color+" Weight: "+weight+" Fresh: "+ fresh;
    }

    public String taste (){
        return "The Taste is: ";
    }
}
