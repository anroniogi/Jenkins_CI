package org.kangwon;

public class Person {
    String name;
    int age;
    String tier = "언랭";
    String most = "시험공부";
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void setTier(String name){
        this.name = name;
    }
    void setMost(String most){
        this.most = most;
    }

    void intro(){
        System.out.println("이름, " + name + age + "세 입니다.");
        System.out.println("티어는 " + tier + "모스트는 " + most + "입니다.");
    }

}
