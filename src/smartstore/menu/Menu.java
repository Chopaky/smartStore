package smartstore.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    protected Menu() {}

    public static int MainMenu() throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("\n==============================");
        System.out.println(" 1. Classification Parameter");
        System.out.println(" 2. Customer Data");
        System.out.println(" 3. Summary");
        System.out.println(" 4. Quit");
        System.out.println("==============================");
        System.out.print("Choose One: ");

        choice = scanner.nextInt();

        return choice;
    }

}
