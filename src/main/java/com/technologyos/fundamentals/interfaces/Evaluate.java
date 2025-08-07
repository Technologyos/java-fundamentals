package com.technologyos.fundamentals.interfaces;

@FunctionalInterface
public interface Evaluate<T> {
   boolean isNegative(T t);// similar to Predicate
}
