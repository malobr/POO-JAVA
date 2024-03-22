public class InfoCarro {
    
    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeAtual;

    public Carro(){
        
        marca = "Rolls Royce";
        modelo = "Ghost";
        ano = 2024;
        velocidadeAtual = 0;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAno(int ano){
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }


    public void acelerar(){

        if(velocidadeAtual == 240){

            System.out.println(marca + " " + modelo + " esta na velocidade maxima!");
            return;

        }   //Poderia ser usado um "else", mas com o "return" o codigo fica mais limpo.......

        velocidadeAtual += 20;
        System.out.println(marca + " " + modelo + " esta andando a " + velocidadeAtual + "km/h");

    }

    public void frear(){
        
        if(velocidadeAtual ==0){

            System.out.println(marca + " " + modelo + " esta parado!");
            return;

        }

        velocidadeAtual -= 20;
        System.out.println(marca + " " + modelo + " diminuiu sua velocidade para" + velocidadeAtual + "km/h");

    }



}
