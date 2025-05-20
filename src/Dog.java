/**
 * The Dog class represents a specific kind of Pet
 * 
 * @author Charles Huang
 * @author Agincourt CI
 * @version 1
 */
public class Dog extends Pet {
    private String breed;

    /** Constructor to create a Dog with species, age, name, vaccination status, and breed */
    public Dog(String species, int age, String name, boolean isVaccinated, String breed) {
        super(species, age, name, isVaccinated);
        this.breed = breed;
    }

    /** Constructor to create a Dog with just a name and breed (defaults others) */
    public Dog(String name, String breed) {
        super("Dog", 0, name, false);
        this.breed = breed;
    }

    /** Makes the dog bark */
    public void bark() {
        System.out.println(getName() + " says: Woof!");
    }

    /** Teaches the dog a new trick */
    public void learnTrick(String trick) {
        System.out.println(getName() + " learned a new trick: " + trick + "!");
    }

    /** Displays dog details */
    public void dogInfo() {
        petInfo();
        System.out.println("Breed: " + breed);
    }

    /** Helper method to access the pet's name using reflection of toString() */
    private String getName() {
        String info = toString();
        if (info.contains("name=")) {
            int start = info.indexOf("name=") + 5;
            int end = info.indexOf(",", start);
            return info.substring(start, end);
        }
        return "Unknown";
    }
}