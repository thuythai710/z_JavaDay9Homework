package homework;

public class BrokenCodeTwo {

	public static void main(String[] args) { // static void was switch //S in string was not capitalized
		
		double tempOne = 84.7; //since it is 
		int tempTwo = 66;
		
		String result;
		if(tempOne <= 0 && tempTwo >= 100) { // there was an extra "&" need to be deleted // it was tempTwo => 100 that is not correct
			result = "true"; // since true a a string should be in " "
		} else if(tempOne >= 100 && tempTwo <= 0) { // it was if else that is not correct
			result = "true"; // since true a a string should be in " "
		} else {
			result = "false"; // since false is a string should be in " "
		}
		
		System.out.println(result); // results has an s need to be deleted to match above
		
		String season = "Monday";

		switch (season) { // switch 
		case "fall": // since fall is a string should be in " " // with case should be : at the end
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");			
			 
		case "spring": // 's' is char not string so change it to a string as "spring" // with case should be : at the end

			System.out.println("Recovering from cold weather");			
			break;
		case "summer": // with case should be : at the end
			System.out.println("Toooo hot");			
			 
		default: // with default should be : at the end
			System.out.println("Season does not exist!");	
		}
		
		for(int i = 0; i < 10; i++) { // int i was not initialized //unnecessary ; was included in between ) and {
			if(i == 5) {  // unnecessary ); was added
				System.out.println("I equals to: " + i);
			} else { // unnecessary () was added
				System.out.println("I is not equals to " + i);
			}
		}
	}	
}


