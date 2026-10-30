package transferencia;

public class conta {

    String agencia;
    String numeroConta;
    double saldo;
    cliente proprietario;

    public conta(String agencia, String numeroConta, double saldo, cliente proprietario) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public cliente getProprietario() {
        return proprietario;
    }

    public void realizarDeposito(double valor){
        //saldo = saldo + valor;
        saldo += valor;
    }

    public boolean realizarSaque (double valor) {
        if (valor > saldo) {
            return false;
        }
        //saldo = saldo - valor;
        saldo -= valor;
        return true;
    }

    public boolean realizarTransferencia(double valor, conta destino){
        if (realizarSaque(valor)){
    destino.realizarDeposito(valor);
    return true;
        }
        return false;

    }

    @Test
    public void validarTransferenciaInvalida(){


    }

}
