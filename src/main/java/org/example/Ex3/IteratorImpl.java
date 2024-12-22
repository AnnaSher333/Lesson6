package org.example.Ex3;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IteratorImpl<E> implements Iterator<E> {
    private E[] array;
    private E element;
    private int index;

    public IteratorImpl(E[] array) {
        this.array = array;
        index = 0;
        element = array[index];
    }

    @Override
    public E next() {
        if (hasNext()) {
            E tempEl = element;
            index++;
            element = array[index];
            return tempEl;
        } else if (index == array.length-1){
            return element;
        } else{
            return null;
       }
    }

    @Override
    public boolean hasNext() {
        if (index < array.length-1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void remove() {
        if (hasNext()){
            if (index == 0){
                E[] newArray = Arrays.copyOfRange(array, 1, array.length);
                array = newArray;
            } else if (index == array.length){
                E[] newArray = Arrays.copyOfRange(array, 0, array.length-1);
                array = newArray;
            }else {
                E[] newArray1 = Arrays.copyOfRange(array, 0, index);
                E[] newArray2 = Arrays.copyOfRange(array, index+1, array.length);
                System.arraycopy(newArray1, 0, array, 0, newArray1.length);
                System.arraycopy(newArray2, 0, array, newArray1.length, newArray2.length);
            }
        }
    }
}

