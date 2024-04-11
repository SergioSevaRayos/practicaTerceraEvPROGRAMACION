package paquete1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Comida extends Producto{
	// Atributos
	private boolean perecedero;
	private float calorias;
	private boolean vegano;
	private LocalDate fecha_envase;
	
	// Constructor
	public Comida(String nombre, float precio, LocalDate fecha_caducidad, String estado, boolean perecederos, float calorias, boolean vegano, LocalDate fecha_envase) {
		super(nombre, precio, fecha_caducidad, estado);
		this.perecedero = perecederos;
		this.calorias = calorias;
		this.vegano = vegano;
		this.fecha_envase = fecha_envase;
	}
	public String vegano() {
		
		if (vegano) {
			String vegan;
			return vegan = "Si";
		}else {
			String vegan;
			return vegan = "No";
		}

	}
	// Implementación de métodos abstractos
	 @Override
	    public LocalDate obtener_caducidad() {
	        if (perecedero) {
	            return fecha_envase.plusDays(10) ;
	        } else {
	            return fecha_caducidad;
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
		System.out.println("   \uD83C\uDF4C " + "Detalles del producto \uD83C\uDF4C  \n"
						 + "|══════════════════════════════|\n"
						 + " - Nombre:       " + nombre + "\n"
						 + " - Precio:       " + precio + "\n"
						 + " - Caducidad:    " + obtener_caducidad() + "\n"
						 + " - Estado:       " + estado + "\n"
						 + " - Perecedero:   " + perecedero + "\n"
						 + " - Calrías:      " + calorias + "\n"
						 + " - Vegano:       " + vegano() + "\n"
						 + " - Fecha envase: " + fecha_envase + "\n"
						 + " - Oferta: " + verificarOferta());
		System.out.println(lineaInferior);
		
	}
	@Override
	public String verificarOferta() {
		return super.verificarOferta();
	}
	
	public static void main(String[] args) {

	}

}