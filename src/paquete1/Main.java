package paquete1;

import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		Bebida cocacola = new Bebida("Cocacola", 2.3f, LocalDate.of(2027, 3, 12), "", true, false, "220cc");
		Comida manzana = new Comida("Manzana", 1.2f, LocalDate.of(2024, 4, 10), "", true, 2.0f, true, LocalDate.of(2024, 4, 8));
		
//		cocacola.verificarOferta();
		cocacola.detalle_producto();

//		manzana.verificarOferta();
		manzana.detalle_producto();
		
	}

}
