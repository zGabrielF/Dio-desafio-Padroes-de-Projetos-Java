package PadroesProjeto.Strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }

    @Override
    public void pular() {
        System.out.println("Pulando defensivamente...");
    }

    @Override
    public void correr() {
        System.out.println("Correndo defensivamente...");
    }
}