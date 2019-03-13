
/**
 * A guess the pasword program 
 *
 * @author Christopher Bertrand
 * @version 11.20.2018
 */
public class reverse
{
    static String SECRET_PASSWORD = "LMAO";
    static String obfuscate (String input)
    {
        return input.replace('L', 'S').replace('A', 'G').concat("DOGE");
    }
    public static void main(String[] args) 
    {
        if (args.length != 1)
        {
            System.out.println("Wrong! you have to run this progrm with one argument:\njava Reverse <argument>");
            return;
        }
        if (args[0].equals(obfuscate(SECRET_PASSWORD)))
        {
            System.out.println("You guessed my password, cool I guess memelord");
        }
        else 
        {
            System.out.println("You guessed wrong buddy boi");
        }
    }
}