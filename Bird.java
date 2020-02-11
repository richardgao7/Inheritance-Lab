
/**
 * Write a description of class Bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bird implements Flier
{
    private String firstName;
    private String lastName;
    
    public Bird(String myFirstName, String myLastName)
    {
        firstName = myFirstName;
        lastName = myLastName;
    }
    
    public void fly()
    {
        System.out.println("Using feathered wings to soar in the air!");
    }
    
    public void findHome()
    {
        System.out.println("Fly around looking for home");
    }
}
