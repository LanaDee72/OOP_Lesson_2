import java.util.ArrayList;
import java.util.List;


// Реализовать класс Market и
// все методы, которые он
// обязан реализовывать.
// Методы из интерфейса
// QueueBehaviour, имитируют
// работу очереди,
// MarketBehaviour – помещает и
// удаляет человека из очереди,
// метод update – обновляет
// состояние магазина
// (принимает и отдает заказы)



public class Market implements MarketBehaviour, QueueBehaviour{


    private List<Actor> actors = new ArrayList<>();
    private List<Product> marketProducts = new ArrayList<>();
    private List<List<Product>> orderProducts = new ArrayList<>();

    @Override
    public void takeInQueue(Actor actor) {
        if (actor.isMakeOrder == true){
            actors.add(actor);
        } else{
            System.out.println("Вы не готовы сделать заказ");
        }
    }

    @Override
    public void takeOrders(Actor actor, List<Product> actorOrder) {
        if (actor.isMakeOrder = true){
            orderProducts.add(actorOrder);
            System.out.println(actor.getName() + ", спасибо за заказ. Вы готовы принять заказ?");
        } else{
            System.out.println(actor.getName() + " не готов сделать заказ");
        }
        
    }

    @Override
    public void giveOrders() {
        if(actors.get(0).isTakeOrder == true){
            for (Product product : orderProducts.get(0)) {
                marketProducts.remove(product);
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actors.get(0).getName() + ", будем ждать вас снова!");
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor + ", вошел в магазин. Готов ли он сделать заказ?");
    }

    @Override
    public void releaseFromMarket() {
        actors.remove(0);
        orderProducts.remove(0);
    }

    @Override
    public void update(Product product) {
        // добавление продуктов в маркет
        marketProducts.add(product);
    }

    public List<Actor> getActors(){
        return actors;
    }

    public List<Product> getMarketProducts(){
        return marketProducts;
    }

    public List<List<Product>> getOrderProducts(){
        return orderProducts;
    }

    
}
