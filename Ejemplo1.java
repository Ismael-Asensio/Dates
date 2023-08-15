import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Ejemplo1 {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        System.out.println("yy/MM/dd HH:mm:ss-> "+dtf2.format(LocalDateTime.now()));

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
        System.out.println("yyyy/MMMM/dd HH:mm:ss-> "+dtf3.format(LocalDateTime.now()));

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        System.out.println("yyyy/MM/dd HH:mm-> "+dtf4.format(LocalDateTime.now()));

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        System.out.println("yyyy/MM/dd hh:mm:ss-> "+dtf5.format(LocalDateTime.now()));
    }
}







