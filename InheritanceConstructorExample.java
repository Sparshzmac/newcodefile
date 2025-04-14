class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor called");
    }
}

public class InheritanceConstructorExample {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
