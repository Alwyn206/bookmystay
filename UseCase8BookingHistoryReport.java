import java.util.ArrayList;
import java.util.List;

/**
 * Use Case 8: Final Booking History Report
 * @author Alwyn
 */
public class UseCase8BookingHistoryReport {
    public static void main(String[] args) {
        // A list acting as our final transaction log
        List<String> historyReport = new ArrayList<>();

        // Adding completed booking records
        historyReport.add("ID: BK-001 | Customer: Alwyn | Room: Single | Status: PAID");
        historyReport.add("ID: BK-002 | Customer: John  | Room: Double | Status: PENDING");
        historyReport.add("ID: BK-003 | Customer: Alice | Room: Suite  | Status: PAID");

        System.out.println("======= FINAL BOOKING HISTORY REPORT =======");
        
        if (historyReport.isEmpty()) {
            System.out.println("No history found for today.");
        } else {
            // Using a for-each loop for a clean report view
            for (String record : historyReport) {
                System.out.println("[RECORD] " + record);
            }
        }

        System.out.println("============================================");
        System.out.println("Total Records Processed: " + historyReport.size());
    }
}