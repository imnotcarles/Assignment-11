/**
 * The Dog class represents a specific kind of Pet
 * 
 * @author Charles Huang
 * @author Agincourt CI
 * @version 1
 */
public class Dog extends Pet {

    /** The instance variables */
    private String breed;
    private int tricksLearned;

    /** Constructor to create a Dog with species, age, name, vaccination status, and breed 
     * 
     * @param species String of the species
     * @param age Integer of the age
     * @param name String of the name
     * @param isVaccinated Boolean if vaccinated or not
     * @param breed String of the breed
     * @param tricksLearned Integer of how many tricks learned
    */
    public Dog(String species, int age, String name, boolean isVaccinated, String breed, int tricksLearned) {
        super(species, age, name, isVaccinated);
        this.breed = breed;
        this.tricksLearned = tricksLearned;
    }

    /** Constructor to create a Dog with just a name and breed 
     * 
     * @param name String of the name
     * @param breed String of the breed
    */
    public Dog(String name, String breed) {
        super("Dog", 0, name, false);
        this.breed = breed;
        this.tricksLearned = 0;
    }

    /** Gets breed 
     * 
     * @return Method returns the breed
    */
    public String getBreed() {
        return breed;
    }

    /** Gets tricks learned 
     * 
     * @return Method returns the amount of tricks learned
    */
    public int getTricksLearned() {
        return tricksLearned;
    }

    /** Makes the dog learn a trick
     * 
     * @param trickName String of the name of the trick
     * @return Method increases tricks learned and prints what trick has been learned
     */
    public void learnTrick(String trickName) {
        tricksLearned++;
        System.out.println(name + "learned the trick: " + trickName + "!");
    }
    
    /** Checks if the dog qualifies for a competition 
     * 
     * @return Method returns boolean if dog qualifies for competition or not
    */
    public boolean qualifiesForCompetition() {
        return tricksLearned >= 3 && isVaccinated;
    }

    /** Makes the dog bark a number of times 
     * 
     * @param times Integer of number of times the dog barks
     * @returns Method prints the dog's barks the given number of times
    */
    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Woof!");
        }
    }

    /** Checks if the dog is the same breed as another dog
     * 
     * @param dog The dog to compare with
     * @return Method returns if the dog is the same breed as another dog
    */
    public boolean sameBreed(Dog dog) {
        return breed.equalsIgnoreCase(dog.getBreed());
    }

    /** Displays information about the dog 
     * 
     * @return Method returns the information of the dog
    */
    public void dogInfo() {
        petInfo();
        System.out.println("Breed: " + breed);
    }
}