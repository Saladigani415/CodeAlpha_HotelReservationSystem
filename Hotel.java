import java.util.ArrayList;


public class Hotel {


    ArrayList<Room> rooms = new ArrayList<>();


    public void addRooms(){

        rooms.add(new Room(101,"Standard",2000));
        rooms.add(new Room(102,"Deluxe",3500));
        rooms.add(new Room(103,"Suite",6000));

    }



    public void searchRoom(String type){


        for(Room r : rooms){

            if(r.category.equalsIgnoreCase(type)
            && r.available){

                r.displayRoom();

            }
        }

    }



    public Room bookRoom(int number){


        for(Room r : rooms){

            if(r.roomNumber == number
            && r.available){

                r.available=false;

                return r;

            }

        }

        return null;

    }


}