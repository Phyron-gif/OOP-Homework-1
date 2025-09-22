import java.util.Scanner;
public class FootballPlayer {

	public static void main(String[] args){
		/*String name;
		int age;
		double height;
		double weight;*/
		
		Scanner player_details = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = player_details.nextLine();
		System.out.println("Enter your age: ");
		int age = player_details.nextInt();
		System.out.println("Enter your height in meters : ");
		double height = player_details.nextDouble();
		System.out.println("Enter your weight in pounds: ");
		double weight = player_details.nextDouble();
		System.out.println("Enter your jersey number: ");
		int jersey_number = player_details.nextInt();
		double pound =  0.45359237 ;
		int meter = 100;
		double weight_in_pound = weight/pound;
		double height_in_centimeters = height*meter;
		int final_weight = (int)weight_in_pound;
		int final_height = (int)height_in_centimeters;
		System.out.println("Player Name - " + name);
		System.out.println("Age - " + age);
		System.out.println("Height in centimeters - " + final_height + "cm");
		System.out.println("Weight in kilograms - " + final_weight+"kg");
		System.out.println("Jersey Number - " + jersey_number);
		age++;
		jersey_number--;
		System.out.println("New Age - " + age );
		System.out.println("Jersey_number - " + jersey_number);
		if (age >= 18 && final_weight < 90) {
			System.out.println("You are eligible to play");
		}
		else {
			System.out.println("You are not eligible to play");
			
		}
		if ((age < 18 ||weight < 90 )|| (age >= 18 || weight >= 90 )){
           System.out.println("Player has a problem(either too young or too heavy)");
				
		}
		if (!(age >= 18 && weight < 90)) {
			System.out.println("Not Eligible");
			
		}
		if(age < 20 ){
			System.out.println("Rising Star");
		}
		else if (age<=30 || age >= 20){
			System.out.println("Prime Player");

		}
		else {
			System.out.println("Veteran");
		}
		System.out.println("Enter your jersey number: ");
		switch (jersey_number) {
			case 1:
				System.out.println("Goalkeeper");
				break;
		
			case 2:
			case 5:
			    System.out.println("Defender");

				break;
			case 6:
			case 8:
			    System.out.println("Midfielder");
				break;
			case 7:
			case 11:
			    System.out.println("Winger");
				break;
			case 9:
			
			    System.out.println("Striker");
				break;
			case 10:
			
			    System.out.println("Playmaker");
				break;
			default:
			    System.out.println("Player position not known");

		}
		if ((age<=30 || age >= 20) && final_weight < 80){
			System.out.println("starting lineup");
		

		

		}
		else{
			System.out.println("bench");

		}

		
    



		}
		
	g
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
