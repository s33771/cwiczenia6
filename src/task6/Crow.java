package task6;

public class Crow extends Bird {
    private String featherColor;

    public Crow(String name, int age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }

    @Override
    public void giveVoice() {
        super.giveVoice();
        System.out.println("CROOOW CROOOW");
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Crow is flying");

    }

    @Override
    public void animalDescription() {
        super.animalDescription();
        System.out.println("Feather color: " + featherColor);
    }
    @Override
    public void getNaturalEnvironment() {
        super.getNaturalEnvironment();
        System.out.println("Natural Environemnt is forest");
    }

    @Override
    public void makeSpecialMove() {
        super.makeSpecialMove();
        System.out.println("Crow is flying in circle");
    }
}
