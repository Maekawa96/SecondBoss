import java.util.Random;
import java.util.Scanner;


class adivinhacao{
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner (System.in);
        Random aleatorioRandom = new Random();
        int sorteado = aleatorioRandom.nextInt(100) + 1;
        boolean acertou = false;
        int tentativa;
        System.out.println("Bem Vindo ao jogo");
        System.out.println("Você tem 10 tentativas \n");
        
        for (tentativa = 0 ; tentativa < 10; tentativa++){
            System.out.print("Escolha um numero: ");
            int palpite = lerTeclado.nextInt();

            if (palpite < sorteado){
                System.out.println("O numero é maior \n");
                System.out.println("Você ainda tem "+ tentativa + " tentativas");
            
            } else if(palpite > sorteado){
                System.out.println("O numero é menor \n");
                System.out.println("Você ainda tem "+ tentativa + " tentativas");

            } else {
                acertou = true;
                break;
            } 

        }

        if (acertou){
            System.out.println("Parabéns você acertou o numero: " + sorteado );
            System.out.println("Com " + (tentativa + 1) + " Tentativas \n");
            
        }else{
            System.out.println("Você errou! O número sorteado era: " + sorteado);
        }

        lerTeclado.close();
    }
}