import java.util.ArrayList;
import java.util.List;

/**
 * Use Case 7: Add-On Service Selection (using List)
 * @author Alwyn
 */
public class UseCase7AddOnServiceSelection {
    public static void main(String[] args) {
        // A List to hold multiple services for one booking
        List<String> selectedServices = new ArrayList<>();

        // Customer chooses services
        selectedServices.add("High-Speed WiFi");
        selectedServices.add("Buffet Breakfast");
        selectedServices.add("Late Check-out");

        System.out.println("--- Selected Add-on Services ---");
        
        // Check if any services were selected
        if (selectedServices.isEmpty()) {
            System.out.println("No extra services selected.");
        } else {
            // Iterating through the list
            for (int i = 0; i < selectedServices.size(); i++) {
                System.out.println((i + 1) + ". " + selectedServices.get(i));
            }
        }

        System.out.println("\nTotal services added: " + selectedServices.size());
    }
}