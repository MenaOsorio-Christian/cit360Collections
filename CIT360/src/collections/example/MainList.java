package collections.example;

import java.util.ArrayList;
import java.util.List;

//MainList controls the used of the list created on the ThreatreList class
public class MainList {
	 public static void main(String[] args) {

	        //Lines 12 creates an array of 96 seats used in the list TheatreList
	        TheatreList theatreList = new TheatreList("Olympian", 8, 12);

	        List<TheatreList.Seat> seatCopy = new ArrayList<>(theatreList.seats);
	        printList(seatCopy);

	        //Lines 16 to 25 uses seat D12 with the purpose to test the theatreList and its values
	        //by trying to reserve a seat that is already reserved
	        if (theatreList.reserveSeat("D12")) {
	            System.out.println("Please pay for D12");
	        } else {
	            System.out.println("Sorry, seat already reserved");
	        }

	        if (theatreList.reserveSeat("D12")) {
	            System.out.println("Please pay for D12");
	        } else {
	            System.out.println("Seat already reserved");
	        }
	    }

	        //printList display the list of seats on the theatre containing 96 seats
	        public static void printList(List < TheatreList.Seat > list){
	            for (TheatreList.Seat seat : list) {
	                System.out.println(" " + seat.getSeatNumber());
	            }
	            System.out.println();
	            System.out.println("======================================================================");
	        }

	    }



