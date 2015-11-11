import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * Created by sandeep.dongapure on 11.11.2015.
 */
public class AgeCalculator {

    public static void main(String[] args) {

        LocalDate birthdate = LocalDate.of(1988, Month.NOVEMBER, 26);
        LocalDate now = LocalDate.now();

        Duration duration = Duration.between(birthdate, now);
        long years = ChronoUnit.YEARS.between(birthdate, now);
        System.out.println(years);
        System.out.println(duration);
    }
}
