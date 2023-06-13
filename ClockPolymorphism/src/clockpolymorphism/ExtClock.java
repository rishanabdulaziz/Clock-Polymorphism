/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package clockpolymorphism;

/**
 *
 * @author Rishan Aziz
 */
public class ExtClock extends Clock {

    private String timeZone;
    
    public ExtClock()
    {
        setTime(0, 0, 0, "unknown");
    }

    public ExtClock(int hours, int minutes, int seconds, String zone)
    {
        super();
        timeZone = zone;
    }

    public void setTime(int hours, int minutes, int seconds, String zone)
    {
        timeZone = zone;
    }

    public void setTimeZone(String zone)
    {
        timeZone = zone;
    }

    public String getTimeZone()
    {
        return timeZone;
    }

    public String toString()
    {
        return (super.toString() + " " + timeZone);
    } 

}
