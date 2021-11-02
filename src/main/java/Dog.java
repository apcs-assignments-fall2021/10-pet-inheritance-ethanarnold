public class Dog extends Pet {
//    Private instance variables for name, age, and breed
//    Two constructors to create a Dog (one default and one with three parameters)
//    makeNoise(): a non-static method that just prints out an appropriate animal noise for a Dog
//    toString() method to print out the Dog's name, age, and breed
//    Getters and setters for all three variables

    private String breed;

    public Dog (String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public Dog() {
        super("Hal", 9000);
        this.breed = "Lab";
    }

    public void makeNoise() {
        System.out.println("Bark!");
    }

    @Override
    public String toString() {
        return this.getName() + " is a " + this.breed + " (Dog)";
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}