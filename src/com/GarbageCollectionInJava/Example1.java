package com.GarbageCollectionInJava;

public class Example1 {

    public static void main(String[] args) {
        String one = "hello";
        String two = "hello";


        if(one == two) {
            System.out.println("they are the same object");
        }
        else  {
            System.out.println("They are different objects");
        }
        /*
        * If I run this now, we'll see that those second two strings are different objects. So Java hasn't been able
        * to reuse the string it created for object three for object four.
        *  And that's because the string for object three did not get placed in the pool
        * */
//       String three = new Integer(76).toString()
//        String four = "76";

//        there is a method on the string class to internalize a string, that is, to force the virtual machine to place that string in the pool.
//        this method is called intern().
        String three = new Integer(76).toString().intern();
        String four = "76";

        if(three == four) {
            System.out.println("they are the same object");
        }
        else  {
            System.out.println("They are different objects");
        }
    }
}
