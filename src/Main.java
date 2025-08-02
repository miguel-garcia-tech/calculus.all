import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TimeConverter tc = new TimeConverter();


        System.out.println("""
                Select the operation:
                1 - How many hours per day I jave to work for a project
                2 - How many days your project will least
                """);
        int operation = sc.nextInt();


        switch (operation){
            case 1:
                System.out.println("How many hours the full project will least?");
                double totalHours = sc.nextInt();

                System.out.println("How many days you have to finish the project?");
                int daysToComplete = sc.nextInt();

                double hoursForDays = tc.getHoursForDays(totalHours, daysToComplete);
                System.out.println("You have to work "+hoursForDays+" hours per day to complete in "+daysToComplete+" days");

            case 2:
                System.out.println("How many hours per day you will work on this project?");
                double hoursPerDay = sc.nextInt();

                System.out.println("How many hours dos de project will least?");
                totalHours = sc.nextInt();

                int totalDays = tc.getDays(hoursPerDay,totalHours);

                System.out.println("Working "+hoursPerDay+" hours per day you will finish the project in "+totalDays+"days");

        }

    }

}

