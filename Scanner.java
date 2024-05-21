import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Escreva uma frase: ");
		String fraseUm= ref.nextLine();
		
		System.out.println("Escreva uma frase: ");
		String fraseDois = ref.nextLine();
		
		System.out.println("Escreva uma frase: ");
		String  fraseTres = ref.nextLine();
		
		System.out.println("A soma é: " +(fraseUm + fraseDois + fraseTres));
		
		

	}

}
