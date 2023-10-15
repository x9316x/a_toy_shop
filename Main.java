import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToyManager toyManager = new ToyManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить новую игрушку");
            System.out.println("2. Изменить вес игрушки");
            System.out.println("3. Организовать розыгрыш");
            System.out.println("4. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();  // очистка буфера

            switch (choice) {
                case 1:
                    System.out.println("Введите ID игрушки:");
                    int id = scanner.nextInt();

                    scanner.nextLine();  // очистка буфера

                    System.out.println("Введите название игрушки:");
                    String name = scanner.nextLine();

                    System.out.println("Введите количество игрушки:");
                    int count = scanner.nextInt();

                    System.out.println("Введите вес (шанс выпадения) игрушки:");
                    double weight = scanner.nextDouble();

                    toyManager.addToy(new Toy(id, name, count, weight));
                    System.out.println("Игрушка добавлена!");
                    break;

                case 2:
                    System.out.println("Введите ID игрушки, для которой хотите изменить вес:");
                    int toyId = scanner.nextInt();
                    System.out.println("Введите новый вес:");
                    double newWeight = scanner.nextDouble();

                    toyManager.changeToyWeight(toyId, newWeight);
                    System.out.println("Вес изменен!");
                    break;

                case 3:
                    Toy wonToy = toyManager.organizeLottery();
                    if (wonToy != null) {
                        System.out.println("Победила игрушка: " + wonToy.getName());
                    } else {
                        System.out.println("Нет игрушек для розыгрыша.");
                    }
                    break;

                case 4:
                    System.out.println("Выход из программы...");
                    return;

                default:
                    System.out.println("Неверный выбор. Повторите попытку.");
            }
        }
    }
}
