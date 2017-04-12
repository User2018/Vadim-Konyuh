/**
 * Created by Oleg on 12.04.2017.
 */
public class SportEquipment {
    private Category category;
    private String title;
    private int price;

    public SportEquipment(Category category, String title, int price) {
        this.category = category;
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
}
