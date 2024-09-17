import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frances {
    private static Map<String, String> questoes = new HashMap<>();

    public static void carregarQuestoesPredefinido() {
        questoes.put("How do you say 'cachorro' in French?", "chien");
        questoes.put("How do you say 'gato' in French?", "chat");
        questoes.put("How do you say 'livro' in French?", "livre");
        questoes.put("How do you say 'casa' in French?", "maison");
        questoes.put("How do you say 'carro' in French?", "voiture");
    }

    public static void adicionarQuestao(String pergunta, String respostaCorreta) {
        questoes.put(pergunta, respostaCorreta);
    }

    public static void fazerQuestoes(Aluno aluno) {
        Scanner sc = new Scanner(System.in);
        if (questoes.isEmpty()) {
            carregarQuestoesPredefinido();
        }
        for (String pergunta : questoes.keySet()) {
            System.out.println(pergunta);
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase(questoes.get(pergunta))) {
                System.out.println("Resposta correta!");
                aluno.incrementarStreak();
                aluno.adicionarPontos(10);
            } else {
                System.out.println("Resposta incorreta.");
                aluno.resetarStreak();
            }

            System.out.println("Streak atual: " + aluno.getStreak());
            System.out.println("Pontos totais: " + aluno.getPontosTotais());
        }
    }

}
