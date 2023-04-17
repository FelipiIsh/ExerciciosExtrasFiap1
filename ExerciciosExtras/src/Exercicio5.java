
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		System.out.println("Digite um número inteiro");
		Scanner sc1 = new Scanner(System.in);
		
		int cm = sc1.nextInt();
		
		if (cm>=70){
			System.out.println("ATIVADO");
		}
		
		else {
			System.out.println("DESATIVADO");
		}
		
	}

}
