import java.util.Scanner;

public class exec_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, DIFERENCA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		DIFERENCA = (A*B - C*D);
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		sc.close();
		
	}

}

//Fazer um programa para lerquatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B -C * D).