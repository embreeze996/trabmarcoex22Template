package TemplateMethodTest;

import TemplateMethod.CandidatoEmpregoAdmDatabase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CandidatoEmpregoAdmDatabaseTest {

    @Test
    void deveRetonarContratado() {
        CandidatoEmpregoAdmDatabase candidatoEmpregoAdmDatabase = new CandidatoEmpregoAdmDatabase();
        candidatoEmpregoAdmDatabase.setTempoExperienciaMercado(4.0f);
        candidatoEmpregoAdmDatabase.setTempoEstagioRealizado(3.0f);
        assertEquals("Contratado", candidatoEmpregoAdmDatabase.verificarContratacao());
    }

    @Test
    void deveRetonarNaoContratado() {
       CandidatoEmpregoAdmDatabase candidatoEmpregoAdmDatabase = new CandidatoEmpregoAdmDatabase();
        candidatoEmpregoAdmDatabase.setTempoExperienciaMercado(2.0f);
        candidatoEmpregoAdmDatabase.setTempoEstagioRealizado(2.0f);
        assertEquals("Entraremos em contato", candidatoEmpregoAdmDatabase.verificarContratacao());
    }

    @Test
    void deveRetornarInformacoes() {
        CandidatoEmpregoAdmDatabase candidatoEmpregoAdmDatabase = new CandidatoEmpregoAdmDatabase();
        candidatoEmpregoAdmDatabase.setTempoExperienciaMercado(5.0f);
        candidatoEmpregoAdmDatabase.setTempoEstagioRealizado(3.0f);
        candidatoEmpregoAdmDatabase.setNome("Ricardo");
        candidatoEmpregoAdmDatabase.setCpf("73299305627");
        assertEquals("Administrador de banco de dados{cpf=73299305627, nome='Ricardo', resultado=Contratado}", candidatoEmpregoAdmDatabase.getInfo());
    }
}
