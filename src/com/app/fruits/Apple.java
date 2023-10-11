package com.app.fruits;

public class Apple extends Fruit{

    public Apple(String color, int weight){
        super("Mango",color,weight);
    }
    public String taste(){
        return "Sweet";
    }

    public String jam(){
        return super.getName()+" of color "+super.getColor();
    }

    public String toString(){
        return jam();
    }

}
