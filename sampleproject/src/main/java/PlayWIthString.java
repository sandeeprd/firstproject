/**
 * Created to test methods residing in String object.
 *
 * Created by sandeep.dongapure on 26.10.2015.
 */
public class PlayWithString {

    private static final String INDIA = "India";

    public static void main(String[] args) {
        System.out.println(INDIA);
        System.out.println(INDIA.length());
        System.out.println(INDIA.charAt(2));
        System.out.println(INDIA.indexOf('a'));
        System.out.println(INDIA.substring(1));
        System.out.println(INDIA.substring(1, 4));
        System.out.println(INDIA.toLowerCase());
        System.out.println(INDIA.toUpperCase());

        System.out.println(INDIA);
    }
}
