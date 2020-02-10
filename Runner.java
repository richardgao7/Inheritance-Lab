
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner implements Athlete
{
    private String firstName;
    private String lastName;

    public void Athlete(String myFirstName, String myLastName)
    {
        firstName = myFirstName;
        lastName = myLastName;
    }
    
    public void train()
    {
        System.out.println("Skiing down slopes to practice for a competition");
    }
}
