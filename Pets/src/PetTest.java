import java.util.*;
import java.io.*;

public class PetTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        Pet[] pets = new Pet[5];
        String[] cBreeds = {"Siamese", "Persian", "Maine Coon"};
        String[] dBreeds = {"Labrador", "Golden Retriever", "German Shepherd"};
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < pets.length; i++) {
            System.out.print("Enter pet type (dog/cat): ");
            String type = scanner.nextLine().trim().toLowerCase();
            if (type.equals("dog")) {
                System.out.print("Enter dog's name: ");
                String name = scanner.nextLine().trim();
                int age = rand.nextInt(10);
                String breed = dBreeds[rand.nextInt(dBreeds.length)];
                pets[i] = new Dog(name, age, breed);
                dogCount++;
            } else if (type.equals("cat")) {
                System.out.print("Enter cat's name: ");
                String name = scanner.nextLine().trim();
                int age = rand.nextInt(10);
                String breed = cBreeds[rand.nextInt(cBreeds.length)];
                pets[i] = new Cat(name, age, breed);
                catCount++;
            } else {
                System.out.println("Invalid pet type. Please enter 'dog' or 'cat'.");
                i--;
            }
        }
        System.out.println("Number of dogs: " + dogCount);
        System.out.println("Number of cats: " + catCount);
        while(true){
            System.out.print("Enter pet name to make noise or 'exit' to quit: ");
            String name = scanner.nextLine().trim();
            if(name.equals("exit")) {
                break;
            }
            for(Pet pet : pets) {
                if(pet != null && pet.getName().equals(name)) {
                    System.out.println(pet.makeNoise());
                    break;
                }
            }
        }
    }
}
