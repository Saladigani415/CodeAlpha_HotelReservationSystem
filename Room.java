public class Room {

    int roomNumber;
    String category;
    double price;
    boolean available;

    public Room(int roomNumber, String category, double price) {

        this.roomNumber = roomNumber;
        this.category = category;
        this.price = price;
        this.available = true;

    }

    public void displayRoom(){

        System.out.println(
        "Room: " + roomNumber +
        " | Type: " + category +
        " | Price: ₹" + price);

    }
}