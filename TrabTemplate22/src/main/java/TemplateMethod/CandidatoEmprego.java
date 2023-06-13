package TemplateMethod;

public abstract class CandidatoEmprego {

    private String cpf;
    protected String nome;
    private float tempoExperienciaMercado;

    private float tempoEstagioRealizado;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTempoExperienciaMercado() {
        return tempoExperienciaMercado;
    }

    public void setTempoExperienciaMercado(float tempoExperienciaMercado) {
        this.tempoExperienciaMercado= tempoExperienciaMercado;
    }

    public float getTempoEstagioRealizado() {
        return tempoEstagioRealizado;
    }

    public void setTempoEstagioRealizado(float tempoEstagioRealizado) {
        this.tempoEstagioRealizado = tempoEstagioRealizado;
    }

    public float calcularExperienciaTotal() {
        return (this.tempoExperienciaMercado + this.tempoEstagioRealizado);
    }

    public abstract String verificarContratacao();

    public String getTipo() {
        return "Candidato";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "cpf=" + this.cpf +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarContratacao() +
                '}';
    }
}