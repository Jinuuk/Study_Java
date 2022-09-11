package com.kh.exercise17.q3;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {
  public static void main(String[] args) {
    List<Boolean> list = new Vector<>();
    list.add(true);
    list.add(false);
    list.add(true);

    //list -> array 변환
    Boolean[] bArray = list.toArray(new Boolean[5]);
    System.out.println(Arrays.toString(bArray));

    //array -> list 변환
    List<Boolean> list2 = Arrays.asList(bArray);
    System.out.println(list2);
  }
}
