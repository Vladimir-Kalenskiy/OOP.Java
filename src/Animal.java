public class Animal {
    private String name;
    private String color;
    private int pawsCount;

    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
    }

    public void toGo() {
        System.out.println(getType() + " - побежал!");
    }

    public void fly() {
        System.out.println(getType() + " - полетел!");
    }

    public void swim() {
        System.out.println(getType() + " - поплыл!");
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public void speak() {
        System.out.println("Yarr!!!");
    }


    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Цвет: %s", this.name, this.color);
    }
}
