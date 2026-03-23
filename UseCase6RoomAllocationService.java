import java.util.*;

/**
 * Use Case 6: Room Allocation & Unique ID Management
 * @author Alwyn
 */
public class UseCase6RoomAllocationService {
    public static void main(String[] args) {
        // 1. Setup the Request Queue (FIFO)
        Queue<String> requests = new LinkedList<>();
        requests.add("Customer_Alwyn");
        requests.add("Customer_John");

        // 2. Setup the Allocation Tracker (Set prevents duplicates)
        Set<String> allocatedRooms = new HashSet<>();
        
        System.out.println("--- Processing Room Allocations ---");

        while (!requests.isEmpty()) {
            String customer = requests.poll();
            
            // Generate a Unique Room ID (In a real app, this comes from a DB)
            String roomId = "ROOM-" + (100 + allocatedRooms.size() + 1);

            // Add to Set and check if successful
            if (allocatedRooms.add(roomId)) {
                System.out.println("SUCCESS: " + customer + " assigned to " + roomId);
            } else {
                System.out.println("ERROR: Room " + roomId + " is already occupied!");
            }
        }
        
        System.out.println("\nTotal Rooms Allocated Today: " + allocatedRooms.size());
    }
}