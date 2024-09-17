import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ingles {
    private static Map<String, String> questoes = new HashMap<>();

    public static void carregarQuestoesPredefinido() {
        questoes.put("Como se diz 'cachorro' em inglês?", "dog");
        questoes.put("Como se diz 'gato' em inglês?", "cat");
        questoes.put("Como se diz 'livro' em inglês?", "book");
        questoes.put("Como se diz 'casa' em inglês?", "house");
        questoes.put("Como se diz 'carro' em inglês?", "car");
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
