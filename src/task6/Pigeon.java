package task6;

public class Pigeon extends Bird {
    private int wingspan;
    public Pigeon(String name, int age, int wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    @Override
    public void giveVoice() {
        super.giveVoice();
        System.out.println("Gruu Gruu");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Pigeon is walking ");
    }

    @Override
    public void animalDescription() {
        super.animalDescription();
        System.out.println("wingspan " + wingspan);
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public void getNaturalEnvironment() {
        super.getNaturalEnvironment();
        System.out.println("Natural environment is Polish town Warsaw");

    }

    @Override
    public void makeSpecialMove() {
        super.makeSpecialMove();
        System.out.println("Pigeon is eating a bread");
    }

}
