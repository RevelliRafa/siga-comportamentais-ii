package siga;

import java.time.LocalDate;

public abstract class DocumentoAcademico {

    // O método-template (final) garante que o rito NUNCA seja alterado ou invertido
    public final String emitir(Aluno aluno) {
        validar(aluno);
        
        StringBuilder documento = new StringBuilder();
        documento.append(cabecalho());
        documento.append(corpo(aluno));
        documento.append(rodape());
        
        registrarEmissao(aluno);
        
        return documento.toString();
    }

    // Passos invariantes implementados na base
    private void validar(Aluno aluno) {
        if (!aluno.isRegular()) {
            throw new IllegalStateException("Aluno irregular: " + aluno.getMatricula());
        }
    }

    private String cabecalho() {
        return "FATEC DE PORTO FERREIRA\nSistema de Gestao Academica\n---\n";
    }

    private String rodape() {
        StringBuilder footer = new StringBuilder();
        footer.append("\n---\nEmitido em ").append(LocalDate.now());
        
        // Aplicação do gancho (hook)
        if (exigeAssinatura()) {
            footer.append("\nAssinado digitalmente pela secretaria academica.");
        }
        return footer.toString();
    }

    private void registrarEmissao(Aluno aluno) {
        LogAcademico.registrar(getTipoLog(), aluno);
    }

    // Gancho (Hook) com comportamento padrão 'true'
    protected boolean exigeAssinatura() {
        return true;
    }

    // Passos abstratos que cada documento específico deve prover
    protected abstract String corpo(Aluno aluno);
    protected abstract String getTipoLog();
}