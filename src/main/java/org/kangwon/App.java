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

Random random = new Random();
        int r;
        r = random.nextInt(15);

        for(int i=0; i<r; i++){
            for(int j=0; j<i; j++) {
                if((i + 1) % 2 == 1)
                System.out.print(" \"KNU-7\" ");
                else{
                    System.out.print(" \" *** \" ");
                }
            }System.out.println(" ");
        }
        for(int l=r;l>0;l--){
            for(int j=0; j<l; j++) {
                if((l + 1) % 2 == 1)
                    System.out.print(" \"KNU-7\" ");
                else{
                    System.out.print(" \" *** \" ");
                }
            }System.out.println(" ");
        }
        System.out.println(" ");
    }
}
