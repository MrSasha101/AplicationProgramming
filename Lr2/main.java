import model.Train;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Train[] trains = {
                new Train("Kyiv", 101, "08:30", 50, 20, 40, 10),
                new Train("Lviv", 202, "12:45", 0, 15, 30, 5),
                new Train("Odesa", 303, "19:00", 60, 25, 35, 15),
                new Train("Kyiv", 404, "22:10", 10, 30, 50, 20),
                new Train("Lviv", 505, "06:15", 0, 20, 25, 10)
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть пункт призначення: ");
        String destination = sc.nextLine();
        printByDestination(trains, destination);

        System.out.print("\nВведіть пункт призначення: ");
        destination = sc.nextLine();
        System.out.print("Введіть мінімальний час (hh:mm): ");
        String time = sc.nextLine();
        printByDestinationAfterTime(trains, destination, time);

        System.out.print("\nВведіть пункт призначення: ");
        destination = sc.nextLine();
        printWithGeneralSeats(trains, destination);
    }

    public static void printByDestination(Train[] trains, String destination) {
        System.out.println("\nПоїзди до " + destination + ":");
        for (Train t : trains) {
            if (t.getDestination().equalsIgnoreCase(destination)) {
                System.out.println(t);
            }
        }
    }

    public static void printByDestinationAfterTime(Train[] trains, String destination, String time) {
        System.out.println("\nПоїзди до " + destination + " після " + time + ":");
        for (Train t : trains) {
            if (t.getDestination().equalsIgnoreCase(destination) &&
                    t.getDepartureTime().compareTo(time) > 0) {
                System.out.println(t);
            }
        }
    }


    public static void printWithGeneralSeats(Train[] trains, String destination) {
        System.out.println("\nПоїзди до " + destination + " з наявними загальними місцями:");
        for (Train t : trains) {
            if (t.getDestination().equalsIgnoreCase(destination) && t.getGeneralSeats() > 0) {
                System.out.println(t);
            }
        }
    }
}
