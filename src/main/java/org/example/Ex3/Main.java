package org.example.Ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++){
            array[i] = String.valueOf(i) + "str";
        }
        array[5] = "55555";
        String[] array2 = new String[10];
        IteratorImpl<String> iter = new IteratorImpl<>(array);

            while (iter.hasNext()) {
                System.out.println(iter.next());
            }

    }
}
