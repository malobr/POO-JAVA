import java.io.Console;
import java.util.Scanner;
public class Aula07{
    public static void main(String[] args) {

        Exe01();

    }

    //EXERCICIO 01
    public static void Exe01(){
        //LIVRO 01
        livro livro1 = new livro();
        livro1.nome = "Coraline e o Mundo Secreto";
        livro1.autor = "Neil Gaiman";
        livro1.ano = 2009;
        livro1.editora = "INTRINSECA";

        System.out.println("Nome do livro: " + livro1.nome + "\n" + "Autor do livro: " + livro1.autor + "\n" + 
                                            "Ano de Lancamento: " + livro1.ano + "\n" + "Editora do livro: " + livro1.editora + "\n\n");
        //FIM LIVRO 01
        //////////////
        //LIVRO 02
        livro livro2 = new livro();
        livro2.nome = "The Cats of Ulthar";
        livro2.autor = "H. P. Lovecraft";
        livro2.ano = 1920;
        livro2.editora = " Editora Diario Macabro.";

        System.out.println("Nome do livro: " + livro2.nome + "\n" + "Autor do livro: " + livro2.autor + "\n" + 
                                            "Ano de Lancamento: " + livro2.ano + "\n" + "Editora do livro: " + livro2.editora);
        //FIM LIVRO 02
    }
    //FIM EXERCICIO 01
   
}

/*Imagine uma pequena biblioteca pessoal, uma coleção que você começou a construir com seus 
livros favoritos. No entanto, com o tempo e o acúmulo de mais e mais livros, você percebe a 
necessidade de organizar e acessar rapidamente as informações de cada um deles.  
Para ajudar nessa organização, você decide criar um sistema simples em Java que permitirá 
registrar cada livro com detalhes cruciais: o título, o autor e o ano de publicação. Além de 
armazenar esses dados, você quer uma maneira fácil de exibir as informações de qualquer livro da 
sua coleção, para quando quiser relembrar um título ou sugerir uma leitura a um amigo.

Dica: 
“Desenvolva a classe Livro com os atributos título, autor e ano. Implemente um construtor para 
inicializar esses atributos quando um novo livro for instanciado no seu sistema. Adicione um 
método exibirInfo() para mostrar todos os dados do livro na tela.” */