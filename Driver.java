/**
 * 
 * This class handles the main menu and various operations like adding new animals,
 * reserving them, and displaying available animals in the system.
 *
 * @author Godsgift Arokarawei
 */
package com.mycompany.rescueanimal;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    // Animal lists to store Dog and Monkey objects
    private static ArrayList<Dog> dogList = new ArrayList<>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<>();

    // Main method - entry point for the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner for user input
        boolean exit = false;  // To control menu loop

        // Initialize animal lists for testing purposes
        initializeDogList();
        initializeMonkeyList();

        // Menu loop to interact with user until they decide to exit
        while (!exit) {
            displayMenu();  // Display the main menu
            String userInput = scanner.nextLine().trim();  // Get user's choice

            switch (userInput) {
                case "1":
                    intakeNewDog(scanner);  // Add new dog to the system
                    break;
                case "2":
                    intakeNewMonkey(scanner);  // Add new monkey to the system
                    break;
                case "3":
                    reserveAnimal(scanner);  // Reserve an animal
                    break;
                case "4":
                    printAnimals("dog");  // Print all dogs
                    break;
                case "5":
                    printAnimals("monkey");  // Print all monkeys
                    break;
                case "6":
                    printAnimals("available");  // Print all available animals
                    break;
                case "q":
                case "Q":
                    exit = true;  // Exit the application
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid input. Please select a valid option from the menu.");  // Input validation
            }
        }
        scanner.close();  // Close the scanner when the program exits
    }

    // Method to display the main menu
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println("Enter a menu selection:");
    }

    // Initialize sample dog data for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Initialize sample monkey data for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Bobo", "Capuchin", "male", 3, 15.2f, "01-01-2021", "Brazil", "in service", false, "Brazil", 25.5f, 15.3f, 20.0f);
        monkeyList.add(monkey1);
    }

    // Method to intake a new dog with validation
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("Enter dog's name:");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("This dog is already in the system.");
                return;
            }
        }

        // Input for remaining attributes
        System.out.println("Enter dog's breed:");
        String breed = scanner.nextLine();
        System.out.println("Enter dog's gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter dog's age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter dog's weight:");
        float weight = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter acquisition date:");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Enter acquisition location:");
        String acquisitionLocation = scanner.nextLine();
        System.out.println("Enter training status:");
        String trainingStatus = scanner.nextLine();

        // Create new Dog object and add to list
        Dog newDog = new Dog(name, breed, gender, Integer.toString(age), Float.toString(weight), acquisitionDate, acquisitionLocation, trainingStatus, false, acquisitionLocation);
        dogList.add(newDog);
        System.out.println("New dog added.");
    }

    // Method to intake a new monkey with validation
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("Enter monkey's name:");
        String name = scanner.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("This monkey is already in the system.");
                return;
            }
        }

        // Input validation for species
        System.out.println("Enter monkey's species:");
        String species = scanner.nextLine();
        if (!isValidMonkeySpecies(species)) {
            System.out.println("Invalid species. Allowed species: Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin.");
            return;
        }

        // Input for remaining attributes
        System.out.println("Enter monkey's gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter monkey's age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter monkey's weight:");
        float weight = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter tail length:");
        float tailLength = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter height:");
        float height = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter body length:");
        float bodyLength = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter acquisition date:");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Enter acquisition location:");
        String acquisitionLocation = scanner.nextLine();
        System.out.println("Enter training status:");
        String trainingStatus = scanner.nextLine();

        // Create new Monkey object and add to list
        Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionLocation, trainingStatus, false, acquisitionLocation, tailLength, height, bodyLength);
        monkeyList.add(newMonkey);
        System.out.println("New monkey added.");
    }

    // Validate monkey species based on the allowed types
    public static boolean isValidMonkeySpecies(String species) {
        String[] validSpecies = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin"};
        for (String valid : validSpecies) {
            if (valid.equalsIgnoreCase(species)) {
                return true;
            }
        }
        return false;
    }

    // Method to reserve an animal based on type and location
    public static void reserveAnimal(Scanner scanner) {
    System.out.println("Enter animal type (dog or monkey):");
    String type = scanner.nextLine();
    System.out.println("Enter country of service:");
    String country = scanner.nextLine();

    if (type.equalsIgnoreCase("dog")) {
        for (Dog dog : dogList) {
            if (dog.getInServiceLocation().equalsIgnoreCase(country) && !dog.getReserved() && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
                dog.setReserved(true);
                System.out.println(dog.getName() + " has been reserved.");
                return;
            }
        }
    } else if (type.equalsIgnoreCase("monkey")) {
        for (Monkey monkey : monkeyList) {
            if (monkey.getInServiceLocation().equalsIgnoreCase(country) && !monkey.getReserved() && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
                monkey.setReserved(true);
                System.out.println(monkey.getName() + " has been reserved.");
                return;
            }
        }
    } else {
        System.out.println("Invalid animal type.");
    }

    System.out.println("No available animals found for your request.");
}

    // Method to print the details of animals based on the list type
public static void printAnimals(String listType) {
    if (listType.equalsIgnoreCase("dog")) {
        for (Dog dog : dogList) {
            // Print the dog's attributes manually
            System.out.println("Dog [Name: " + dog.getName() + 
                               ", Breed: " + dog.getBreed() + 
                               ", Gender: " + dog.getGender() + 
                               ", Age: " + dog.getAge() + 
                               ", Weight: " + dog.getWeight() + 
                               ", Acquisition Date: " + dog.getAcquisitionDate() + 
                               ", Acquisition Location: " + dog.getAcquisitionLocation() + 
                               ", Training Status: " + dog.getTrainingStatus() + 
                               ", Reserved: " + dog.getReserved() + 
                               ", In Service Location: " + dog.getInServiceLocation() + "]");
            System.out.println();  // Blank line for readability
        }
    } else if (listType.equalsIgnoreCase("monkey")) {
        for (Monkey monkey : monkeyList) {
            // Print the monkey's attributes manually
            System.out.println("Monkey [Name: " + monkey.getName() + 
                               ", Species: " + monkey.getSpecies() + 
                               ", Gender: " + monkey.getGender() + 
                               ", Age: " + monkey.getAge() + 
                               ", Weight: " + monkey.getWeight() + 
                               ", Tail Length: " + monkey.getTailLength() + 
                               ", Height: " + monkey.getHeight() + 
                               ", Body Length: " + monkey.getBodyLength() + 
                               ", Acquisition Date: " + monkey.getAcquisitionDate() + 
                               ", Acquisition Location: " + monkey.getAcquisitionLocation() + 
                               ", Training Status: " + monkey.getTrainingStatus() + 
                               ", Reserved: " + monkey.getReserved() + 
                               ", In Service Location: " + monkey.getInServiceLocation() + "]");
            System.out.println();  // Blank line for readability
        }
    } else if (listType.equalsIgnoreCase("available")) {
        System.out.println("Available animals:");
        for (Dog dog : dogList) {
            if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                // Print available dogs' details
                System.out.println("Dog [Name: " + dog.getName() + 
                                   ", Breed: " + dog.getBreed() + 
                                   ", In Service Location: " + dog.getInServiceLocation() + "]");
                System.out.println();  // Blank line for readability
            }
        }
        for (Monkey monkey : monkeyList) {
            if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                // Print available monkeys' details
                System.out.println("Monkey [Name: " + monkey.getName() + 
                                   ", Species: " + monkey.getSpecies() + 
                                   ", In Service Location: " + monkey.getInServiceLocation() + "]");
                System.out.println();  // Blank line for readability
            }
        }
    } else {
        System.out.println("Invalid option.");
    }
}
}
