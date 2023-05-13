import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entdados = new Scanner(System.in);
        double soma = 0, mediadeSalarios;
        System.out.println("Informe a quantidade de funcionários: ");
        int qtdeFunc = entdados.nextInt();
        System.out.println("Informe os sálarios de cada funcionário: ");
        List<Double> salarios = new ArrayList<>();
        for (int i = 0; i <qtdeFunc ; i++) {
            salarios.add(entdados.nextDouble());
        }
        for (int i = 0; i < salarios.size() ; i++) {
           soma += salarios.get(i);
        }
        mediadeSalarios = soma/qtdeFunc;
        System.out.println("A média salarial dos seus funcionários é: "+((double)mediadeSalarios));
    }
}
