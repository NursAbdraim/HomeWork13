package com.company;

import java.sql.Array;

public class Class {
//    private int n;
//    private String w;
//    private int[] myArr;

    public Class(int number) {
        System.out.println(number);
    }

    public Class(String word){
        System.out.println(word);
        }

    public Class(int[] myArr) {
        for (int j : myArr) {
            System.out.print(j + ", ");
        }
        }

}
