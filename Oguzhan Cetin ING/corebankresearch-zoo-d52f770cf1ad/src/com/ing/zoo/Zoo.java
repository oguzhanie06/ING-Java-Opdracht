package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[6];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";
        commands[4] = "love human";
        commands[5] = "love human";


        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Cat piet = new Cat();
        piet.name = "piet";
        Dog ash = new Dog();
        ash.name = "ash";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();


            if(input.equals("hello")) {
                henk.sayHello();
                elsa.sayHello();
                dora.sayHello();
                wally.sayHello();
                marty.sayHello();
                piet.sayHello();
                ash.sayHello();
            } else {
                String[] parts = input.split(" ");
                if(parts.length > 1) {
                    String name = parts[1];
                    if(name.equals(henk.name)) henk.sayHello();
                    else if(name.equals(elsa.name)) elsa.sayHello();
                    else if(name.equals(dora.name)) dora.sayHello();
                    else if(name.equals(wally.name)) wally.sayHello();
                    else if(name.equals(marty.name)) marty.sayHello();
                    else if(name.equals(piet.name)) piet.sayHello();
                    else if(name.equals(ash.name)) ash.sayHello();
                }
            }
        if(input.equals("give leaves")) {
            elsa.eatLeaves();
            marty.eatLeaves();
        } else if(input.equals("give meat")) {
            henk.eatMeat();
            wally.eatMeat();
        } else if(input.equals("perform trick")) {
            wally.performTrick();
        }
        else if(input.equals("love human")) {
            piet.loveHuman();
            ash.loveHuman();
        }
    }
}