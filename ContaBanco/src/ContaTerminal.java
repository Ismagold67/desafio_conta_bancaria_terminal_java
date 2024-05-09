import java.util.Scanner;

public class ContaTerminal {

    public static String dadosContaBancaria(int numero, String agencia, String nomeCliente, double saldo){
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
    }
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scannner
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int conta = scan.nextInt();

        scan.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = scan.nextLine();
        //NÃO USE NEXT
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scan.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scan.nextDouble();
        scan.close();
        String resultado = dadosContaBancaria(conta, agencia, nomeCliente, saldo);
        System.out.println(resultado);

        //Exibir as mensagens para p usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
    }
}
