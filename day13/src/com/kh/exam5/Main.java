package com.kh.exam5;
/*
  unchecked exception
  예외 발생 시 예외를 처리하지 않으면 자동 위임된다.
 */

public class Main {
  public static void main(String[] args) {
    try {
      method1();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private static void method1() {
      method2();
  }

  private static void method2() {
      int[] arr = new int[3];
      arr[3] = 10;
  }
}
