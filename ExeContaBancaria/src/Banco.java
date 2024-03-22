public class Banco{
    public static void main(String[] args) {
        ContaBancaria();
    }

    public static void ContaBancaria(){

        ContaBancaria conta = new ContaBancaria();
        conta.setNConta(1234);
        conta.setNomeTitular("Aristoteles");
        conta.setSaldo(100.000f);

        ContaBancaria conta2 = new ContaBancaria(1235, "Eclesiastes", 25.3321f);

        conta2.setNomeTitular("Fernandinho");

        System.out.println("Conta n: " + conta.getNConta());
        System.out.println("Titular: " + conta.getNomeTitular());
        System.out.println("Saldo atual: " + conta.getSaldo());

        
        conta2.exibirDadosConta();

        conta.depositar(1722);
        conta.sacar(1862.99f);

        conta2.depositar(4522);
        conta2.sacar(9162.99f);

    }
}

    