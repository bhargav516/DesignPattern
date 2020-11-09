package com.creational.singleton;

public class testingDbSingleton {
    public static void main(String[] args) {
        // This class to test the singleton which we have created
        // Creating first instance of dbsingleton
        DbSingleton dbSingleton = DbSingleton.getInstance();

        System.out.println(dbSingleton);

        DbSingleton dbSingleton1 = DbSingleton.getInstance();

        System.out.println(dbSingleton1);

        if (dbSingleton == dbSingleton1){
            System.out.println("Both objects are same");
        }
    }
}
