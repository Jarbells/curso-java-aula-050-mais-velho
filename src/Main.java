import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int n, oldest, oldestPosition = 0;
		String[] names;
		int[] ages;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		names = new String[n];
		ages = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			names[i] = sc.nextLine();
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
		}
		
		oldest = ages[0];
		for(int i = 1; i < ages.length; i++) {
			if(ages[i] > oldest) {
				oldest = ages[i];
				oldestPosition = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + names[oldestPosition]);
		
		sc.close();
	}
}
