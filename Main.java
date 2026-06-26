import java.util.Scanner;


public class Main {


public static void main(String args[]){


Scanner sc = new Scanner(System.in);


Hotel hotel = new Hotel();

hotel.addRooms();



System.out.println("===== HOTEL RESERVATION SYSTEM =====");


System.out.println("Available Rooms:");

hotel.searchRoom("Standard");
hotel.searchRoom("Deluxe");
hotel.searchRoom("Suite");



System.out.print("\nEnter Room Number: ");

int no = sc.nextInt();



Room room = hotel.bookRoom(no);



if(room != null){


System.out.print("Enter Name: ");

String name = sc.next();



System.out.print("Enter Phone: ");

String phone = sc.next();



Customer customer =
new Customer(name,phone);



Reservation reservation =
new Reservation(customer,room);



Payment payment =
new Payment();



payment.pay(room.price);



reservation.showBooking();



}

else{


System.out.println("Room not available");


}



}

}