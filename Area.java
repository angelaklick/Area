import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		double p, a, v;
		
		while(true){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter Length: ");
		double length = reader.nextDouble();
		
		System.out.print("Enter Width: ");
		double width = reader.nextDouble();
		
		System.out.print("Enter Height: ");
		double height = reader.nextDouble();
		
		a = length * width;
		p = (2 * length) + (2 * width);
		v = length * width * height;
		
		System.out.println("Area: " + a );
		System.out.println("Perimeter: " + p);
		System.out.println("Volume: " + v);
		
		
		System.out.print("Do you wish to continue? (y/n) ");
		String garbage = reader.nextLine();
		String input = reader.nextLine();	
		
		if(input.equalsIgnoreCase("N")){
			
			break;
			
		}
		
		}
	}

}
