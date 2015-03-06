package Singleton;

public class FabricaDeCarro {
	private static FabricaDeCarro instancia = null;
	protected FabricaDeCarro() {
	//existe apenas para anular a instanciação;	
	}
	public static FabricaDeCarro getInstancia() {
		if(instancia == null) {
			instancia = new FabricaDeCarro();
		}
		return instancia;
	}
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
