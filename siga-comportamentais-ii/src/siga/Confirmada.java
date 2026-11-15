package siga;

public class Confirmada implements EstadoMatricula {
    @Override
    public void trancar(Matricula m) {
        m.setSituacao(new Trancada());
    }
    @Override
    public void cancelar(Matricula m) {
        m.setSituacao(new Cancelada());
    }
    @Override
    public void concluir(Matricula m) {
        m.setSituacao(new Concluida());
    }
    @Override
    public String getNome() {
        return "CONFIRMADA";
    }
}