public class Duck extends Animal {
    public Duck (String name, String color) {
        super(name, color, 2);
    }

    public Duck (String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println("Quack!");
    }

    @Override
    public void toGo() {
        System.out.println("Я утка, я не умею бегать!!! Error!");
    }
}
