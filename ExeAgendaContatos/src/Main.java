public class Main {
    public static void main(String[] args) {
        
        Contato c1 = new Contato();

        c1.setNome("Fulano");
        c1.setTelefone("(41) 98765-4321");

        Contato c2 = new Contato("Beltrano", "(41) 98370-3002");
        Contato c3 = new Contato("Aristoteles", "SN");

        //instalacao da agenda
        Agenda agenda1 = new Agenda();

        agenda1.salvarContato(c1);
        agenda1.salvarContato(c2);
        agenda1.salvarContato(c3);


        agenda1.limparAgenda();


        agenda1.salvarContato(c1);
        agenda1.salvarContato(c1);

        agenda1.buscarContato("Fulano");
        agenda1.buscarContato("Maria");
        agenda1.buscarContato("Fulano");


    }
}
