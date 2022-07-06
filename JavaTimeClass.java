package advancedjava;
import java.time.*;
public class JavaTimeClass {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime tim = LocalTime.now();
        System.out.println(tim);
        LocalDateTime dt =LocalDateTime.now();
        System.out.println(dt);
    }
}
