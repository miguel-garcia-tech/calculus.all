

public class TimeConverter {

     double getMinutesInHour(double hour, double minutes) {
         return hour * 60;

    }

     double getHoursForDays(double totalHours, int daysToComplete){
         return (totalHours/ daysToComplete);
    }

    int getDays( double hoursPerDay,double totalHours){

        return (int) (totalHours/ hoursPerDay);
    }


}





