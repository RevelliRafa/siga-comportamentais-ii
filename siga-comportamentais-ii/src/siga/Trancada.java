package siga;

public class Trancada implements EstadoMatricula {
    @Override
    public void confirmar(Matricula m) {
        m.setSituacao(new Confirmada());
    }
    @Override
    public void cancelar(Matricula m) {
        m.setSituacao(new Cancelada());
    }
    @Override
    public String getNome() {
        return "TRANCADA";
    }
}
