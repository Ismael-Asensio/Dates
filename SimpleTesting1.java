
import java.util.Calendar;
import java.util.Date;

public class SimpleTesting1 {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println("Today:    "+dt);
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 1);
        dt = c.getTime();
        System.out.println("Tomorrow: "+dt);
    }
}    