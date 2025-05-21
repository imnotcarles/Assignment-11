/**
 * The Pet class represents an Animal that is domesticated
 * 
 * @author Charles Huang
 * @author Agincourt CI
 * @version 1
 */
public class Pet extends Animal {

    /** The instance variables */
    protected String name;
    protected boolean isVaccinated;

    /** Constructor to create a Pet with species, age, name, and vaccination status 
     * 
     * @param species String of the species
     * @param age Integer of the age
     * @param name String of the name
     * @param isVaccinated Boolean if vaccinated or not
    */
    public Pet(String species, int age, String name, boolean isVaccinated) {
        super(species, age);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    /** Gets name 
     * 
     * @return Method returns the name
    */
    public String getName() {
        return name;
    }

    /** Gets is vaccinated 
     * 
     * @return Method returns is vaccinated or not
    */
    public boolean isVaccinated() {
        return isVaccinated;
    }

    /** Sets name 
     * 
     * @return Method sets a new name
    */
    public void setName(String name){
        this.name = name;
    }

    /** Feeds the pet 
     * 
     * @return Method returns that the pet has been fed
    */
    public void feedPet() {
        System.out.println(name + " has been fed!");
    }

    /** Takes pet to the vet
     * 
     * @param isVaccinated Boolean if the pet is vaccinated or not
     * @return Method vaccinates pet if it has not been vaccinated yet and updates boolean
    */
    public void goToVet(boolean isVaccinated) {
        if (!isVaccinated) {
            isVaccinated = true;
            System.out.println(name + " has been vaccinated!");
        } else {
            System.out.println(name + " is already vaccinated.");
        }
    }

    /** Checks if the pet has the same name as another pet
     * 
     * @param pet The pet to compare with
     * @return Method returns if the pet has the same name as another pet
    */
    public boolean sameName(Pet pet) {
        return name.equalsIgnoreCase(pet.getName());
    }

    /** Displays information about the pet 
     * 
     * @return Method returns the information of the pet 
    */
    public void petInfo() {
        displayInfo();
        System.out.println("Name: " + name + "\nVaccinated: " + (isVaccinated ? "Yes" : "No"));
    }
}