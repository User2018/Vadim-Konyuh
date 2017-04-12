import java.util.Map;
import java.util.Set;

/**
 * Created by Oleg on 12.04.2017.
 */
public class Seller {
    private Shop shop;
    private Client client;

    public Seller(Shop shop) {
        this.shop = shop;
    }

    public void rent(String title, int amounts) {
        for (int i = 0; i < amounts; i++) {
            client.getUnits()[checkClient()] = serachSportEquipment(title);
        }

        Set<Map.Entry<SportEquipment, Integer>> set = shop.getGoods().entrySet();
        for (Map.Entry<SportEquipment, Integer> i : set) {
            i.setValue(i.getValue() - amounts);

            shop.getRentGoods().put(i.getKey(), i.getValue() + amounts);
        }
    }

    public int checkClient() {
        int freePosition = 0;

        for (int i = 0; i < 3; i++) {
            if (client.getUnits()[i] == null) {
                freePosition = i;
                i = 3;
            } else System.out.println("Аренда заперщена");
            break;
        }

    return freePosition;
    }

    public SportEquipment serachSportEquipment(String title) {
        SportEquipment sportEquipment = null;

        Set<Map.Entry<SportEquipment, Integer>> set = shop.getGoods().entrySet();

        for (Map.Entry<SportEquipment, Integer> i : set) {
            if (title.equals(i.getKey().getTitle()) == true) {
                sportEquipment = i.getKey();
            }
        }

        return sportEquipment;
    }

    public void outputGoods () {
        Set<Map.Entry<SportEquipment, Integer>> set = shop.getGoods().entrySet();

        for (Map.Entry<SportEquipment, Integer> i : set) {
            String title = i.getKey().getTitle();
            int amount = i.getValue();
            System.out.println(title + " " + amount);
        }

    }

}




