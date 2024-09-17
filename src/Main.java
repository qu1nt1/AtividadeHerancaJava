import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcao;
        String idiomaDeInteresse;
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean opcaoCorreta = false;
        idiomaDeInteresse = "";
        String nivelExperiencia = "";

        Professor professor = new Professor("Alberto silva", "alberto.silva@gmail.com", "Avançado","Inglês");


        while(true){
            System.out.println("Bem-vindo ao EasyLang.");
            System.out.print("1. Sou Aluno.\n2. Sou professor.\n3. Sou novo aluno.\nDigite sua opcao: ");
            opcao = sc.nextLine();
            if(opcao.equals("1")){
                if (!alunos.isEmpty()) {
                    Aluno aluno = alunos.get(0);
                    System.out.println("Olá " + aluno.getNome() + "!");
                    System.out.println("Streak atual: " + aluno.getStreak());
                    System.out.println("Pontos totais: " + aluno.getPontosTotais());
                    System.out.print("Gostaria de fazer questões de " + aluno.getIdiomaDeInteresse() + "? (s/n): ");
                    String resposta = sc.nextLine().trim();
                    if (resposta.equalsIgnoreCase("s")) {
                        if (aluno.getIdiomaDeInteresse().equals("Inglês")){
                            System.out.println("Atividade Inglês:");
                            Ingles.fazerQuestoes(aluno);
                        } else if (aluno.getIdiomaDeInteresse().equals("Espanhol")) {
                            Espanhol.fazerQuestoes(aluno);
                        } else if (aluno.getIdiomaDeInteresse().equals("Francês")) {
                            Frances.fazerQuestoes(aluno);
                        } else if (aluno.getIdiomaDeInteresse().equals("Japonês")) {
                            System.out.println("Atividade Japonês:");
                            Japones.fazerQuestoes(aluno);
                        }
                    }
                } else {
                    System.out.println("Nenhum aluno cadastrado.");
                }
            }
            else if(opcao.equals("2")) {
                System.out.println("Olá, professor! Escolha um idioma para adicionar novas questões:");
                System.out.print("1. Inglês\n2. Espanhol\n3. Francês\n4. Japonês\nDigite sua opcao: ");
                String idiomaEscolhido = sc.nextLine();

                switch (idiomaEscolhido) {
                    case "1":
                        System.out.println("Você escolheu Inglês.");
                        professor.criarQuestao("Inglês");
                        break;
                    case "2":
                        System.out.println("Você escolheu Espanhol.");
                        professor.criarQuestao("Espanhol");
                        break;
                    case "3":
                        System.out.println("Você escolheu Francês.");
                        professor.criarQuestao("Francês");
                        break;
                    case "4":
                        System.out.println("Você escolheu Japonês.");
                        professor.criarQuestao("Japonês");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
            else if(opcao.equals("3")) {
                String novoUsuarioNome;
                String novoUsuarioEmail;
                System.out.print("Digite seu nome: ");
                novoUsuarioNome = sc.nextLine();
                System.out.print("Digite seu email: ");
                novoUsuarioEmail = sc.nextLine();
                while (opcaoCorreta == false) {
                    System.out.print("Lista de idiomas\n1. Inglês\n2. Espanhol\n3. Francês\n4. Japonês\nDigite sua opcao: ");
                    opcao = sc.nextLine();
                    if (opcao.equals("1")) {
                        idiomaDeInteresse = "Inglês";
                        opcaoCorreta = true;
                    } else if (opcao.equals("2")) {
                        idiomaDeInteresse = "Espanhol";
                        opcaoCorreta = true;
                    } else if (opcao.equals("3")) {
                        idiomaDeInteresse = "Francês";
                        opcaoCorreta = true;
                    } else if (opcao.equals("4")) {
                        idiomaDeInteresse = "Japonês";
                        opcaoCorreta = true;
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                    }
                }
                opcaoCorreta = false;
                System.out.print("Qual seu nivel de experiencia nesse idioma\n1. Iniciante\n2. Intermediário\n3. Avançado\nDigite sua opcao: ");
                opcao = sc.nextLine();
                while (opcaoCorreta == false) {
                    switch (opcao) {
                        case "1":
                            nivelExperiencia = "Iniciante";
                            opcaoCorreta = true;
                            break;
                        case "2":
                            nivelExperiencia = "Intermediário";
                            opcaoCorreta = true;
                            break;
                        case "3":
                            nivelExperiencia = "Avançado";
                            opcaoCorreta = true;
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }
                System.out.println(nivelExperiencia);
                Aluno aluno = new Aluno(novoUsuarioNome, novoUsuarioEmail, nivelExperiencia, idiomaDeInteresse);
                alunos.add(aluno);
                System.out.println("Novo aluno criado com sucesso!");
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Email: " + aluno.getEmail());
                System.out.println("Idiomas de interesse: " + aluno.getIdiomaDeInteresse());

            }
        }
    }
}