
public class Imprimir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moto mt = new Moto(1);
		mt.marca = "Honda";
		mt.modelo = "H200";
		mt.cor = "Preto";
		mt.inicializaMarchaTot(3);
		System.out.println("Marca: " + mt.marca);
		System.out.println("Modelo: " + mt.modelo);
		System.out.println("Cor: " + mt.cor);
		System.out.println("Marcha Maxima: " + mt.marchatot);
		System.out.println("Staus: " + mt.status());
		mt.ShiftUp();
		mt.ShiftUp();
		mt.ShiftUp();
		System.out.println("---------");
		mt.ShifDown();
		mt.ShifDown();
		mt.ShifDown();
		System.out.println("Staus: " + mt.status());
	}
	

}
