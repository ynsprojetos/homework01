import java.util.Scanner;
public class Questao02 {

   void calcularValorProduto(){
       System.out.println("DIGITE O VALOR DO PRODUTO");
       Scanner leitor = new Scanner(System.in);
       int valorProduto = leitor.nextInt();

       System.out.println("ESCOLHA A FORMA DE PAGAMENTO");
       System.out.println("1 - À VISTA EM DINHEIRO OU PIX, RECEBE 10% DE DESCONTO");
       System.out.println("2 - À VISTA NO CARTAO DE CREDITO, RECEBE 5% DE DESCONTO");
       System.out.println("3 - EM DUAS VEZES, PREÇO NORMAL DE ETIQUETA SEM JUROS");
       System.out.println("4 - EM TRÊS VEZES, PREÇO NORMAL DE ETIQUETA MAIS JUROS DE 10%");

       int formaPagamento = leitor.nextInt();

       int percentual;
       int valorFinal;

       switch(formaPagamento) {
           case 1:
               System.out.println("VOCÊ SELECIONOU A OPÇÃO: 1 - À VISTA EM DINHEIRO OU PIX, RECEBE 10% DE DESCONTO");
               percentual = valorProduto * 10/100;
               valorFinal = valorProduto - percentual;
               System.out.println("VALOR FINAL É: " + valorFinal);
               break;
           case 2:
               System.out.println("VOCÊ SELECIONOU A OPÇÃO: 2 - À VISTA NO CARTAO DE CREDITO, RECEBE 5% DE DESCONTO");
               percentual = valorProduto * 5/100;
               valorFinal = valorProduto - percentual;
               System.out.println("VALOR FINAL É: " + valorFinal);
               break;
           case 3:
               System.out.println("VOCÊ SELECIONOU A OPÇÃO: 3 - EM DUAS VEZES, PREÇO NORMAL DE ETIQUETA SEM JUROS");
               System.out.println("(x2) PARCELAS DE: " + valorProduto/2);
               break;
           case 4:
               percentual = valorProduto * 10/100;
               valorFinal = valorProduto + percentual;
               System.out.println("VOCÊ SELECIONOU A OPÇÃO: 4 - EM TRÊS VEZES, PREÇO NORMAL DE ETIQUETA MAIS JUROS DE 10%");
               System.out.println("(x3) PARCELAS DE: " + valorFinal/3);
               break;
           default:
               System.out.println("OPÇÃO INVALIDA!");
       }

    }



}
