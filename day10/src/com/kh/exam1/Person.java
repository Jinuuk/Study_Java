package com.kh.exam1;

public class Person {
    private static String national;
    private String name;
    private int age;

    //인스턴스 초기화 블럭
    {
        System.out.println("인스턴스 초기화 블럭!");
    }
    {
        System.out.println("인스턴스 초기화 블럭2!");
    }

    static{
        System.out.println("정적 초기화 블럭!");
    }
    static{
        System.out.println("정적 초기화 블럭2!");
    }

    public Person(String name){
        super(); //부모 생성자 호출 => 부모 객체 생성
        this.name=name;
        System.out.println("생성자 호출!");
    }

    public Person(String name, int age) {
        super(); //부모 생성자 호출 => 부모 객체 생성
        this.name = name;
        this.age = age;
        System.out.println("생성자 호출2!");
    }
}
