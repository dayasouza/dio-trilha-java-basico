import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        double saldo;

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

	    //TODO: Exibir as mensagens para o nosso usuário e  Obter pela classe scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();
	    
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta: ");
        saldo = scanner.nextDouble();


	    //TODO: Exibir a mensagem da conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );

        scanner.close();

    }
}
