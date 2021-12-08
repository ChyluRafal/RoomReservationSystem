import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String hotelName = "Overlook";
        int systemVersion = 1;
        boolean isDeveloperVersion = true;


        showSystemInfo(hotelName, systemVersion, isDeveloperVersion);
        Scanner input = new Scanner(System.in);
        int option = getActionFromUser(input);
        if (option == 1) {
            Guest newGuest = createNewGuest(input);
        } else if (option == 2) {
            Room newRoom = createNewRoom(input);
        } else if (option == 3) {
            System.out.println("Wybrano opcję 3.");
        } else {
            System.out.println("Wybrano niepoprawną akcję.");
        }
    }
    private static void showSystemInfo(String hotelName, int systemVersion, boolean isDeveloperVersion) {
        System.out.print("Witam w systemie rezerwacji dla hotelu " + hotelName);
        System.out.println("Aktualna wersja systemu: " + systemVersion);
        System.out.println("Wersja developerska: " + isDeveloperVersion);

        System.out.println("\n=========================\n");
    }
    private static int getActionFromUser(Scanner in) {
        System.out.println("1. Dodaj nowego gościa.");
        System.out.println("2. Dodaj nowy pokój.");
        System.out.println("3. Wyszukaj gościa.");
        System.out.print("Wybierz opcję: ");
        int option = 0;
        try {
            option = in.nextInt();
        } catch (Exception e) {
            System.out.println("Niepoprawne dane wejsciowe, wprowadz liczbę.");
            e.printStackTrace();
        }
        return option;
    }
    private static Guest createNewGuest(Scanner input) {
        System.out.println("\nTworzymy nowego gościa.");
        try {
            System.out.print("Podaj imię: ");
            String firstName = input.next();
            System.out.print("Podaj nazwisko: ");
            String lastName = input.next();
            System.out.print("Podaj wiek: ");
            int age = input.nextInt();
            Guest newGuest = new Guest(firstName, lastName, age);
            System.out.println(newGuest.getInfoGuest());
            return newGuest;
        } catch (Exception e) {
            System.out.println("Zły wiek, używaj liczb.");
            return null;
        }
    }
    private static Room createNewRoom(Scanner input) {
        System.out.println("\nTworzymy nowy pokój.");
        try {
            System.out.print("Numer: ");
            int number = input.nextInt();
            Room newRoom = new Room(number, chooseBedType(input));
            System.out.println(newRoom.getInfoRoom());
            return newRoom;
        } catch (Exception e) {
            System.out.println("Używaj liczb.");
            e.printStackTrace();
            return null;
        }
    }
    private static BedType chooseBedType(Scanner input) {
        System.out.println("1. Łóżko pojedyńcze.");
        System.out.println("2. Łóżko podwójne.");
        System.out.println("3. Królewskie.");
        System.out.print("Wybierz opcję: ");
        BedType bedType = BedType.SINGLE;
        int bedTypeOption = 0;
        try {
            bedTypeOption = input.nextInt();
        } catch (Exception e) {
            System.out.println("Niepoprawne dane wejsciowe, wprowadz liczbę.");
            e.printStackTrace();
        }
        if (bedTypeOption == 1) {
            bedType = BedType.SINGLE;
        } else if (bedTypeOption == 2) {
            bedType = BedType.DOUBLE;
        } else if (bedTypeOption == 3) {
            bedType = BedType.KING_SIZE;
        }
        return bedType;
    }
}