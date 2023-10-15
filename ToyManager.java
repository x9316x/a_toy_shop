import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Класс, управляющий игрушками и розыгрышем
 */
public class ToyManager {
    private final List<Toy> toys;

    public ToyManager() {
        toys = new ArrayList<>();
    }

    /**
     * Добавляет новую игрушку
     * @param toy - объект игрушки
     */
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    /**
     * Организует розыгрыш игрушек
     * @return - выбранная игрушка
     */
    public Toy organizeLottery() {
        Random rand = new Random();
        double totalWeight = toys.stream().mapToDouble(Toy::getWeight).sum();
        double randomValue = rand.nextDouble() * totalWeight;

        double weightAccumulator = 0.0;
        for(Toy toy : toys) {
            weightAccumulator += toy.getWeight();
            if(randomValue <= weightAccumulator) {
                return toy;
            }
        }

        return null;
    }
}
