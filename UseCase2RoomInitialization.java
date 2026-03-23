abstract class Room {
    String type;
    int price;
    Room(String type, int price) { this.type = type; this.price = price; }
    abstract void display();
}
class SingleRoom extends Room {
    SingleRoom() { super("Single Room", 1000); }
    void display() { System.out.println(type + " - Price: " + price); }
}
public class UseCase2RoomInitialization {
    public static void main(String[] args) {
        Room r = new SingleRoom();
        r.display();
    }
}