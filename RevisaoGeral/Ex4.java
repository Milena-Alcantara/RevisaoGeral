import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner entdados = new Scanner(System.in);
        System.out.println("Informe um número");
         conversao(entdados.nextInt());
    }
    public static void conversao(int numeroDoUser){
        String verificarNum = String.valueOf(numeroDoUser);

        StringBuilder inversao = new StringBuilder(verificarNum);
        inversao.reverse();

        int numeroInvertido = Integer.parseInt(inversao.toString());
        System.out.println("Veja como fica o seu número invertido: "+numeroInvertido);

    }

}
