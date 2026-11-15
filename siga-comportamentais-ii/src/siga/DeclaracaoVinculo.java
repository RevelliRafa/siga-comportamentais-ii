package siga;

public class DeclaracaoVinculo extends DocumentoAcademico {

    @Override
    protected String corpo(Aluno aluno) {
        // Se a formatação original for diferente, basta copiar a String daqui para baixo
        return "DECLARACAO DE VINCULO\n" +
               aluno.getNome() +
               "\nMatricula: " + aluno.getMatricula();
    }

    @Override
    protected String getTipoLog() {
        return "VINCULO";
    }
}