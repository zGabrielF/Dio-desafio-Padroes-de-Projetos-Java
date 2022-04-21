package PadroesProjeto.Strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }

    @Override
    public void pular() {
        System.out.println("Pulando normalmente...");
    }

    @Override
    public void correr() {
        System.out.println("Correndo normalmente...");
    }

}