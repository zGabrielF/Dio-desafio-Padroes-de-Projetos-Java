import PadroesProjeto.Facade.Facade;
import PadroesProjeto.Singleton.SingletonEager;
import PadroesProjeto.Singleton.SingletonLazy;
import PadroesProjeto.Singleton.SingletonLazyHolder;
import PadroesProjeto.Strategy.*;

public class main {
    public static void main(String[] args) {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        System.out.println("## Movimentações do ROBO ###");
        System.out.println();
        System.out.println("Robo Normal");
        robo.setComportamento(normal);
        robo.mover();
        robo.correr();
        robo.pular();
        System.out.println();
        System.out.println("Robo Defensivo");
        robo.setComportamento(defensivo);
        robo.mover();
        robo.correr();
        robo.pular();
        System.out.println();
        System.out.println("Robo Agressivo");
        robo.setComportamento(agressivo);
        robo.mover();
        robo.correr();
        robo.pular();

        // Facade
        System.out.println();
        Facade facade = new Facade();
        facade.migrarCliente("Gabriel", "15025020");
    }
}
