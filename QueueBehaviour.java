// Интерфейс QueueBehaviour, который описывает
// логику очереди – помещение в/освобождение из
// очереди, принятие/отдача заказа

import java.util.List;

public interface QueueBehaviour {

    void takeInQueue(Actor actor); // войти в очередь
    void takeOrders(Actor actor, List<Product> actorOrder);  // принять заказ
    void giveOrders();  // отдать заказ
    void releaseFromQueue();  // выйти из очереди

    
} 