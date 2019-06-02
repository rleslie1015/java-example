package com.lambda;

public class Main
{
    //running first java program in intellij!
    public static void main(String[] args)
    {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        System.out.println(greeter.sayHello("Lambda"));
    }
}
