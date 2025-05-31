package task6;

public class Crocodile extends Reptile {
    private int teethCounter;

    public Crocodile(String name, int age, int teethCounter) {
        super(name, age);
        this.teethCounter = teethCounter;
    }

    @Override
    public void giveVoice() {
        super.giveVoice();
        System.out.println("Hakhhhhh");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("the crocodile is crawling");
    }

    @Override
    public void animalDescription() {
        super.animalDescription();
        System.out.println("Body length: " + skinColor);
    }

    public void setTeethCounter(int teethCounter) {
        this.teethCounter = teethCounter;
    }
    @Override
    public void getNaturalEnvironment() {
        super.getNaturalEnvironment();
        System.out.println("Natural Environemnt is swamp");
    }

    @Override
    public void makeSpecialMove() {
        super.makeSpecialMove();
        System.out.println("Crocodile is dancing");
    }
}
