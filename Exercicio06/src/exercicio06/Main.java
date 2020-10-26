package exercicio06;
import java.util.Scanner;

public class Main {

	public static double mdc (double dividendo, double divisor){


        if ((dividendo % divisor == 0 )){
            return divisor;
        }else{
        return mdc(divisor,(dividendo % divisor));
          } 
    }

        public static void main(String[] args) { 

        System.out.println("Digite o valor do dividendo: ");
        double dividendo = new Scanner(System.in).nextDouble();
        
        System.out.println("Digite o valor do divisor: ");
        double divisor = new Scanner(System.in).nextDouble();
        
        double resposta = mdc(divisor,dividendo);
        String resultado = String.format("%.0f", resposta);
        System.out.println("resposta ....: "+resultado);

        }

    }



