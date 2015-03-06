package Singleton;

public class Programa {
public static void main(String[] args) {
	FabricaDeCarro ford = FabricaDeCarro.getInstancia();
	ford.setNome("FORD LTDA");
	//FabricaDeCarro ford2 = new FabricaDeCarro();
	System.out.println(ford.getNome());
}
}
