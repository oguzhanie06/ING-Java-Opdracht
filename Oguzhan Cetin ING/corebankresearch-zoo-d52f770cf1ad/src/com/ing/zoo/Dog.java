package com.ing.zoo;

public class Dog {
    public String name;
    public String helloText;
    public String loveText;

    public Dog()
    {
    }

    public void sayHello()
    {
        helloText = "auuuu";
        System.out.println(helloText);
    }

    public void loveHuman()
    {
        loveText = "immm yummy human";
        System.out.println(loveText);
    }

}
