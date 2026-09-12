import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			if (x > y) {
				System.out.println("DESCRESCENTE! ");
			} else {
				System.out.println("CRESCENTE !");
			}
			
			System.out.println("Digite outro dois numeros: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
