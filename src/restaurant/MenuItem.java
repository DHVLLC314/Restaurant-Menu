package restaurant;

public class MenuItem {
    private String itemName;
    private String category;
    private String description;
    private Double price;
    private boolean itemStatus;

    public MenuItem(String itemName, String category,  String description, Double price) {
        this.itemName = itemName;
        this.category = category;
        this.description = description;
        this.price = price;
        this.itemStatus = true;
    }

    public String getItemName() { return itemName; }

    public String getCategory() { return category; }

    public String getDescription() { return description; }

    public Double getPrice() { return price; }

    public void setItemName(String aName) { this.itemName = aName; }

    public void setCategory(String aCategory) { this.category = aCategory; }

    public void setDescription(String aDescription) { this.description = aDescription; }

    public void setPrice(Double aPrice) { this.price = aPrice; }

    public void setNewItemStatus() {
        this.itemStatus = false;
    }

    @Override
    public String toString() {
        return "\nMenu Item: " + itemName +
                "\nItem Category: " + category +
                "\nItem Description: " + description +
                "\nitem Price: " + price +
                "\nThia ia a New Item: " + itemStatus +'\n';
    }
}
