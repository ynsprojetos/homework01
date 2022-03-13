public class Questao01 {


    public void calculadora(int valor1, int valor2){
        somar(valor1, valor2);
        subtrair(valor1, valor2);
        multiplicar(valor1, valor2);
        dividir(valor1, valor2);
    }

    private void somar(int valor1, int valor2){
        System.out.println("SOMA: " + valor1 + valor2);
    }

    private void subtrair(int valor1, int valor2){
        int result = valor1 - valor2;
        System.out.println("SUBTRAÇÃO: " + result);
    }

    private void multiplicar(int valor1, int valor2){
        System.out.println("MULTIPLICAÇÃO: " + valor1 * valor2);
    }

    private void dividir(int valor1, int valor2){

        if(valor2 == 0){
            System.out.println("é impossivel dividir por 0");
        }else{
            System.out.println("MULTIPLICAÇÃO: " + valor1 / valor2);
        }

    }


}
