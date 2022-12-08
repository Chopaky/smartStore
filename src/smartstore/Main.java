package smartstore;

import smartstore.menu.CustomerMenu;
import smartstore.menu.Menu;

import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {

		while(true) {
			try{
			int choice = Menu.MainMenu();
			if (choice == 1) {
				System.out.println(choice);
			} else if (choice == 2) {
				CustomerMenu.CustomerMain();
			} else if (choice == 3) {
				System.out.println(choice);
			} else if (choice == 4) {
				System.out.println("Program Finished.");
				break;
			} else {
				System.out.println("Invalid Input. Please try again.");
			}

		} catch(InputMismatchException Exc){
			System.out.println("Invalid Input. Please try again.");
		}
	}
	}
}
