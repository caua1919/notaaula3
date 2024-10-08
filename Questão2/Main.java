import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    { Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o nome do cachorro");
        String nomeCachorro = scanner.next();
        System.out.println("Digite a raca do cachorro");
        String racaCachorro = scanner.next();
        System.out.println("Digite o nome do seu gato");
        String nomeGato = scanner.next();
        System.out.println("Digite a raca do teu gato");
        String racaGato = scanner.next();

        Animal c = new Cachorro(nomeCachorro, racaCachorro);
        Animal g = new Gato(nomeGato, racaGato);

        ((Cachorro) c).latir();
        ((Gato) g).miar();

        System.out.println("Dados do Animal é:" + c );
        System.out.println("Dados do Animal é:" + g );
    }
}