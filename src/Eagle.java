public class Eagle extends Animal {
    public Eagle (String name, String color) {
        super(name, color, 4);
    }

    public Eagle (String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Я орёл, я не умею плавать!!! Error!");
    }

    @Override
    public void toGo() {
        System.out.println("Я орёл, я не умею бегать!!! Error!");
    }
}
