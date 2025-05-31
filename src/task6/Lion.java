package task6;

public class Lion extends Mammal {
    private int hairLength;

    public Lion(String name, int age , int hairLength) {
        super(name, age);
    }

    @Override
    public void giveVoice() {
        System.out.println("Roooooar");
    }

    @Override
    public void move() {
        System.out.println("Lion is hunting");
        ;
    }

    @Override
    public void animalDescription() {
        super.animalDescription();
        System.out.println("hair length " + hairLength);
    }

    @Override
    public void getNaturalEnvironment() {
        super.getNaturalEnvironment();
        System.out.println("Natural Environemnt is savanna");
    }

    @Override
    public void makeSpecialMove() {
        super.makeSpecialMove();
        System.out.println("Lion is sleeping");
    }
}
