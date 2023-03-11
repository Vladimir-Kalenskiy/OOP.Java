public class Fish extends Animal {
    public Fish(String name, String color) {
        super(name, color, 4);
    }

    public Fish (String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Я рыба, я не умею летать!!! Error!");
    }

    @Override
    public void toGo() {
        System.out.println("Я рыба, я не умею бегать!!! Error!");
    }
}
