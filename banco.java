package EstudoEmJava;

import java.util.Locale;
import java.util.Scanner;


public class banco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        String nome1;
        String nome2;
        double salario1;
        double salario2;
        int idade;
        char sexo;

        System.out.println("Nome da primeira pessoa: ");
        nome1 = sc.nextLine();
        System.out.println("Salario da Primeira pessoa: ");
        salario1 = sc.nextDouble();

        System.out.println("Nome da Segunda Pessoa: ");
        sc.nextLine();
        nome2 = sc.nextLine(); 
        System.out.println("Salario da Segunda Pessoa: ");
        salario2 = sc.nextDouble();

        System.out.println("Digite uma Idade: ");
        idade = sc.nextInt();
        System.out.println("Digite um sexo (F/M): ");
        sexo = sc.next().charAt(0);

        System.out.println("Nome 1: " + nome1);
        System.out.println("Salario 1: " + String.format("%.2f", salario1));
        System.out.println("Nome 2: " + nome2);
        System.out.println("Salario 2: " + String.format("%.2f", salario2));
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

        sc.close();
    }
}