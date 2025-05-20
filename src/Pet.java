/**
 * The Pet class represents an Animal that is domesticated
 * 
 * @author Charles Huang
 * @author Agincourt CI
 * @version 1
 */
public class Pet extends Animal {
    protected String name;
    protected boolean isVaccinated;

    /** Constructor to create a Pet with species, age, name, and vaccination status */
    public Pet(String species, int age, String name, boolean isVaccinated) {
        super(species, age);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    /** Plays with the pet */
    public void play() {
        System.out.println(name + " is playing happily!");
    }

    /** Feeds the pet */
    public void feed() {
        System.out.println(name + " has been fed.");
    }

    /** Displays pet details */
    public void petInfo() {
        displayInfo();
        System.out.println("Name: " + name + ", Vaccinated: " + (isVaccinated ? "Yes" : "No"));
    }
}