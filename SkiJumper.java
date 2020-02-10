
/**
 * Represents a ski jumper.
 * 
 * @author (Doug Vermes) 
 * @version (03/14/2006)
 */
public class SkiJumper implements Flier, Athlete
{
    private String firstName;
    private String lastName;

    /**
     * Create a ski jumper with the specified first name and last name.
     */
    public SkiJumper(String myFirstName, String myLastName)
    {
        firstName = myFirstName;
        lastName = myLastName;
    }
    
    public void fly()
    {
        System.out.println("Using skis to take me into the air!");
    }
    
    public void train()
    {
        System.out.println("Skiing down slopes to practice for a competition");
    }
}
