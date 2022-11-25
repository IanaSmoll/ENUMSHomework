import javax.lang.model.util.ElementScanner6;

public class MonthCheck
{
    public static void main(String[] args) {
       /* int myJanTemp = 0;
        System.out.println(Month.APRIL);
        for(Month m: Month.values()){
            myJanTemp = Month.getTemprature(m);
            System.out.println(myJanTemp);
        } - классный пример*/
        
        
        Weekday fri = Weekday.FRIDAY;
        Weekday sun = Weekday.SUNDAY;
        System.out.println(fri.isWeekDay());
        System.out.println(sun.isHoliday());
        System.out.println(sun.isWeekDay());
        
        
        Weekday sat = Weekday.SATURDAY;
        for(Weekday weekday: Weekday.values()) {
            System.out.println(weekday);
            if(weekday.compareTo(sat) < 0) {
                System.out.println("меньше");
            }
            else if(weekday.compareTo(sat) == 0) {
                System.out.println("равно");
            }
            else {
                System.out.println("больше");
            }
        }
    }
}

