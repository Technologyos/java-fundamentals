package com.technologyos.fundamentals.lambdas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaEffectivelyFinal {
    public String name = "";

    public static void main(String[] args) {
       ArrayList<String> names = new ArrayList<>();
       names.add("Armando");

       int x = 12; // final or effectively final

       // Lambdas take a snapshot/picture of local variables; these local
       // variables MUST NOT change. Only setting up lambda here.
       Predicate<String> lambda = s -> {
          new LambdaEffectivelyFinal().name = "Miriam";  // instance/class vars are ok
          System.out.println( "x == " + x );
          return s.isEmpty() && x % 2 == 0;
       };
       filterData(names, lambda);// lambda views 'x' as 12
       System.out.println(names);

       new LambdaEffectivelyFinal().name = "Jaime"; // instance/class vars are ok

       // If 'x' was allowed to change, then the method and the lambda would
       // have 2 different views of 'x'!
       //x++;
       filterData(names, lambda);// lambda views 'x' as 12
    }

    public static void filterData(List<String> list, Predicate<String> lambda){
       list.removeIf(lambda);
    }
}
