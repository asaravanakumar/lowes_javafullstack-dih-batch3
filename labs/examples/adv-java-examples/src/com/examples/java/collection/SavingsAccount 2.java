package com.examples.java.collection;

import com.examples.java.annotation.Init;

@SuppressWarnings({"all"})
public class SavingsAccount extends Account {

    @Override
    @Init
    public double showBalance() {
        return 100;
    }

}
