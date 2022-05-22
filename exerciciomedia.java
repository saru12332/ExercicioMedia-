package JavaProjectAvaliacao;

import java.util.Scanner;

public class exerciciomedia {

	public static void main(String[] args) {
		System.out.println("Peso das Notas: AC1 1.5 - AC2 3.0 - AG 1.0 - AF 4.5!"); // O peso das notas a serem calculadas
        Scanner ler = new Scanner(System.in);
        float ac1, ac2, ag, af; // Variantes das notas das Avaliacoes 
        double mf, n1, n2, n3, n4; // Variantes dos calculos das Avaliacoes   
        
        System.out.println("Digite a nota da sua AC1: "); // Receber um numero do usuario
        ac1 = ler.nextFloat(); // Guardar o numero do usuario
        System.out.println("Digite a nota da sua AC2: "); // Receber um numero do usuario
        ac2 = ler.nextFloat(); // Guardar o numero do usuario
        System.out.println("Digite a nota da sua AF: "); // Receber um numero do usuario
        ag = ler.nextFloat(); // Guardar o numero do usuario
        System.out.println("Digite a nota da sua AG: "); // Receber um numero do usuario
        af = ler.nextFloat(); // Guardar o numero do usuario
        n1 = ac1 * 0.15; // Calcular a nota pelo peso da mesma
        n2 = ac2 * 0.3; // Calcular a nota pelo peso da mesma
        n3 = ag * 0.1; // Calcular a nota pelo peso da mesma
        n4 = af * 0.45; // Calcular a nota pelo peso da mesma
        mf = (n1+n2+n3+n4); // Calcular a media somando as notas
         
         if (mf >= 5){ // Se a media for maior que 5: 
             System.out.printf("Sua media foi de %f!\nVoce foi aprovado!",mf); // Exibir a media e responder ao usuario Aprovado
         }
        else { // Se a media for menor que 5: 
            System.out.printf("Sua media foi de %f!\nVoce foi reprovado!",mf); // Exibir a media e responder ao usuario Reprovado
        }
        
    }
}