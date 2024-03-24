package vehiculos;

import java.util.ArrayList;
import java.util.Collections;


public class Pais {
	private String nombre;

	
	public Pais(String nombre) {
		this.nombre=nombre;
	}
	
	
	public static Pais paisMasVendedor() {
		ArrayList<Pais> listado = Vehiculo.getListadoPaises();
		int cantidadMaxima=0;
		Pais paisMasVendedor=null;
		
		while(listado.size()!=0) {
			int cantidad=Collections.frequency(listado, listado.get(0));
			
			if (cantidad>cantidadMaxima) {
				cantidadMaxima=cantidad;
				paisMasVendedor=listado.get(0);
			}
			
			for (int i=0;i<cantidad;i++) {
				listado.remove(listado.get(0));
			}
		}
		
		return paisMasVendedor;	
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

}
