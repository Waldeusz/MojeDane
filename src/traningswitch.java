import java.util.Scanner;

public class traningswitch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Podaj imiê:");
		String tekst = input.nextLine();
		

		switch (tekst) {
		case ("Waldemar"):
			System.out.println("Witaj Waldemarze!");
			break;
		case ("Mateusz"):
			System.out.println("Witaj Bebzon!");
			break;
		case ("Aneta"):
			System.out.println("Penis");
			break;
		case ("Kuba"):
			System.out.println("railwajspeszjalist");
			break;
		case ("Kasia"):
			System.out.println("Katarzyna Koch pseudnim Szefowa");
			break;
		default:
			System.out.println("Podaj inne imiê dzbanie");
			
		}
		
			
	}

}
