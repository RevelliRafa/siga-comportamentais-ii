package siga;

public interface EstadoMatricula {
    
    default void confirmar(Matricula m) {
        throw new IllegalStateException("Nao e possivel confirmar uma matricula " + getNome());
    }
    
    default void trancar(Matricula m) {
        throw new IllegalStateException("Nao e possivel trancar uma matricula " + getNome());
    }
    
    default void cancelar(Matricula m) {
        throw new IllegalStateException("Nao e possivel cancelar uma matricula " + getNome());
    }
    
    default void concluir(Matricula m) {
        throw new IllegalStateException("Nao e possivel concluir uma matricula " + getNome());
    }

    String getNome();
}