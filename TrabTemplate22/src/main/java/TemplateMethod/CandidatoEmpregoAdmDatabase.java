package TemplateMethod;

public class CandidatoEmpregoAdmDatabase extends CandidatoEmprego {

    public String verificarContratacao() {
        if (this.calcularExperienciaTotal() >= 5.0f) {
            return "Contratado";
        }
        else {
            return "Entraremos em contato";
        }
    }
    @Override
    public String getTipo() {
        return "Administrador de banco de dados";
    }
}
