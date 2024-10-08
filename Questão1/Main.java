package Questão1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Gerente g = new Gerente();
            Programador p = new Programador();

            System.out.println("cadastro do gerente:");
            System.out.println("digite seu nome:");
            g.nome = scanner.next();
            System.out.println("digite o ano que você nasceu:");
            g.nascimento = scanner.next();
            System.out.println("digite seu salario:");
            g.salario = scanner.nextDouble();

            System.out.println("cadastro do programador:");

            System.out.println("digite seu nome:");
            g.nome = scanner.nextLine();
            System.out.println("digite o ano que nasceu");
            g.nascimento = scanner.next();
        }
        System.out.println();

    }
}