import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        int quantidadeNumeros = 0;
        float[] listaNumeros;

        quantidadeNumeros = tamanhoArray();

        listaNumeros = new float[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            listaNumeros[i] = getNumber();
        }

        String operacao = media();

        if (operacao.equals("aritmetica")) {
            System.out.printf("A média %s dos números " + Arrays.toString(listaNumeros) + " é %f", operacao, aritmetica(listaNumeros));
        } else if (operacao.equals("harmonica")) {
            System.out.printf("A média %s dos números " + Arrays.toString(listaNumeros) + " é %f", operacao, harmonica(listaNumeros));
        } else{

        }
    }
    public static float getNumber() {
        Scanner sc = new Scanner(System.in);
        try{
            float num;
            System.out.println("Insira um número:");
            num = sc.nextFloat();
            return num;
        } catch (InputMismatchException e){
            System.out.println("O valor inserido deve ser um número.");
            return getNumber();
        }
    }

    public static float aritmetica(float[] array) {
        float resultado;
        float soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        resultado = soma / array.length;

        return resultado;
    }

    public static float harmonica(float[] array) {
        float resultado;
        float parcial = 0;
        for (int i = 0; i < array.length; i++) {
            parcial += 1 / array[i];
        }
        resultado = array.length / (parcial);
        return resultado;
    }

    public static String media(){
        Scanner stringScanner = new Scanner(System.in);

        System.out.println("Selecione a media que deseja escrevendo aritmetica ou harmonica");
        String operacao = stringScanner.next();


        if (operacao.equals("aritmetica")) {
            return "aritmetica";
        } else if (operacao.equals("harmonica")) {
            return "harmonica";
        } else{
            return media();
        }
    }
    public static int tamanhoArray(){
        Scanner sc = new Scanner(System.in);
        int quantidadeNumeros = 0;
        try {
            System.out.println("Digite quantos números deseja inserir para o calculo de média");
            quantidadeNumeros = sc.nextInt();
            return quantidadeNumeros;
        } catch (InputMismatchException e) {
            System.out.println("Digite um número inteiro.");
            return tamanhoArray();
        }
    }
}

