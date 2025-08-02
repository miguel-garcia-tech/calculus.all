import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TimeConverter tc = new TimeConverter();
        int operation = 0;

        while (operation != 3) {

            System.out.println("""
                Select the operation:
                1 - How many hours per day I jave to work for a project
                2 - How many days your project will least
                3 - Exit
                """);
            operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("How many hours the full project will least?");
                    double totalHours = sc.nextDouble();

                    System.out.println("How many days you have to finish the project?");
                    int daysToComplete = sc.nextInt();

                    double hoursPerDay = tc.getHoursForDays(totalHours, daysToComplete);
                    System.out.println("You have to work " + hoursPerDay + " hours per day to complete in " + daysToComplete + " days");
                    break;

                case 2:
                    System.out.println("How many hours per day you will work on this project?");
                    hoursPerDay = sc.nextInt();

                    System.out.println("How many hours will the project take in total?");
                    totalHours = sc.nextInt();
                    hoursPerDay = round(hoursPerDay);

                    int totalDays = tc.getDays(hoursPerDay, totalHours);

                    System.out.println("Working " + hoursPerDay + " hours per day you will finish the project in " + totalDays + " days");
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");


            }
        }
    }

}

