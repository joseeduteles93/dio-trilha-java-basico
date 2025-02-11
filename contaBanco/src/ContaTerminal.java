
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar classe scanenr
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Exibir as msgs para o nosso usuario
        System.out.println("Por favor digite seu nome: ");
        String nome = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite sua agencia com Hifen: ");
        String ag = sc.nextLine();
        System.out.println("Digite sua conta sem Hifen: ");
        int ct = sc.nextInt();
        System.out.println("Digite o valor a ser depositado: ");
        double amount = sc.nextDouble();

        


        //Obter pela scanner os dados

        //exibir mensagem final

        System.out.println("Ola " + nome + ", obrigado por criar uma nova conta em nosso banco. Sua agencia eh " + ag + ", conta " + ct + " e o saldo de R$" + amount + " ja esta disponivel para saque.");

        sc.close();
    }
}
