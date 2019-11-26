package restaurant;

import java.util.ArrayList;
import java.util.Date;


public class Menu {
    private String menuName;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu(String menuName) {
        this.menuName = menuName;
        this.lastUpdated = new Date();
    }

    public String getMenuName() { return menuName; }

    public void setMenuName(String aName) { this.menuName = aName; }

    public void addItem(MenuItem aItem) {
        if (!menuItems.contains(aItem)) { ;
            menuItems.add(aItem);
        }
    }

    public void removeItem(MenuItem aItem) {
        if (menuItems.contains(aItem)) {
            menuItems.remove(aItem);
        }
    }

    @Override
    public String toString() {
        return  "Menu Name: " + menuName +
                "\nMenu Last Updated: " + lastUpdated + '\n' +
                menuItems;
    }


}
