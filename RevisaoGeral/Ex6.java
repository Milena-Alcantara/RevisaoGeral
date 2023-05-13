import java.util.Scanner;
public class Ex6 {

    public static void main(String[] args) {
        Scanner entdados = new Scanner(System.in);
        int [] numerosAleatorios = new int[20];
        int result = 0;
        System.out.println("Informe os números que deseja somar: ");
        for (int i = 0; i <numerosAleatorios.length ; i++) {
            numerosAleatorios[i] = entdados.nextInt();
        }
        for (int i = 0; i < numerosAleatorios.length ; i++) {
            result += numerosAleatorios[i];
        }
        System.out.println("Seu numeros digitados somados é:  "+result);
    }

}
