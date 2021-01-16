package com.GarbageCollectionInJava;

public class Customer {

    private String name;

    private int age;

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*
    * finalize() is called by the garbage collector on an object when garbage collection determines that there are no more
    * references to the object, actually is pretty useless.
    * The problem is that we're not going to know that it's definitely going to run or if it is, when it is going to run.
    * Something you must never do is close an open resource in the Finalize method
    * */
    public void finalize() {
        System.out.println("This object is gc'd!");
    }
}
