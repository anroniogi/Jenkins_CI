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
        Person person = new Person("JJunney",15);
        person.intro();
        System.out.println( "KNU-7" );
        Schedule first = new Schedule();
        first.setDay(5);
        first.setTime(450);
        System.out.println( "day : "+first.getDay()+"\n"+"time : "+first.getTime() );
    }
}
