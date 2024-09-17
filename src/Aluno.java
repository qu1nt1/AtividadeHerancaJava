import java.util.List;

public class Aluno extends Usuario{
    private String idiomaDeInteresse;
    private int streak = 0;
    private int pontosTotais = 0;

    public Aluno(String nome, String email, String nivelExperiencia, String idiomaDeInteresse){
        super(nome, email, nivelExperiencia);
        this.idiomaDeInteresse = idiomaDeInteresse;
    }

    public String getIdiomaDeInteresse() {
        return idiomaDeInteresse;
    }

    public int getStreak() {
        return streak;
    }

    public void incrementarStreak() {
        streak++;
    }

    public void resetarStreak() {
        streak = 0;
    }

    public int getPontosTotais() {
        return pontosTotais;
    }

    public void adicionarPontos(int pontos) {
        pontosTotais += pontos;
    }

}
