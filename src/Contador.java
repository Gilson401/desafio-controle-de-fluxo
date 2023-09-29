import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        int parametroUm = 0;
        int parametroDois = 0;

        try {
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);

        } catch (InputMismatchException exception) {

            System.out.println("Você não inseriu um número válido.");

        } catch (ParametrosInvalidosException exception) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }

        terminal.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
