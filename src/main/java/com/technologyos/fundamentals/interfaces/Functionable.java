package com.technologyos.fundamentals.interfaces;

@FunctionalInterface
public interface Functionable<T, R> {
   R applyThis(T t);// similar to Function
}
