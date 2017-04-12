import java.util.Map;

/**
 * Created by Oleg on 12.04.2017.
 */
public class Shop {
    private Map<SportEquipment, Integer> goods;
    private Map<SportEquipment, Integer> rentGoods;
    private Seller seller;
    private Client client;


    public Shop(Map<SportEquipment, Integer> goods, Seller seller, Client client) {
        this.goods = goods;
        this.seller = seller;
        this.client = client;
    }

    public Map<SportEquipment, Integer> getGoods() {
        return goods;
    }

    public Map<SportEquipment, Integer> getRentGoods() {
        return rentGoods;
    }

    public Seller getSeller() {
        return seller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop shop = (Shop) o;

        return goods.equals(shop.goods);
    }

    @Override
    public int hashCode() {
        return goods.hashCode();
    }


}
