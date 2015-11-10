import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by sandeep.dongapure on 10.11.2015.
 */
public class DateTimeCheck {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalTime timeNow = LocalTime.now();

        System.out.println("Hey dude, today is " + today + " and it's " + timeNow);
        System.out.println("But DateTime is " + LocalDateTime.now());
    }
}
