package com.examples.java.generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardGeneric {
    public static void main(String[] args) {
        List skills = new ArrayList();
        List<String> skills1 = new ArrayList<>();
        List<? extends Number> ids = new ArrayList<Integer>();
        List<? extends Number> ids1 = new ArrayList<Double>();
        List<? super Integer> ids2 = new ArrayList<Number>();


//        ids.add(new Integer(100));
    }
}
