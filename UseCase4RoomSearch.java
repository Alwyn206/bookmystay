import java.util.HashMap;

/**
 * Use Case 4: Room Search & Availability Filter
 * @author Alwyn
 */
public class UseCase4RoomSearch {
    public static void main(String[] args) {
        // Shared Inventory from UC3
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 0); // Out of stock
        inventory.put("Suite Room", 2);

        System.out.println("--- Searching for Available Rooms ---");
        
        // Search & Filter Logic
        boolean found = false;
        for (String type : inventory.keySet()) {
            int count = inventory.get(type);
            
            if (count > 0) {
                System.out.println("Found: " + type + " (" + count + " left)");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Sorry, no rooms available at the moment.");
        }
    }
}