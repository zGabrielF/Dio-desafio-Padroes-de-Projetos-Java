package PadroesProjeto.Strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }

    @Override
    public void pular() {
        System.out.println("Pulando agressivamente...");
    }

    @Override
    public void correr() {
        System.out.println("Correndo agressivamente");
    }
}