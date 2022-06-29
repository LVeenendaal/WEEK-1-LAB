
public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a variable to hold the quantity of available plane seats left on a flight.
		int availablePlaneSeats = 20;
// create a variable to hold the cost of groceries at checkout.
		double costGroceries = 101.99;
// create a variable to hold a person's middle initial.
		char middleInitial = 'A';
//create a variable to hold true if it's hot outside and false if it's cold outside.
		boolean isHotOutside = true;
// create a variable to hold a customer's first name.
		String firstName = "Joe";
// create a variable to hold a street address.
		String streetAddress = "123 Main Street";

//print all variables to the console
		System.out.println("Available seats on the plane: " + availablePlaneSeats);
		System.out.println(costGroceries + " is the cost of groceries.");
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		System.out.println(streetAddress);

		
// a customer booked 2 plane seats, remove 2 seats from the available seats variable. 
		availablePlaneSeats = availablePlaneSeats - 2; 
		// availablePlaneSeats -= 2; is shorthand
			System.out.println("Available seats on the plane: " + availablePlaneSeats);
// impulse candy bar purchase, add 2.15 to the grocery total. 
		costGroceries = costGroceries + 2.15; 
		// costGroceries += 2.15; is shorthand 
			System.out.println("The cost of groceries is now " + costGroceries + ".");
// birth certificate was printed incorrectly, change the middle initial to something else. 
		middleInitial = 'B';
			System.out.println(middleInitial);
// the season has changed, update the hot outside variable to be the opposite of what it was.
		isHotOutside = false; 
		//isHotOutside = !isHotOutside; is inverse method
			System.out.println(isHotOutside);
// create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice. 
		String fullName = firstName + " " + middleInitial + " " + " Smith";
//print a line to the console that introduces the customer and says they live at the address variable. 
		System.out.println(fullName + " lives at " + streetAddress + ".");
		
		 
	}

}
