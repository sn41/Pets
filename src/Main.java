public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Бублик", 1000, "Мяу"),
                new Dog("Колобок", 10, "Гав"),
                new Bird("Кешка", 0.5f, "КЕША ПИРАТ"),
                new Fish("Goldfish", 0.01f)
        };
        for( Animal animal:animals){
            animal.eat(10);
            if(animal instanceof Speaker){
                ((Speaker) animal).say();
            }
        }
    }
}

class Animal {
    private String name;
    private float satisfactionLevel = 20;
    private float satiety;

    public Animal(String name, float satisfactionLevel) {
        this.satisfactionLevel = satisfactionLevel;
    }
    float eat(float eat){
         satiety +=  eat;
         return satiety;
    }
}

class Speaker extends Animal {
    String speech;
    public Speaker(String name, float satisfactionLevel, String speech) {
        super(name, satisfactionLevel);
        this.speech = speech;
    }
    void say(){

    }
}

class Dog extends Speaker {
    public Dog(String name, float satisfactionLevel, String speech) {
        super(name, satisfactionLevel, speech);
    }
}

class Cat extends Speaker {
    public Cat(String name, float satisfactionLevel, String speech) {
        super(name, satisfactionLevel, speech);
    }
}

class Bird extends Dog {
    public Bird(String name, float satisfactionLevel, String speech) {
        super(name, satisfactionLevel, speech);
    }
}

class Fish extends Animal {
    public Fish(String name, float satisfactionLevel) {
        super(name, satisfactionLevel);
    }
}