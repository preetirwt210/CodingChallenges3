package academy.learnprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*private static Scanner scanner=new Scanner(System.in);
   private static GroceryList groceryList=new GroceryList();*/
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("999999999");

    public static void main(String[] args) {
        // write your code here
      /*  SortedArray sa=new SortedArray();
        int[] myIntegers=SortedArray.getIntegers(5);
        int[] sortedArray= SortedArray.sortIntegers(myIntegers);
       SortedArray.printArray(sortedArray);

      int wow=MinimumElement.readInteger();
      int[] ok=MinimumElement.readElements(wow);
      System.out.println("Minimum value in the array is: "+ MinimumElement.findMin(ok) );

      int[] array=new int[]{1,5,9,7,5};
      ReverseArray.reverse(array);

      boolean quit=false;
      int choice=0;
      printInstructions();
      while(!quit){
          System.out.println("Enter your choice: ");
          choice = scanner.nextInt();
          scanner.nextLine();

          switch(choice){
              case 0: printInstructions();
                       break;
              case 1: groceryList.printGroceryList();
                  break;
              case 2: addItem();
                  break;
              case 3: modifyItem();
                  break;
              case 4: removeItem();
                  break;
              case 5: searchForItem();
                  break;
              case 6: quit=true;
                  break;
          }
      }
    }

    public static void printInstructions(){

        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options. ");
        System.out.println("\t 1 - To print the list of grocery Items. ");
        System.out.println("\t 2 - To add an item in the list. ");
        System.out.println("\t 3 - to modify an item in the list.");
        System.out.println("\t 4 -  To remove an item from the list.");
        System.out.println("\t 5 - To search an item in the list.");
        System.out.println("\t 6 - To quit the application");

    }
    public static void addItem(){
        System.out.println("Enter the grocery Items : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter item number : ");
        int itemNumber=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem=scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber-1,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter item number : ");
        int itemNo= scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }
    public static void searchForItem(){
        System.out.println("Item to search for : ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem)!=null){
            System.out.println("Found "+ searchItem + " in our grocery list");
        }
       else{
           System.out.println(searchItem + " is not in the list.");
        }
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }

        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: "); */

      ISaveable value1=new Monster("Werewolf",20,40);
      List values=value1.write();
      value1.read(values);
      System.out.println(value1.toString());
        ISaveable value2=new Player("Tim",10,15);
        List values2=value2.write();
        value2.read(values2);
        System.out.println(value2.toString());
    }
}
