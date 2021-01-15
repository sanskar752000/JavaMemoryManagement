package com.EscapingReference;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Sanskar"));

        // this iterable method to get all the customer is not robust as we can
        // use records.iterator().remove() function to remove the customers
//        for(Customer next : records){
//            System.out.println(next);
//        }

//        records.getCustomers().clear();
        for(CustomerReadOnly next : records.getCustomers().values()) {
            System.out.println(next );
        }

        CustomerReadOnly sanskar = records.getCustomerByName("Sanskar");
        System.out.println(sanskar);

//        sanskar.setName("Alex");
//        System.out.println(sanskar);
    }
}
