/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clockpolymorphism;

/**
 *
 * @author Rishan Aziz
 */

import java.util.*;

public class ClockMain {

    /**
     * @param args the command line arguments
     */
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        Clock clockOne, clockRef;
        ExtClock clockTwo;

        clockOne = new Clock(5,4,30);
        clockTwo = new ExtClock(5,4,30,"mountain");

        clockRef = clockOne;

        System.out.println("Clock One: " + clockRef);
        System.out.println();
        
        clockRef = clockTwo;
        
        System.out.println("Clock Two: " + clockRef);
        System.out.println();


    }

}
