/**
 * Класс, представляющий игрушку
 */
public class Toy {
    private final int id;
    private final String name;
    private int quantity;
    private double weight;

    /**
     * Конструктор класса Toy
     * @param id - ID игрушки
     * @param name - название игрушки
     * @param quantity - количество игрушек
     * @param weight - вес (частота выпадения) игрушки
     */
    public Toy(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        setWeight(weight);
    }

    // Геттеры и сеттеры

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight < 0 || weight > 100) {
            throw new IllegalArgumentException("Вес должен быть в диапазоне от 0 до 100");
        }
        this.weight = weight;
    }
}
