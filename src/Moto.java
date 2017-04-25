public class Moto {
	// atributos
	String marca;
	String modelo;
	String cor;
	int marcha;
	int marchatot;
	boolean Status;
	String On;

	Moto() {

	}

	Moto(int marchaMax) {
		marcha = marchaMax;
	}

	// metodos

	void inicializaMarcha(int marchaIn) {
		marcha = marchaIn;

	}

	void inicializaMarchaTot(int marchaTotIn) {

		marchatot = marchaTotIn;
	}

	int ShiftUp() {
		if (marcha < marchatot) {
			marcha++;
			System.out.println("Marcha: " + marcha);
		} else {
			System.out.println("Limite de marchas atingido.");

		}
		return marcha;
	}

	int ShifDown() {
		if (marcha > 0) {
			marcha--;
			System.out.println("Marcha: " + marcha);
		} else {
			System.out.println("Marcha Minima Atingida ");

		}
		return marcha;
	}
	
	String status() {
		if (marcha > 0) {
			Status = true;
			On = "Ligada";
		}else{
			Status = false;
			On = "Desligada";
		}
		return On;
	}

}
