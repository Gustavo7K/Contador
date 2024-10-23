import java.util.Scanner;

//Desafio Controle de Fluxo da DIO o objetivo é exercitar o conteúdo apresentado no módulo de Controle de Fluxo codificando.
public class Main {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro (deve ser maior que o primeiro):");
            int parametroDois = terminal.nextInt();

            //verificando os parametros da contagem
            verificarParametros(parametroUm, parametroDois);

            //chamando o método contendo a lógica de contagem
            if (parametroDois > parametroUm) {
                contar(parametroUm, parametroDois);
            }

            //tratamento de erros:
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor insira números inteiros!");
        }

    }

    static void contar(int parametroUm, int parametroDois) {
        //validar se parametroUm é MAIOR que o parametroDois e contar os numeros entre eles
        if (parametroUm < parametroDois) {
            for (int i = parametroUm + 1; i < parametroDois; i++) {
                System.out.println("Numeros: " + i);
            }
            int contagem = parametroDois - parametroUm - 1;
            System.out.println("Quantidade de numeros que foram contados: " + contagem);
        }
    }

    //verificação de parametros
    public static void verificarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
        }
    }
}
