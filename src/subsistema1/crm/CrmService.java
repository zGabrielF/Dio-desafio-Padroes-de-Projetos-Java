package subsistema1.crm;

public class CrmService {
    private CrmService(){
        super();
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM");
        System.out.println("### informações do cliente ###");
        System.out.println("nome= "+nome+"\ncep= "+cep+"\ncidade= "+cidade+"\nestado= "+estado);
    }
}
