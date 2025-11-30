package aplicado;

import java.util.Locale;
import java.util.Scanner;

import calculo.Estudante;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudo = new Estudante();
		
		System.out.println("Nome do Aluno: ");
		estudo.nome = sc.next();
		
		System.out.printf("Notas do Aluno: %n");
		estudo.nota1 = sc.nextDouble();
		estudo.nota2 = sc.nextDouble();
		estudo.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", estudo.notaFinal());
		
		if(estudo.notaFinal()<60) {
			System.out.println("rodou!!");
			System.out.printf("faltou: %.2f pontos %n",estudo.faltandoPonto());
		}
		else {
			System.out.println("Passou!!!");
		}
	sc.close();	
	}
	}


