import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String user ="";
        String cities = "";

        while (!(user.equals("END"))){
            System.out.println("Please type a city name.");
            user = input.nextLine();
            if (!(user.equals("END")))
                cities = cities +" "+ user;
            System.out.println(cities);
        }
       cities.split(" ");








    }
}