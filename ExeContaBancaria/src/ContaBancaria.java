public class ContaBancaria{

    private int NConta;
    private String NomeTitular;
    private float Saldo;

    public ContaBancaria(){}

    public ContaBancaria(int NConta, String NomeTitular, Float Saldo){
        this.NConta = NConta;
        this.NomeTitular = NomeTitular;
        this.Saldo = Saldo;
    }

    public void setNConta(int NConta){

        this.NConta = NConta;

    }

    public int getNConta(){
        return NConta;
    }

    public void setNomeTitular(String NomeTitular){
        this.NomeTitular = NomeTitular;
    }

    public String getNomeTitular(){
        return NomeTitular;
    }

    public void setSaldo(Float Saldo){
        this.Saldo = Saldo;
    }

    public Float getSaldo(){
        return Saldo;
    }

    public void exibirDadosConta(){
        System.out.println("Numero da Conta: " + NConta);
        System.out.println("Nome do Titular: " + NomeTitular);
        System.out.println("Saldo atual: " + Saldo);
        System.out.println();
    }

    public void sacar(float valor){
        System.out.println("Sacando " + valor + "da conta " + NConta);
        saldo -= valor;
        exibirDadosConta();
    }

    public void depositar(float valor){
        System.out.println("Depositar " + valor + "da conta " + NConta);
        Saldo += valor;
        exibirDadosConta();
    }

}