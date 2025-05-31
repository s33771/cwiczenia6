package task6;

public class Snake extends Reptile {
    private String skinColor;

    public Snake(String name, int age, String bodyLength) {
        super(name, age);
        this.skinColor = bodyLength;
    }

    @Override
    public void giveVoice() {
        super.giveVoice();
        System.out.println("SSSsssss");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("the snake is wriggling");
    }

    @Override
    public void animalDescription() {
        super.animalDescription();
        System.out.println("Body length: " + skinColor);
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
    @Override
    public void getNaturalEnvironment() {
        super.getNaturalEnvironment();
        System.out.println("Natural Environemnt is jungle");
    }

    @Override
    public void makeSpecialMove() {
        super.makeSpecialMove();
        System.out.println("The snake is coiling");
    }
}
