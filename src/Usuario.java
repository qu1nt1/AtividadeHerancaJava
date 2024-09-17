import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String nivelExperiencia;

    public Usuario(String nome, String email, String nivelExperiencia){
        this.nome = nome;
        this.email = email;
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
