import java.time.LocalDate;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        // Создаем маркет
        Market market = new Market();

        // Создаем продукты
        Product water = new Product("Вода", 50, LocalDate.of(2024, 3, 21));
        Product bread = new Product("Хлеб", 45, LocalDate.of(2024, 6, 1));
        Product egg = new Product("Яйцо",120, LocalDate.of(2024, 5, 31));
        Product tomato = new Product("Томат", 250, LocalDate.of(2024, 5, 15));
        Product cucumber = new Product("Огурец", 230, LocalDate.of(2024, 5, 25));
        Product chocolate = new Product("Шоколад", 85, LocalDate.of(2024, 3, 3));

        // Добавляем продукцы в маркет
        market.update(water);
        market.update(bread);
        market.update(egg);
        market.update(tomato);
        market.update(cucumber);
        market.update(chocolate);
        market.update(water);
        market.update(bread);
        market.update(egg);
        market.update(tomato);
        market.update(cucumber);
        market.update(chocolate);
        market.update(water);
        market.update(bread);
        market.update(egg);
        market.update(tomato);
        market.update(cucumber);
        market.update(chocolate);

        // Проверяем наличие продуктов в маркете
        System.out.println(market.getMarketProducts());


        // Создаем посетителей
        Human anna = new Human("Anna");
        Human bob = new Human("Bob");
        Human robert = new Human("Robert");


        // Проставляем готовность посетителей сделать заказ
        anna.setMakeOrder(true);
        bob.setMakeOrder(true);
        robert.setMakeOrder(true);


        // Добавляем посетителей в очередь и принимаем заказы
        market.takeInQueue(anna);
        market.takeOrders(anna, List.of(water, bread, egg));


        market.takeInQueue(bob);
        market.takeOrders(bob, List.of(chocolate, water));

        market.takeInQueue(robert);
        market.takeOrders(robert, List.of(tomato, cucumber));

        // Смотрим очередь и очередь заказов
        System.out.println(market.getActors());
        System.out.println(market.getOrderProducts());

        // Проставляем готовность посетителей забрать заказ
        anna.setTakeOrder(true);
        bob.setTakeOrder(true);
        robert.setTakeOrder(true);

        // Выдаем заказ и сразу исключаем из очереди
        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket();

        // Проверяем очередь посетителей и заказов, а также список продуктов в маркете
        System.out.println(market.getActors());
        System.out.println(market.getOrderProducts());
        System.out.println(market.getMarketProducts());

        // Выдаем заказ и сразу исключаем из очереди
        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket();

        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket();

        // Проверяем очередь посетителей и заказов, а также список продуктов в маркете
        System.out.println(market.getActors());
        System.out.println(market.getOrderProducts());
        System.out.println(market.getMarketProducts());

    }




}
