package com.GarbageCollectionInJava;

public class Main {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        long availableBytes = runtime.freeMemory();

        System.out.println("Available Memory: " + availableBytes/1023 + "k");

        for (int i=0; i<100; i++) {
            Customer c = new Customer("Sanskar", 20);
        }

        availableBytes = runtime.freeMemory();
        System.out.println("Available Memory: " + availableBytes/1023 + "k");

        // this gc() method will forward the suggestion to start the garbage collection to the compiler, but it's not a guarantee that compiler starts the
//        garbage collection process, it might not have;
        System.gc();

        availableBytes = runtime.freeMemory();
        System.out.println("Available Memory: " + availableBytes/1023 + "k");

    }


}
