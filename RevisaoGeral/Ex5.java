import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex5 {

    public static void main(String[] args) {


        int numeros = 100;
        int [] vetorComosNumeros = new int[51];
        for (int i = 0; i < vetorComosNumeros.length ; i++) {
            vetorComosNumeros[i] = numeros;
            numeros++;
        }
        String [] vetorPpoderQuebrarosNumeros = new String[vetorComosNumeros.length];
        for (int i = 0; i <vetorPpoderQuebrarosNumeros.length ; i++) {
            vetorPpoderQuebrarosNumeros[i] = String.valueOf(vetorComosNumeros[i]);
        }
        List<Integer> numerosSomadosqueSaoPares = new ArrayList<>();
        for (int i = 0; i <vetorPpoderQuebrarosNumeros.length ; i++) {
            String [] numerosQuebrados = vetorPpoderQuebrarosNumeros[i].split("");
            List<Integer> numerosQuebradosInt = new ArrayList<>();

            for (int j = 0; j <numerosQuebrados.length ; j++) {
                numerosQuebradosInt.add(Integer.parseInt(numerosQuebrados[j]));
            }
            int soma = 0;
            for (int k = 0; k <numerosQuebradosInt.size() ; k++) {
                soma+= numerosQuebradosInt.get(k);
            }

            if(soma %2 == 0){
                numerosSomadosqueSaoPares.add(Integer.valueOf(vetorPpoderQuebrarosNumeros[i]));
            }

        }
        System.out.println(numerosSomadosqueSaoPares);

 }


}

