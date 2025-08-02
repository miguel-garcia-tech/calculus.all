import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double hoursWorked = 10;
        double totalHours = 100;
        int daysToComplete = 10;
        double minutesWorked = 0;
        double hoursForDays = 0;
        Scanner sc = new Scanner(System.in);
        TimeConverter tc = new TimeConverter();


        System.out.println("""
                Select the operation:
                1 - How many hours per day I jave to work for a project
                
                """);
        int operation = sc.nextInt();


        switch (operation){
            case 1:
                System.out.println("How many hours the full project will least?");
                totalHours = sc.nextInt();

                System.out.println("How many days you have to finish the project?");
                daysToComplete = sc.nextInt();

                hoursForDays = tc.getHoursForDays(totalHours, daysToComplete);
                System.out.println("You have to work "+hoursForDays+" hours per day to complete in "+daysToComplete+" days");
        }

    }

}

