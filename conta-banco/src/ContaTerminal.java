import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura de dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Coleta de dados do usuário
        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt(); // Lê o número da conta

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.next(); // Lê o número da agência

        System.out.println("Por favor, digite o nome do Cliente:");
        scanner.nextLine(); // Limpa o buffer do scanner
        nomeCliente = scanner.nextLine(); // Lê o nome do cliente

        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble(); // Lê o saldo

        // Exibição da mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numero + 
                          " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fechando o scanner
        scanner.close();
    }
}