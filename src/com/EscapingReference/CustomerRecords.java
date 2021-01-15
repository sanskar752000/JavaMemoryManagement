package com.EscapingReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {

    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer c) {
        this.records.put(c.getName(), c);
    }

//    public HashMap<String, Customer> getCustomers() {
//        return new HashMap<String, Customer>(this.records);
//    }

    public Map<String, Customer> getCustomers() {
        return Collections.unmodifiableMap(this.records);
    }

//    implemnetation of Copy Constructor
//    public Customer getCustomerByName(String name) {
//        return new Customer(this.records.get(name));
//    }
    public CustomerReadOnly getCustomerByName(String name) {
        return this.records.get(name);
    }

    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }
}
