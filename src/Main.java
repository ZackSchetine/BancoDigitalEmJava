// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente zack = new Cliente();
        zack.setNome("Zack");

        Conta corrente = new ContaCorrente(zack);
        Conta poupanca = new ContaPoupanca(zack);

        corrente.depositar(500);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}