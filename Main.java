import java.util.ArrayList;
import java.util.List;

public class Main {

    // Método principal, ponto de entrada da aplicação
    public static void main(String[] args) {

        // Cria instâncias de Guerreiro e Mago
        Guerreiro arthus = new Guerreiro("Arthus", 5, 150, 12.0, 8.0);
        Mago morgana = new Mago("Morgana", 7, 100, 15.0, 10.0);
        
        // Exibe status
        arthus.exibirStatus();
        morgana.exibirStatus();

        // Usa habilidades especiais
        arthus.usarHabilidadeEspecial();
        morgana.usarHabilidadeEspecial();

        System.out.println("\n--- Demonstração de Polimorfismo ---");
        List<Personagem> herois = new ArrayList<>();
        herois.add(arthus);
        herois.add(morgana);
        herois.add(new Guerreiro("Borin", 3, 120, 10.0, 6.0));

        for (Personagem p : herois) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println("------------------------------------");
        }
    }
}
