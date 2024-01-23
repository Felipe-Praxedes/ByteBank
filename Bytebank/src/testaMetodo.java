public class testaMetodo {
    public static void main(String[] args) {
        Conta contaDoFelipe = new Conta();
        Conta conta = new Conta();
        conta.deposita(1000);
        conta.transfere(100, contaDoFelipe);
        System.out.println(contaDoFelipe.saldo);
    }
}
