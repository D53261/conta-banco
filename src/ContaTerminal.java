import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        // Exibir a mensagem para o nosso usuário
        // Obter a partir da Scanner os valores digitados no terminal
        // Exibir a mensagem final da conta criada

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta: ");
        String nome_cliente = scanner.nextLine();
        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o numero da conta: ");
        String numero = scanner.next();
        System.out.println("Digite sua agencia: ");
        int agencia = scanner.nextInt();   

        System.out.printf("Olá %s, sua conta com numero %s, de agência %d e com saldo de %.2f foi criada com sucesso!\n", nome_cliente, numero, agencia, saldo);
    }
}
