package com.company;

import java.util.*;

/**
 * Зачтено 02.06.2021
 */

public class Main {

    public static void main(String[] args) {
        Map <String, String> map = new HashMap<>();
        map.put("one", "apple");
        map.put("two", "pear");
        map.put("three", "plum");
        map.put("four", "peach");
        map.put("five", "grapes");
        map.put("six", "banana");
        map.put("seven", "orange");
        map.put("eight", "pineapple");
        map.put("nine", "watermelon");
        map.put("ten", "mango");
        printKeys(map);
    }
    public static void printKeys(Map<String, String>x){
        for (Map.Entry<String, String> key : x.entrySet()) {
            System.out.println(key.getKey());
        }
    }
}
