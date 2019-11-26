package restaurant;

import javax.xml.namespace.QName;
import java.util.*;

public class Restaurant {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<HashMap<String, String>> headers = new ArrayList<>();

    public static void main(String[] args) {
        Menu menu = new Menu("Joe's Pizza");
        MenuItem menuItem1 = new MenuItem("Cheesy Bread", "Appetizer", "Delicious squares of our famous pizza crust covered with 5 different cheese toppings", 7.00);
        MenuItem menuItem2 = new MenuItem("Smoking Hot Spaghetti", "Main Course", "Not your mama's Spaghetti", 7.99);
        MenuItem menuItem3 = new MenuItem("Cinnamon Canoli's", "Desserts", "Hand made canoli's sprinkled with cinnamon and love", 4.99);

        HashMap<String, String> headerChx = new HashMap<>();
        headerChx.put("0:\t", "Enter '0' to update menu options");
        headerChx.put("1:\t", "Enter '1' to view menu");
        headerChx.put("2:\t", "Enter '2' to view featured menu items");
        headers.add(headerChx);

        HashMap<String, String> menuUpd = new HashMap<>();
        menuUpd.put("0:\t", "Enter '0' to add new menu items");
        menuUpd.put("1:\t", "Enter '1' to remove existing menu items");
        headers.add(menuUpd);


        System.out.println("Welcome to " + menu.getMenuName());

        for (Map.Entry<String, String> choice : headerChx.entrySet()) {
            System.out.println(choice.getKey() + choice.getValue());
        }
        System.out.print("Please choose a viewing option \t");
        int result = input.nextInt();
        if (result == 0) {
            for (Map.Entry<String, String> choice : menuUpd.entrySet()) {
                System.out.println(choice.getKey() + choice.getValue());
            }
            System.out.println("Please choose an update option");
            int updChoice = input.nextInt();
            input.nextLine();
            if (updChoice == 0) {

                System.out.println("Please choose an item name\t");
                String usrItemName = input.nextLine().toString();

                System.out.println("Please choose an item category ");
                String usrItemCat = input.nextLine();

                System.out.println("Please give your item a description");
                String usrItemDesc = input.nextLine();

                System.out.println("Please enter the price for your item");
                Double usrItemPrice = input.nextDouble();

                MenuItem userItem = new MenuItem(usrItemName, usrItemCat, usrItemDesc, usrItemPrice);
                menu.addItem(userItem);
                System.out.println(menu);

            } else if (updChoice == 1) {
                menu.addItem(menuItem1);
                menu.addItem(menuItem2);
                menu.addItem(menuItem3);
                menu.removeItem(menuItem3);
                System.out.println("Revised Menu: ");
                System.out.println(menu);
            }
        } else if (result == 1) {
            menu.addItem(menuItem1);
            menu.addItem(menuItem2);
            menu.addItem(menuItem3);
            System.out.println(menu);
        } else if (result == 2) {
            System.out.println(menuItem1.getItemName() + "\n"
                    + menuItem1.getCategory() + "\n"
                    + menuItem1.getDescription() + "\n"
                    + menuItem1.getPrice());
        }
    }
}
