package restaurant;

import java.util.*;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    private static Date updatedLast;


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public static Date getUpdatedLast() {
        return updatedLast;
    }

    public static void setUpdatedLast(Date updatedLast) {
        Menu.updatedLast = updatedLast;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return menuItems.equals(menu.menuItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItems);
    }
}
