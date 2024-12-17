/**
 *
 * @author Godsgift Arokarawei
 */
package com.mycompany.rescueanimal;
import java.lang.String;

public class RescueAnimal {

    private static Iterable<Monkey> monkeyList;
    private static Iterable<Dog> dogList;

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;


    // Constructor
    public RescueAnimal() {
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAnimalType() {
		return animalType;
	}


	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getAcquisitionDate() {
		return acquisitionDate;
	}


	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}


	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}


	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}


	public boolean getReserved() {
		return reserved;
	}


	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}


	public String getInServiceLocation() {
		return inServiceCountry;
	}


	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}




	public String getTrainingStatus() {
		return trainingStatus;
	}


	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
public static void printAnimals(String listType) {
    if (listType.equalsIgnoreCase("dog")) {
        for (Dog dog : dogList) {
            // Print dog attributes using getter methods
            System.out.println("Name: " + dog.getName());
            System.out.println("Breed: " + dog.getBreed());
            System.out.println("Gender: " + dog.getGender());
            System.out.println("Age: " + dog.getAge());
            System.out.println("Weight: " + dog.getWeight());
            System.out.println("Acquisition Date: " + dog.getAcquisitionDate());
            System.out.println("Acquisition Location: " + dog.getAcquisitionLocation());
            System.out.println("Training Status: " + dog.getTrainingStatus());
            System.out.println("Reserved: " + dog.getReserved());
            System.out.println("In Service Location: " + dog.getInServiceLocation());
            System.out.println();  // Blank line between entries
        }
    } else if (listType.equalsIgnoreCase("monkey")) {
        for (Monkey monkey : monkeyList) {
            // Print monkey attributes using getter methods
            System.out.println("Name: " + monkey.getName());
            System.out.println("Species: " + monkey.getSpecies());
            System.out.println("Gender: " + monkey.getGender());
            System.out.println("Age: " + monkey.getAge());
            System.out.println("Weight: " + monkey.getWeight());
            System.out.println("Tail Length: " + monkey.getTailLength());
            System.out.println("Height: " + monkey.getHeight());
            System.out.println("Body Length: " + monkey.getBodyLength());
            System.out.println("Acquisition Date: " + monkey.getAcquisitionDate());
            System.out.println("Acquisition Location: " + monkey.getAcquisitionLocation());
            System.out.println("Training Status: " + monkey.getTrainingStatus());
            System.out.println("Reserved: " + monkey.getReserved());
            System.out.println("In Service Location: " + monkey.getInServiceLocation());
            System.out.println();  // Blank line between entries
        }
    } else if (listType.equalsIgnoreCase("available")) {
        System.out.println("Available animals:");
        for (Dog dog : dogList) {
            if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                System.out.println("Name: " + dog.getName());
                System.out.println("Breed: " + dog.getBreed());
                System.out.println("In Service Location: " + dog.getInServiceLocation());
                System.out.println();  // Blank line between entries
            }
        }
        for (Monkey monkey : monkeyList) {
            if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                System.out.println("Name: " + monkey.getName());
                System.out.println("Species: " + monkey.getSpecies());
                System.out.println("In Service Location: " + monkey.getInServiceLocation());
                System.out.println();  // Blank line between entries
            }
        }
    } else {
        System.out.println("Invalid option.");
    }
}

}
