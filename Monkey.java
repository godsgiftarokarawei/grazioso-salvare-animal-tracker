/**
 * Inherits from the RescueAnimal class and adds monkey-specific attributes.
 * @author Godsgift Arokarawei
 */
package com.mycompany.rescueanimal;

public class Monkey extends RescueAnimal {

    // Monkey-specific attributes
    private String species;       // Species of the monkey
    private float tailLength;     // Tail length of the monkey in inches
    private float height;         // Height of the monkey in inches
    private float bodyLength;     // Body length of the monkey in inches

    // Default constructor
    // Initializes the monkey-specific attributes with default values
    public Monkey() {
        super(); // Calls the default constructor of the parent class RescueAnimal
        this.species = "";
        this.tailLength = 0.0f;
        this.height = 0.0f;
        this.bodyLength = 0.0f;
    }

    /**
     * Detailed constructor that takes all the parameters needed for both
     * RescueAnimal attributes and monkey-specific attributes.
     * 
     * @param name - name of the monkey
     * @param species - species of the monkey
     * @param gender - gender of the monkey
     * @param age - age of the monkey in years
     * @param weight - weight of the monkey in pounds
     * @param acquisitionDate - date the monkey was acquired
     * @param acquisitionLocation - location the monkey was acquired from
     * @param trainingStatus - current training status of the monkey
     * @param reserved - whether the monkey is reserved for service
     * @param inServiceCountry - country the monkey is serving in
     * @param tailLength - tail length of the monkey in inches
     * @param height - height of the monkey in inches
     * @param bodyLength - body length of the monkey in inches
     */
    public Monkey(String name, String species, String gender, int age, float weight, 
                  String acquisitionDate, String acquisitionLocation, 
                  String trainingStatus, boolean reserved, String inServiceCountry,
                  float tailLength, float height, float bodyLength) {
        // Call the constructor of RescueAnimal
        super();  // Calls the default constructor of RescueAnimal

        // Initialize parent class (RescueAnimal) attributes
        setName(name);
        setGender(gender);
        setAge(Integer.toString(age));  // Convert int to String for age
        setWeight(Float.toString(weight));  // Convert float to String for weight
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionLocation);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

        // Initialize monkey-specific attributes
        this.species = species;
        this.tailLength = tailLength;
        this.height = height;
        this.bodyLength = bodyLength;
    }

    // Accessor and mutator methods for monkey-specific attributes

    // Get the species of the monkey
    public String getSpecies() {
        return species;
    }

    // Set the species of the monkey
    public void setSpecies(String species) {
        this.species = species;
    }

    // Get the tail length of the monkey
    public float getTailLength() {
        return tailLength;
    }

    // Set the tail length of the monkey
    public void setTailLength(float tailLength) {
        this.tailLength = tailLength;
    }

    // Get the height of the monkey
    public float getHeight() {
        return height;
    }

    // Set the height of the monkey
    public void setHeight(float height) {
        this.height = height;
    }

    // Get the body length of the monkey
    public float getBodyLength() {
        return bodyLength;
    }

    // Set the body length of the monkey
    public void setBodyLength(float bodyLength) {
        this.bodyLength = bodyLength;
    }

    // Override isReserved method from RescueAnimal class
    // Returns whether the monkey is reserved for service
    boolean isReserved() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
