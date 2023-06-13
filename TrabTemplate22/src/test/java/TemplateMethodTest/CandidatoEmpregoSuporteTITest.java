package TemplateMethodTest;

import TemplateMethod.CandidatoEmpregoSuporteTI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CandidatoEmpregoSuporteTITest {

    @Test
        void deveRetornarContratado() {
        CandidatoEmpregoSuporteTI candidatoEmpregoSuporteTI = new CandidatoEmpregoSuporteTI();
        candidatoEmpregoSuporteTI.setTempoExperienciaMercado(2.0f);
        candidatoEmpregoSuporteTI.setTempoEstagioRealizado(1.0f);
        assertEquals("Contratado", candidatoEmpregoSuporteTI.verificarContratacao());
    }

    @Test
    void deveRetornarNaoContratado() {
        CandidatoEmpregoSuporteTI candidatoEmpregoSuporteTI = new CandidatoEmpregoSuporteTI();
       candidatoEmpregoSuporteTI.setTempoExperienciaMercado(0.0f);
       candidatoEmpregoSuporteTI.setTempoEstagioRealizado(1.0f);
        assertEquals("Entraremos em contato", candidatoEmpregoSuporteTI.verificarContratacao());
    }

    @Test
    void deveRetornarInformacoes() {
        CandidatoEmpregoSuporteTI candidatoEmpregoSuporteTI = new CandidatoEmpregoSuporteTI();
        candidatoEmpregoSuporteTI.setTempoExperienciaMercado(4.0f);
        candidatoEmpregoSuporteTI.setTempoEstagioRealizado(2.0f);
        candidatoEmpregoSuporteTI.setNome("Douglas");
        candidatoEmpregoSuporteTI.setCpf("17455999834");
        assertEquals("Candidato{cpf=17455999834, nome='Douglas', resultado=Contratado}", candidatoEmpregoSuporteTI.getInfo());
    }
}