package task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

        Lion lion = new Lion("Lew Zbyszek", 20, 3);
        Elephant elephant = new Elephant("Slon Marcin", 40, 340);
        Snake snake = new Snake("Snake Krzysiu", 20, "Czerwony");
        Crocodile crocodile = new Crocodile("Krokodyl Piotrek", 80, 3);
        Crow crow = new Crow("Kruk Szczepan", 2, "Black");
        Pigeon pigeon = new Pigeon("Golab Rafal", 1, 60);
        List<Animal> animals = new ArrayList<>(Arrays.asList(lion, elephant, snake, crocodile, crow, pigeon));

        for (Animal animal : animals) {
            animal.animalDescription();
            animal.giveVoice();
            animal.move();
            animal.getNaturalEnvironment();
            animal.makeSpecialMove();
            System.out.println("\n");
        }
    }
}