package org.kangwon;
import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int score = 85;

        System.out.println( "KNU-7" );
      
        if(score>=90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }

        Person person = new Person("JJunney",15);
        person.intro();

        Schedule first = new Schedule();
        first.setDay(5);
        first.setTime(450);
        System.out.println( "day : "+first.getDay()+"\n"+"time : "+first.getTime() );
    }
}
