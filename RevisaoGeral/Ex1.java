import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex1 {

public static List<String> listadeFeminino = new ArrayList<>();
public static List<Double> alturaFeminino = new ArrayList<>();
public static List<String> listadeMasculino = new ArrayList<>();
public static List<Double> alturaMasculino = new ArrayList<>();


public static int qtdeFemininos=0, qtdeMasculinos = 0;
public static double menorAlturaFem = 99999, maiorAlturaFem = 0, menorAlturaMasc = 9999, maiorAlturaMasc =0, mediaAlturaHomens;
public static void main(String[] args) {
       tratandoDadosdoUser();
        verificarAtura();
        calculoMediaAlturaHomens();
    System.out.println("A quantidade de mulheres é: "+qtdeFemininos);
    }
    public static void tratandoDadosdoUser(){
         Scanner entdados = new Scanner(System.in);
         for (int i = 0; i <10 ; i++) {
          System.out.println("Informe o sexo: \n 1 - FEMININO \t 2 - MASCULINO");
          int sexo = entdados.nextInt();
          switch (sexo){
                case 1:
                 qtdeFemininos++;
                 System.out.println("Informe o nome: ");
                 listadeFeminino.add(entdados.next());

                 System.out.println("Informe a Altura: ");
                 alturaFeminino.add(entdados.nextDouble());
                 break;

                 case 2:
                  qtdeMasculinos++;
                  System.out.println("Informe o nome: ");
                  listadeMasculino.add(entdados.next());

                  System.out.println("Informe a Altura: ");
                  alturaMasculino.add(entdados.nextDouble());
                  break;

                  default:
                   System.out.println("Inválido");
                   System.exit(0);
                }
            }
        }
    public static void verificarAtura(){
        for (int i = 0; i <alturaFeminino.size() ; i++) {
            if ( alturaFeminino.get(i)< menorAlturaFem){
                menorAlturaFem = alturaFeminino.get(i);
            }
        } System.out.println("A menor altura entre as mulheres é: "+menorAlturaFem);

        for (int i = 0; i <alturaFeminino.size() ; i++) {
            if(alturaFeminino.get(i)>maiorAlturaFem){
                maiorAlturaFem = alturaFeminino.get(i);
            }
        } System.out.println("A maior altura entre as mulheres é: "+maiorAlturaFem);
        for (int i = 0; i <alturaMasculino.size() ; i++) {
            if (alturaMasculino.get(i)<menorAlturaMasc){
                menorAlturaMasc = alturaMasculino.get(i);
            }
        } System.out.println("A menor altura entre os homens é: "+menorAlturaMasc);

        for (int i = 0; i <alturaMasculino.size() ; i++) {
            if (alturaMasculino.get(i)>maiorAlturaMasc){
                maiorAlturaMasc =alturaMasculino.get(i);
            }
        } System.out.println("A maior altura entre os homens é: "+maiorAlturaMasc);

    }

    public static void calculoMediaAlturaHomens(){
    double somaAlturas = 0;
        for (int i = 0; i <alturaMasculino.size() ; i++) {
            somaAlturas += alturaMasculino.get(i);
        }
        mediaAlturaHomens = somaAlturas/qtdeMasculinos;
        System.out.println("A média da altura dos homens é: "+(double)mediaAlturaHomens);
    }
}
