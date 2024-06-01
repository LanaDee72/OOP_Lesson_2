// Интерфейс ActorBehavoir,
// который будет содержать
// описание возможных
// действий актора в
// очереди/магазине



public interface ActorBehavoir {
    
    void setMakeOrder(boolean flag); // готовность сделать заказ
    void setTakeOrder(boolean flag); // готовность принять заказ

    boolean isTakeOrder();
    boolean isMakeOrder();
}
