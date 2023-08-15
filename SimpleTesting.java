
import java.time.LocalDateTime;

public class SimpleTesting {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();     //Today
        LocalDateTime tomorrow = today.plusDays(1);     //Plus 1 day
        LocalDateTime yesterday = today.minusDays(1);   //Minus 1 day
        System.out.println("Today:     "+today);          
        System.out.println("Tomorrow:  "+tomorrow);      
        System.out.println("Yesterday: "+yesterday);          
    }
}    