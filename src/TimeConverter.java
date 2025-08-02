public class TimeConverter {
    private double hour = 0;
    private double minutes = 0;
    private int day;
    private int months;

     double getMinutesInHour(double hour, double minutes) {
         return hour * 60;

    }

     int getDays(double hour) {
        int dayConverted = (int) (hour / 24);
        return dayConverted;
    }
     double getHoursForDays(double hour, int daysToComplete){

         return (int) (hour/ daysToComplete);
    }
}





