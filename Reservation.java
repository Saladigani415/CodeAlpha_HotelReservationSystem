public class Reservation {

    Customer customer;
    Room room;


    public Reservation(Customer customer, Room room){

        this.customer = customer;
        this.room = room;

    }


    public void showBooking(){

        System.out.println("\n--- Booking Details ---");

        System.out.println("Name: " + customer.name);
        System.out.println("Phone: " + customer.phone);
        System.out.println("Room Number: " + room.roomNumber);
        System.out.println("Category: " + room.category);
        System.out.println("Price: ₹" + room.price);

    }
}