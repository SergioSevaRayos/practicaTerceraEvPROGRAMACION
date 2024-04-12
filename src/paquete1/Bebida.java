package paquete1;

import java.time.LocalDate;

public class Bebida extends Producto {
	// Atributos
	private boolean gaseoso;
	private boolean lacteo;
	private String medida;
	
	// Constructor
	Bebida(String nombre, float precio, LocalDate fecha_caducidad, String estado,boolean gaseoso, boolean lacteo, String medida) {
		super(nombre, precio, fecha_caducidad, estado);
		this.gaseoso = gaseoso;
		this.lacteo = lacteo;
		this.medida = medida;
	}
	
	@Override
    public LocalDate obtener_caducidad() {
	 	
        if (lacteo) {
            return fecha_caducidad.plusDays(10) ;
        } else {
            return fecha_caducidad.plusDays(20);
        }
    }

	@Override
	public void detalle_producto() {
		String lineaSuperior = "╔══════════════════════════════╗";
        String lineaInferior = "╚══════════════════════════════╝";
		this.nombre = nombre;
		this.precio = precio;
		this.fecha_caducidad = fecha_caducidad;
		this.estado = estado;
		System.out.println(lineaSuperior);
		System.out.println("   \uD83C\uDF7A Detalles del producto \uD83C\uDF7A \n"
						 + " |═════════════════════════════|\n"
						 + " - Nombre:     " + nombre + "\n"
						 + " - Precio:     " + descuento() + "\n"
						 + " - Caducidad:  " + obtener_caducidad() + "\n"
						 + " - Estado:     " + estado + "\n"
						 + " - Oferta: " + verificarOferta());
		System.out.println(lineaInferior);
		
	}
	
	@Override
	public String verificarOferta() {
		return super.verificarOferta();
	}
	
	

}