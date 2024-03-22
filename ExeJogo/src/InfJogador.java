public class InfJogador {
    public static void main(String[] args) {
        
        Jogador();

    }

    public static void Jogador(){

        Jogador player1 = new Jogador(" fulano: ", 100, 1);
        Jogador player2 = new Jogador(" Beltrano: ", 200, 2);


        player1.exibirStatusJogador();
        player2.exibirStatusJogador();


        player1.aumentarPontuacao(100);
        player1.subirNivel();
        player1.aumentarPontuacao(50);

        player2.aumentarPontuacao(300);
        player2.subirNivel();
        player2.subirNivel();
        

    }
}
