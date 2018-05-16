package collections.example;

import java.util.*;

//TheatreList class is an example of how to create a list in Java
public class TheatreList {
	  public List<Seat> seats = new ArrayList<>();

	    public TheatreList(String theatreName, int numRows, int seatsPerRow) {
	        String TheatreName = theatreName;

	        //loop creates seats from A to H, and 01 to 12
	        int lastRow = 'A' + (numRows - 1);
	        for (char row = 'A'; row <= lastRow; row++) {
	            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
	                Seat seat = new Seat(row + String.format("%02d", seatNum)); //config seat number
	                seats.add(seat);
	            }
	        }
	    }

	    //this functions serves as part of the example when reserving seat D12, or a
	    //seat that doesn't exit
	    public boolean reserveSeat(String seatNumber) {
	        Seat requestedSeat = null;
	        for (Seat seat : seats) {
	            if (seat.getSeatNumber().equals(seatNumber)) {
	                requestedSeat = seat;
	                break;
	            }
	        }

	        if (requestedSeat == null) {
	            System.out.println("there is no seat " + seatNumber);
	            return false;

	        }

	        return requestedSeat.reserve();

	    }

	    //this fucntion is just for testing purpose
	    public void getSeats(){
	       for (Seat seat : seats) {
	          System.out.println(seat.getSeatNumber());
	        }
	    }

	    public class Seat {
	        private final String seatNumber;
	        private boolean reserved = false;

	        public Seat(String seatNumber) {
	            this.seatNumber = seatNumber;
	        }

	        public boolean reserve() {
	            if (!this.reserved) {
	                this.reserved = true;
	                System.out.println("Reserve seat " + seatNumber);
	                return true;
	            } else {
	                return false;
	            }
	        }

	        public String getSeatNumber() {

	            return seatNumber;
	        }
	    }
}
