import java.util.Scanner;


public class AbstractInstrumentDemo {
	public static void main(String[] args) {
		ElectricGuitar eg = new ElectricGuitar();
		ElectricBassGuitar ebg = new ElectricBassGuitar();
		//show the default values
		System.out.println("Default Values");
		eg.play();
		ebg.play();
		//get the number of strings from user
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the number of strings for electric guitar: ");
		int val = sc.nextInt();
		System.out.println("Enter the number of strings for electric bass guitar: ");
		int val1 = sc.nextInt();
		
		System.out.println();
		
		//call the constructor and then display the values
		eg = new ElectricGuitar(val);
		ebg = new ElectricBassGuitar(val1);
		
		eg.play();
		ebg.play();
	}

}
