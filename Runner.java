import java.io.File;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Oleg on 12.04.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Map<SportEquipment, Integer> sportEquipment = new HashMap<SportEquipment, Integer>();
        sportEquipment.put(new SportEquipment(new Category(), "Ball", 20), 3);
        sportEquipment.put(new SportEquipment(new Category(), "Bal", 15), 2);
        sportEquipment.put(new SportEquipment(new Category(), "Ba", 10), 1);

        Seller seller = new Seller();
        Client client = new Client();
        Shop shop1 = new Shop(sportEquipment, seller, client);
        seller.rent("Ball", 3);
        seller.outputGoods();

    }

}
