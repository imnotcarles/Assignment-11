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

    /** Constructor to create an Animal with species and age */
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    /** Makes the animal make a sound */
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    /** Increases the age of the animal by one year */
    public void grow() {
        age++;
        System.out.println(species + " is now " + age + " years old.");
    }

    /** Displays information about the animal */
    public void displayInfo() {
        System.out.println("Species: " + species + ", Age: " + age);
    }
}