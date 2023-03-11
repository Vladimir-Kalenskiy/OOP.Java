public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        super(name);
    }

    public void hunt() {
        wakeUp();
        findFoot();
        eat();
    }

    private void wakeUp() {
        System.out.println("Сat проснулся.");
    }

    private void findFoot() {
        System.out.println("Cat ищет еду.");
    }

    private void eat() {
        System.out.println("Cat кушает.");
    }

    public void toPlay() {
        System.out.println("Cat играет.");
    }

    public void goToSleep() {
        System.out.println("Cat ложится спать.");
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void fly() {
        System.out.println("Я кот, я не умею летать!!! Error!");
    }

    @Override
    public void swim() {
        System.out.println("Я кот, я не умею плавать!!! Error!");
    }
}

