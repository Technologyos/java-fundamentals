package com.technologyos.fundamentals.interfaces;

@FunctionalInterface
public interface Retrievable<T> {
   T retrieve();// similar to Supplier
}
