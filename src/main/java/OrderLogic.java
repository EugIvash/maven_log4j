import org.apache.log4j.Logger;

/**
 * Created by Eugene on 13.05.2015.
 */
public class OrderLogic
{
    // Инициализация логера
    private static final Logger log = Logger.getLogger(OrderLogic.class);

    public void doOrder(){
        // какае-то логика
        System.out.println("Заказ оформлен!");
        // логируем инфо
        log.info("Это информационное сообщение!");
        addToCart();
    }

    private void addToCart() {
        // добавление товара в корзину
        System.out.println("Товар добавлен в корзину");
        // логируем ошибку
        log.error("Это сообщение ошибки");
    }

    public static void main(String[] args)
    {
        OrderLogic logic = new OrderLogic();
        logic.doOrder();
    }
}
