public class Agenda {
    
    private Contato[] agenda = new Contato[3];
    private int pos;

    public Agenda(){
        pos = 0;
    }

    public void salvarContato(Contato contato){


        if(pos >= agenda.length){
            System.out.println("\n A agenda esta cheia: ");
            return;
        }
            agenda[pos] = new Contato();
            agenda[pos] = contato;
            pos ++;
            
            System.out.println("Contato " + contato.getNome() + "(" + contato.getTelefone() + ") foi salvo na agenda!");
    }

    public void limparAgenda(){

        for (int i = 0; i < agenda.length; i++) {
           
            agenda[i] =  new Contato();

        } 
        pos = 0;
        System.out.println("\nA agenda foi limpa.\n Atualmente esta sem contatos e sem cadastros!!");

    }
    
    public void buscarContato(String nome){

        boolean encontrou = false;

        for(int i =0; i < pos; i++){
            if (agenda[i].getNome().equals(nome)) {
                
                System.out.println("\nContato localizado: ");
                System.out.println(agenda[i].toString());
                encontrou = true;
            }
        }

        if (!encontrou) {//encontrou == false
            
            System.out.println("\nO contato" +  nome + " informado nao foi encontrado...");

        }
    }
 }