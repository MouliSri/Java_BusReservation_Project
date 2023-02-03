package busResv;
import java.sql.*;
import java.util.Scanner;

public class BusDemo {
	
	public static void main(String args[]) throws SQLException  {
    
		
		BusInformation busInformation=new BusInformation();
		
		try {
		busInformation.display();
		Scanner scan=new Scanner(System.in);
		int option=1;
		int busNumber;
		
		while(option==1) {
			System.out.println("Enter 1 to Book or 2 To Exit");
			option=scan.nextInt();
			if(option==1) {
				Booking bookTicket=new Booking();
				System.out.println("Enter the bus no:");
				busNumber=scan.nextInt();
				boolean Ticket=bookTicket.isAvailable(busNumber);
				
				if(Ticket) {
					System.out.println("The Ticket is Available:");
					 bookTicket.confirmBooking();
				}
				else
				{
					System.out.println("oops there is no Availability... you can try Diffrent Bus");
				}
				
			}
			else if(option==2) {
				System.out.println("Bye:)");
			}
			else
			{
				System.err.println("The Input is wrong try again...");
				option=1;
			}
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
       
		
		
	}

}
