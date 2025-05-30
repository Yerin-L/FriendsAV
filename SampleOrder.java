import java.util.Map;

public class SampleOrder {
    private static final Map<String, Double> MENU_PRICES = Map.of(
        "burrito", 12.35,
        "taco", 12.35,
        "kids meal", 5.95,
        "fountain drink", 3.30,
        "bottled drink", 3.55,
        "can drink", 3.55,
        "chips", 2.10
    );

    private String entree;
    private String drink;
    private String addOn;

    public SampleOrder(String entree, String drink, String addOn) {
        if (entree == null || entree.isEmpty()) {
            throw new IllegalArgumentException("Entree cannot be null or empty.");
        }
        if (drink == null || drink.isEmpty()) {
            throw new IllegalArgumentException("Drink cannot be null or empty.");
        }
        if (addOn == null || addOn.isEmpty()) {
            throw new IllegalArgumentException("Add-on cannot be null or empty.");
        }
        this.entree = entree.toLowerCase();
        this.drink = drink.toLowerCase();
        this.addOn = addOn.toLowerCase();
    }

    public double calcPrice() {
        double price = 0.0;
        price += MENU_PRICES.getOrDefault(entree, 0.0);
        price += MENU_PRICES.getOrDefault(drink, 0.0);
        price += MENU_PRICES.getOrDefault(addOn, 0.0);
        return price;
    }

    public String getEntree() {
        return entree;
    }

    public String getDrink() {
        return drink;
    }

    public String getAddOn() {
        return addOn;
    }

    public void setEntree(String e) {
        entree = e;
    }

    public void setDrink(String d) {
        drink = d;
    }

    public void setAddOn(String a) {
        addOn = a;
    }
    // toString method for displaying order details
    @Override
    public String toString() {
        return String.format("Entree: %s\nDrink: %s\nAdd-on: %s\nTotal Price: $%.2f",
            entree, drink, addOn, calcPrice());
    }
}
