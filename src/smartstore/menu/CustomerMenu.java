package smartstore.menu;

import smartstore.customers.Customer;
import smartstore.customers.Customers;
import smartstore.exception.InputEmptyException;
import smartstore.exception.InputFormatException;
import smartstore.exception.InputRangeException;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerMenu extends Menu {

    static Scanner scanner = new Scanner(System.in);
    public static Customers allOfCustomers = new Customers();

    public static void CustomerMain() {
        int choice = 0;


        while (true) {
            try {
                DisplayMenu();
                choice = scanner.nextInt();
                if (choice == 1) {
                    AddCustomerData();
                } else if (choice == 2) {
                    ViewCustomerData();
                } else if (choice == 3) {
                    UpdateCustomerData();
                } else if (choice == 4) {
                    DeleteCustomerData();
                } else if (choice == 5) {
                    return;
                } else {
                    System.out.println("Invalid Input. Please try again.");
                }
            } catch (InputMismatchException Exc) {
                System.out.println("Invalid Input. Please try again.");
                scanner.nextLine();
            }
        }

    }

    private static void AddCustomerData() {
        int customers = 0;
        System.out.println("How many customers to input?");
        customers = scanner.nextInt();

        for (int i = 0; i < customers; i++) {
            int choice = scanner.nextInt();

            System.out.println();
            System.out.println("==============================");
            System.out.println(" 1. Customer Name");
            System.out.println(" 2. Customer ID");
            System.out.println(" 3. Customer Spent Time");
            System.out.println(" 4. Customer Total Pay");
            System.out.println(" 5. Back");
            System.out.println("==============================");
            System.out.print("Choose One: ");

        while(true){
            if(choice == 1){
                setCustomerName()
            }
            if(choice == 2){}
            if(choice == 3){}
            if(choice == 4){}
            if(choice == 5){
                return;
            }

        }
        }
    }

    private static void ViewCustomerData() {
    }

    private static void UpdateCustomerData() {
    }

    private static void DeleteCustomerData() {
    }

    private static void DisplayMenu() {
        System.out.println("\n==============================");
        System.out.println(" 1. Add Customer Data");
        System.out.println(" 2. View Customer Data");
        System.out.println(" 3. Update Customer Data");
        System.out.println(" 4. Delete Customer Data");
        System.out.println(" 5. Back");
        System.out.println("==============================");
        System.out.print("Choose One: ");
    }

    public static void setCustomerName(Customer customer) {
        while(true) {
            try {
                System.out.print("Input Customer's Name: ");
                String REGEX = "^[a-zA-Z]{3,}$";

                String name = scanner.next();
                if (name != null && !name.equals("")) {
                    if (Pattern.matches(REGEX, name)) {
                        customer.setName(name);
                        return;
                    }
                    throw new InputFormatException();
                }

                throw new InputEmptyException();
            } catch (InputEmptyException exc) {
                System.out.println("Empty Input. Please input something.");
            } catch (InputFormatException exc) {
                System.out.println("Invalid Format for Input. Please try again.");
            }
        }
    }

    public static void setCustomerUserID(Customer customer) {
        while(true) {
            try {
                System.out.println();
                System.out.print("Input Customer's UserID: ");
                String REGEX = "^[a-zA-Z]{1}[a-zA-Z0-9_]{4,11}$";
                String userID = scanner.next();
                if (userID != null && !userID.equals("")) {
                    if (Pattern.matches(REGEX, userID)) {
                        customer.setUserID(userID);
                        return;
                    }

                    throw new InputFormatException();
                }

                throw new InputEmptyException();
            } catch (InputEmptyException var3) {
                System.out.println("Empty Input. Please input something.");
            } catch (InputFormatException var4) {
                System.out.println("Invalid Format for Input. Please try again.");
            }
        }
    }

    public static void setCustomerSpentTime(Customer customer) {
        while(true) {
            try {
                System.out.println();
                System.out.print("Input Customer's Spent Time at Your Store: ");
                int spentTime = Integer.parseInt(scanner.next());
                if (spentTime < 0) {
                    throw new InputRangeException();
                }

                customer.setSpentTime(spentTime);
                return;
            } catch (NumberFormatException exception) {
                System.out.println("Invalid Type for Input. Please try again.");
            } catch (InputRangeException exception) {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }

    public static void setCustomerTotalPay(Customer customer) {
        while(true) {
            try {
                System.out.println();
                System.out.print("Input Customer's Total Payment at Your Store: ");
                int totalPay = Integer.parseInt(scanner.next());
                if (totalPay < 0) {
                    new InputRangeException();
                }

                customer.setTotalPay(totalPay);
                return;
            } catch (NumberFormatException var2) {
                System.out.println("Invalid Type for Input. Please try again.");
            }
        }
    }
}
