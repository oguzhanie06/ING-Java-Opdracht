package com.ing.zoo;

public class Cat {
    public String name;
    public String helloText;
    public String loveText;

    public Cat()
    {
    }

    public void sayHello()
    {
        helloText = "meeuww";
        System.out.println(helloText);
    }

    public void loveHuman()
    {
        loveText = "immm yummy human";
        System.out.println(loveText);
    }

}
