import java.util.Scanner;

public class dane {

	public static void main(String[] args) {
		
		Scanner myData = new Scanner(System.in);
		System.out.println("Podaj swoje imi�.");
		String imie = myData.nextLine();
		System.out.println("Podaj swoje nazwisko.");
		String nazwisko = myData.nextLine();
		System.out.println("Podaj swoj� dat� urodzenia.");
		String data = myData.nextLine();
		System.out.println("Ile masz centymetr�w wzrostu?");
		int wzrost = myData.nextInt();
		
		System.out.println("Imi�: "+ imie );
		System.out.println("Nazwisko: " + nazwisko); 
		System.out.println("Data Urodzenia: " + data); 
		System.out.println("Wzrost: " + wzrost +" cm"); 
	
		
	

	}

}
