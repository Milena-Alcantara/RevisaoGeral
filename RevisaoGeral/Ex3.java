import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner entdados = new Scanner(System.in);
        System.out.println("Informe um número");
        verificacao(entdados.nextInt());
    }
    public static void verificacao(int numeroUser){
            if(numeroUser % 5 == 0 && numeroUser% 7 == 0){
                System.out.println("Seu número é módulo de 5");
            } else if (numeroUser % 7 == 0) {
                System.out.println("Seu número é módulo de 7");
            } else if (numeroUser % 5==0) {
                System.out.println("Seu número é módulo de 5 e de 7");
            } else{
                System.out.println("Seu número não divisível por 5 e nem por 7.");
            }
        }

    }
