package com.MemoryManagement;


import java.util.Locale;

public class Exercise1 {


    public static void main(String[] args) {

        Exercise1 main = new Exercise1();
        main.start();

    }
    public void start() {
        String last = "Z";
        Container container = new Container();
        container.setInitial("C");
        another(container, last);
        System.out.println(container.getInitial());
    }

    public static void another(Container initialHead, String newInitial) {
        newInitial.toLowerCase();
        initialHead.setInitial("B");
        Container initial2 = new Container();
        initialHead = initial2;
        System.out.println(initialHead.getInitial());
        System.out.println(newInitial);
    }


}
