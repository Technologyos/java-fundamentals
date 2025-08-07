package com.technologyos.fundamentals.interfaces;

@FunctionalInterface
public interface Printable<T> {
   void print(T t); // similar to Consumer
}
