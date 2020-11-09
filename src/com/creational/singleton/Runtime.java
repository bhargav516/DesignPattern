package com.creational.singleton;

public class Runtime {

    public static void main(String[] args) {
	// Example for everyday singleton object
    // experimenting with pre-built singleton class

        //trying to fetch runtime object
        java.lang.Runtime singletonObject =  java.lang.Runtime.getRuntime();

        System.out.println(singletonObject);

        //another object
        java.lang.Runtime anotherObject =  java.lang.Runtime.getRuntime();

        System.out.println(anotherObject);

        if (singletonObject == anotherObject){
            System.out.println("Both objects are same");
        }
    }
}
