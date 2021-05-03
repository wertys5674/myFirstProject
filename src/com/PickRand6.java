package com;

import java.util.*;

public class PickRand6 {
    public static void main(String[] args) {
        HashSet<Integer> set2 = new HashSet<Integer>();
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(4);
        set2.add(4);
        set2.add(1);
        set2.add(2);
        System.out.println(set2);
        set2.clear();
        System.out.println(set2);
        set2.add(1);
        System.out.println(set2);

    }
}
