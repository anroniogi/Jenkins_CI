package org.kangwon;

public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name =name;
        this.age =age;
    }

    void intro(){
        System.out.println("이름"+name +"나이 : "+age);
    }

}
