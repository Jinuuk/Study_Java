package com.kh.exercise17.q6;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<Data> set = new HashSet<>();
    set.add(new Data(2,3));
    set.add(new Data(2,4));
    set.add(new Data(3,4));

    System.out.println(set.size());
    for (Data data:
        set) {
      System.out.println(data.hashCode());
    }

//    Data d1 = new Data(2);
//    Data d2 = new Data(2);
//    Data d3 = new Data(3);
//    System.out.println(d1 == d2);
  }
}

