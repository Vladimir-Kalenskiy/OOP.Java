public class Whale extends Animal {
    public Whale (String name, String color) {
        super(name, color, 4);
    }

    public Whale (String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Я кит, я не умею летать!!! Error!");
    }

    @Override
    public void toGo() {
        System.out.println("Я кит, я не умею бегать!!! Error!");
    }
}
