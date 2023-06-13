package TemplateMethod;

public class CandidatoEmpregoSuporteTI extends CandidatoEmprego {

    public String verificarContratacao() {
        if (this.calcularExperienciaTotal() >= 2.0f) {
            return "Contratado";
        }
        else {
            return "Entraremos em contato";
        }
    }

}
