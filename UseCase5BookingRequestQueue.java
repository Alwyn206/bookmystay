import java.util.LinkedList;
import java.util.Queue;

/**
 * Use Case 5: Booking Request Queue (FIFO)
 * @author Alwyn
 */
public class UseCase5BookingRequestQueue {
    public static void main(String[] args) {
        // Creating a Queue of booking requests (Strings)
        Queue<String> bookingQueue = new LinkedList<>();

        // Customers "entering" the line (Enqueue)
        bookingQueue.add("Customer_Alwyn");
        bookingQueue.add("Customer_John");
        bookingQueue.add("Customer_Alice");

        System.out.println("--- Current Booking Queue (FIFO) ---");
        
        // Displaying the queue without removing elements
        for (String customer : bookingQueue) {
            System.out.println("Waiting: " + customer);
        }

        // Processing the first customer in line (Dequeue)
        String firstInLine = bookingQueue.poll();
        System.out.println("\nNow Processing: " + firstInLine);
        System.out.println("Remaining in Queue: " + bookingQueue.size());
    }
}