// Интерфейс MarketBehaviour, который описывает
// логику магазина – приход/уход покупателей,
// обновление состояния магазина



public interface MarketBehaviour {
    
    void acceptToMarket(Actor actor); //входит в магазин
    void releaseFromMarket();  // выходит из магазина
    void update(Product product);  // обновление состояния магазина
}
