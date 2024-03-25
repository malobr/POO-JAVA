public class Contato {
    //atributos
    private String nome;
    private String telefone;

    //construtores
    //padrao
    public Contato(){}

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString(){

        String txt = "nome: " + nome + "(" + telefone + ")";
       return txt;
       // return super.toString();
    }

}
