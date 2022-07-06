package advancedjava;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalenderinJava {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        System.out.println();
// greogrian calender
        Calendar cd = Calendar.getInstance();
        System.out.println(cd.getTime());
        System.out.println(cd.get(Calendar.HOUR));
        System.out.println(cd.get(Calendar.MINUTE));
        GregorianCalendar ca = new GregorianCalendar();
        System.out.println(ca.isLeapYear(1903));
//        [][][]



    }
}
