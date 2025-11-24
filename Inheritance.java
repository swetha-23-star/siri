// Superclass (Parent Class)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass (Child Class) extending Animal
class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name); // Call the constructor of the superclass
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " the " + breed + " is barking.");
    }

    // Overriding the eat method from the superclass
    @Override
    public void eat() {
        System.out.println(name + " the " + breed + " is happily eating dog food.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Access methods inherited from the Animal class
        myDog.eat();    // Calls the overridden eat method in Dog
        myDog.sleep();  // Calls the sleep method from Animal

        // Access method specific to the Dog class
        myDog.bark();

        // Demonstrate accessing superclass members directly (if not overridden)
        Animal genericAnimal = new Animal("Lion");
        genericAnimal.eat();
    }
}
