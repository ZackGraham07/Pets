public class Dog extends Pet {
    private String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {return breed;}
    public void setBreed(String breed) {this.breed = breed;}

    public String makeNoise() {return "Woof! I am " + getName() + ", a " + getAge() + " year old " + getBreed();}
}