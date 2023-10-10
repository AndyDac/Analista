import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SistemaDeSelecao {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Quantos candidatos deseja analisar? ");
            int numCandidatos = scanner.nextInt();

            // Lista para armazenar os candidatos selecionados
            List<Candidato> candidatosSelecionados = new ArrayList<>();

            for (int i = 0; i < numCandidatos; i++) {
                // Gera candidatos aleatórios
                String nome = "Candidato" + (i + 1);
                int idade = random.nextInt(50) + 20; // Idade entre 20 e 70 anos
                int experiencia = random.nextInt(10) + 1; // Experiência entre 1 e 10 anos
                String telefone = "123-456-789" + i; // Número de telefone fictício
                int pontuacao = random.nextInt(100) + 1; // Pontuação aleatória de 1 a 100

                // Avaliação do candidato
                if (pontuacao >= 50) {
                    Candidato candidato = new Candidato(nome, idade, experiencia, telefone, pontuacao);
                    candidatosSelecionados.add(candidato);
                }
            }

            // Imprime a lista de candidatos selecionados
            System.out.println("\nCandidatos Selecionados:");
            for (Candidato candidato : candidatosSelecionados) {
                System.out.println(candidato);
            }

            // Simulação de ligações para candidatos selecionados
            System.out.println("\nSimulando ligações para candidatos selecionados:");
            for (Candidato candidato : candidatosSelecionados) {
                System.out.println("Ligando para " + candidato.getNome() + " no número " + candidato.getTelefone());
            }
        }
    }
}

class Candidato {
    private String nome;
    private int idade;
    private int experiencia;
    private String telefone;
    private int pontuacao;

    public Candidato(String nome, int idade, int experiencia, String telefone, int pontuacao) {
        this.nome = nome;
        this.idade = idade;
        this.experiencia = experiencia;
        this.telefone = telefone;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Anos de Experiência: " + experiencia +
                ", Pontuação: " + pontuacao + ", Telefone: " + telefone;
    }
}
