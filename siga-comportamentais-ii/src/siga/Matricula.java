package siga;

public class Matricula {

    private final Aluno aluno;
    private final String codigoTurma;
    // O estado inicial passa a ser o objeto da classe PreMatriculada
    private EstadoMatricula situacao = new PreMatriculada();

    public Matricula(Aluno aluno, String codigoTurma) {
        this.aluno = aluno;
        this.codigoTurma = codigoTurma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public String getSituacao() {
        return situacao.getNome();
    }

    // Método que permite aos estados mudarem o contexto
    void setSituacao(EstadoMatricula situacao) {
        this.situacao = situacao;
    }

    // Delegamos o comportamento para o estado atual (sem nenhum "if")
    public void confirmar() {
        situacao.confirmar(this);
    }

    public void trancar() {
        situacao.trancar(this);
    }

    public void cancelar() {
        situacao.cancelar(this);
    }
    
    // Novo método para o estado "Concluida"
    public void concluir() {
        situacao.concluir(this);
    }
}