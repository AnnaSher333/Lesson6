package org.example.Ex3;

public interface Iterator<E> {
    E next();
    boolean hasNext();
    void remove();
}
