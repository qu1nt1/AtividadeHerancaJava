import java.util.Scanner;

public class Professor extends Usuario {
    private String idioma;

    public Professor(String nome, String email, String idioma, String nivelExperiencia) {
        super(nome, email, nivelExperiencia);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void criarQuestao(String tipoDeQuestao) {
        Scanner sc = new Scanner(System.in);
        if (tipoDeQuestao.equalsIgnoreCase("Inglês")) {
            System.out.print("Digite a palavra em Inglês:");
            String pergunta = sc.nextLine();
            System.out.print("Digite a palavra em Português:");
            String resposta = sc.nextLine();
            Ingles.adicionarQuestao("Como se diz s" + pergunta + " em English", resposta);
        } else if (tipoDeQuestao.equalsIgnoreCase("Espanhol")) {
            System.out.print("Digite a palavra em Espanhol:");
            String pergunta = sc.nextLine();
            System.out.print("Digite a palavra em Português:");
            String resposta = sc.nextLine();
            Espanhol.adicionarQuestao("Como se diz " + pergunta + " em Espanhol", resposta);
        } else if (tipoDeQuestao.equalsIgnoreCase("Francês")) {
            System.out.print("Digite a palavra em Francês:");
            String pergunta = sc.nextLine();
            System.out.print("Digite a palavra em Português:");
            String resposta = sc.nextLine();
            Frances.adicionarQuestao("Como se diz " + pergunta + " em Francês", resposta);
        } else if (tipoDeQuestao.equalsIgnoreCase("Japonês")) {
            System.out.print("Digite a palavra em Japonês:");
            String pergunta = sc.nextLine();
            System.out.print("Digite a palavra em Português:");
            String resposta = sc.nextLine();
            Japones.adicionarQuestao("Como se diz " + pergunta + " em Japonês", resposta);
        } else {
            System.out.println("Tipo de questão não suportado.");
        }
    }
}
