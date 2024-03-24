package vehiculos;
import java.util.ArrayList;
import java.util.Collections;


public class Fabricante {
	private String nombre;
	private Pais pais;
	
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
	}
	
	
	
	public static Fabricante fabricaMayorVentas() {
		ArrayList<Fabricante> listado=Vehiculo.getListadoFabricantes();
		int cantidadMaxima=0;
		Fabricante fabricaMayorVentas=null;
		
		while(listado.size()!=0) {
			int cantidad=Collections.frequency(listado, listado.get(0));
			if(cantidad>cantidadMaxima) {
				cantidadMaxima=cantidad;
				fabricaMayorVentas=listado.get(0);
			}
			for(int i=0;i<cantidad;i++) {
				listado.remove(listado.get(0));
			}
		}
		return fabricaMayorVentas;
		
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais=pais;
	}
}
