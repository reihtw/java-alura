public class Conta {

    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {
        
        this.saldo += valor;
    }

    public boolean saca(double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
        
    }

    public boolean transfere(double valor, Conta conta) {
        boolean conseguiuTransferir = this.saca(valor);
        if (conseguiuTransferir) {
            conta.deposita(valor);
        }
        return conseguiuTransferir;
    }
}