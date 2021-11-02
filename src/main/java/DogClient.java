public class DogClient {
    public static void main(String[] args) {

        Dog h = new Dog();
        Dog g = new Dog("Fido", 9, "Dobermann");

        System.out.println(h.getBreed()); // Lab
        System.out.println(g.getBreed()); // Dobermann

        g.setBreed("Poodle");
        System.out.println(g.getBreed()); // Poodle

        g.makeNoise(); // Bark!

        System.out.println(g.toString()); // Fido is a Poodle (Dog)


    }
}