import java.util.Locale;
import java.util.Scanner;

public class exec_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc, hTrab;
		double vlrHora, salario;
		
		numFunc = sc.nextInt();
		hTrab = sc.nextInt();
		vlrHora = sc.nextDouble();
		
		salario = vlrHora * hTrab;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
	}
		
}

// Fazer um programa que leia o número de um funcionário, 
// seu número de horas trabalhadas, o valor que recebe por hora 
// e calcula o salário desse funcionário. 
// A seguir, mostre o número e o salário do funcionário, 
// com duas casas decimais