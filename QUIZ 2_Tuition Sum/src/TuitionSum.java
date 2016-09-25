import java.util.Scanner;

public class TuitionSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter Starting Tuition Rate: ");
		double Tuition=input.nextDouble();
		
		double TuitionSUM = Tuition;
		
		for (int i=1; i<4; i++){
			System.out.print("Enter Percentage Increase for tuition between Year " + i + " and "+ (i+1)+": ");
			double Percent=input.nextDouble();
			Tuition = (1+(Percent/100))*Tuition;
			TuitionSUM += Tuition;			
		}
		System.out.println("Tuition Total: "+TuitionSUM);
	}

}
