/**
 * The Animal class represents a general animal
 * 
 * @author Charles Huang
 * @author Agincourt CI
 * @version 1
 */
public class Animal {

    /** The instance variables */
    protected String species;
    protected int age;

    /** Constructor to create an Animal with species and age
     * 
     * @param species String of the species
     * @param age Integer of the age
     */
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    /** Gets species 
     * 
     * @return Method returns the species
    */
    public String getSpecies() {
        return species;
    }

    /** Gets age 
     * 
     * @return Method returns the age
    */
    public int getAge() {
        return age;
    }

    /** Increases the age of the animal by a number of years
     * 
     * @param years Integer of how many years to grow by
     * @return Method increases age by given years and returns new age of animal
     */
    public void growAnimal(int years) {
        if (years > 0) {
            age += years;
            System.out.println(species + " is now " + age + " years old.");
        }
    }

    /** Converts age to age in animal years 
     * 
     * @param animalYears Integer of the multiplier to convert to animal years
     * @return Method returns age of the animal in animal years
    */
    public int ageInAnimalYears(int animalYears) {
        return age * animalYears;
    }

    /** Determine if the animal is older than another animal 
     * 
     * @param animal The animal to compare with
     * @return Method returns if the animal is older than another animal
    */
    public boolean isOlderThan(Animal animal) {
        return age > animal.getAge();
    }

    /** Checks if the animal is the same species as another animal 
     * 
     * @param animal The animal to compare with
     * @return Method returns if the animal is the same species as another animal
    */
    public boolean sameSpecies(Animal animal) {
        return species.equalsIgnoreCase(animal.getSpecies());
    }

    /** Displays information about the animal 
     * 
     * @return Method returns the information of the animal
    */
    public void displayInfo() {
        System.out.println("Species: " + species + "\nAge: " + age);
    }
}