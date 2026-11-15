package siga;

public class AtestadoFrequencia extends DocumentoAcademico {

    @Override
    protected String corpo(Aluno aluno) {
        // Usamos apenas os métodos que realmente existem na classe Aluno
        return "ATESTADO DE FREQUENCIA\n" +
               aluno.getNome() +
               "\nMatricula: " + aluno.getMatricula() +
               "\nStatus: " + (aluno.isRegular() ? "Frequencia Regular" : "Frequencia Irregular");
    }

    @Override
    protected String getTipoLog() {
        return "FREQUENCIA";
    }

    @Override
    protected boolean exigeAssinatura() {
        return false;
    }
}