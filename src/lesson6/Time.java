package lesson6;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime localDateTimec=LocalDateTime.of(2020,3,5,20,0);
        System.out.println(localDateTimec);
        System.out.println(localDateTimec.plusMonths(5));

        ZonedDateTime syd = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println(syd);


        LocalTime morn = LocalTime.of(7,15);
        LocalTime morn1=LocalTime.of(15,0);

        LocalTime day = LocalTime.of(15,0);
        LocalTime day1 = LocalTime.of(23,0);


        if(time.isAfter(time)&& time.isBefore(time)) System.out.println("Ytrenneya");




    }
}
