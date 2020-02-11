
/**
 * Write a description of class Airplane here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Airplane implements Flier
{
    private String firstName;
    private String lastName;
    
    public Airplane(String myFirstName, String myLastName)
    {
        firstName = myFirstName;
        lastName = myLastName;
    }
    
    public void fly()
    {
        System.out.println("Using jet engines to zoom through the air!");
    }
}
