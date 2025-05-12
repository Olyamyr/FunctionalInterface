package Function;

public class FunctionExample {
    public static void main(String[] args) {
        //Мы отправляем монеты транспортной компанией и заказчику предоставляем только нужную информацию о монете
        Coin coin = new Coin(5, 1999, 2.5, "Gold", 10);

        //Переводим в объект монеты без лишней информации
        ShortCoin shortCoin = new ShortCoin(coin.getNominal(), coin.getMetalName());
        System.out.println(shortCoin);

        //Используем CoinMapper для автоматического преобразования
        CoinMapper coinMapper = new CoinMapper();
        ShortCoin shortCoin2 = coinMapper.apply(coin);
        System.out.println(shortCoin2);

//        System.out.println(new CoinMapper().apply(coin));
    }
}