import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Trip> trips = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);



        Trip trip1 = new Trip("Finland", 12, "Copenhagen", "ski");
        Trip trip2 = new Trip("Australia", 20, "Sydney", "Beach");


        System.out.print("Create trip:");
        String trip = scanner.nextLine();

        System.out.println("List trips");
        String list = scanner.nextLine();

        






    }
}