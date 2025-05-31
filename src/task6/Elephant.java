package task6;

public class Elephant extends Mammal {
    private int height;

    public Elephant(String name, int age, int height) {
        super(name, age);
        this.height = height;
    }

    @Override
    public void giveVoice() {
        super.giveVoice();
        System.out.println("WSiuuuuuuuu");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Elephant is moving");
    }

    @Override
    public void animalDescription() {
        super.animalDescription();
        System.out.print("Height: " + height + "\n");
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public void getNaturalEnvironment() {
        super.getNaturalEnvironment();
        System.out.println("Natural Environemnt is savanna");
    }

    @Override
    public void makeSpecialMove() {
        super.makeSpecialMove();
        System.out.println("Elephant is ramming");
    }
}
