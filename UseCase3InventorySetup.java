import java.util.HashMap;

/**
 * Use Case 3: Centralized Room Inventory using HashMap
 * @author Alwyn
 */
public class UseCase3InventorySetup {
    public static void main(String[] args) {
        // HashMap to store Room Type (Key) and Count (Value)
        HashMap<String, Integer> inventory = new HashMap<>();

        // Adding initial data
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);

        System.out.println("--- Hotel Room Inventory ---");
        
        // Iterating through the HashMap to display availability
        for (String roomType : inventory.keySet()) {
            System.out.println(roomType + " Available: " + inventory.get(roomType));
        }
    }
}