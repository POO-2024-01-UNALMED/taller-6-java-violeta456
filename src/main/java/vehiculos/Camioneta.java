package vehiculos;

public class Camioneta extends Vehiculo {
	boolean volco;
	static int numCamionetas;
	public Camioneta(String placa, int puertas,String nombre, long precio, int peso, Fabricante fabricante,boolean volco) {
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
		this.volco=volco;
		numCamionetas++;
	}
		
	public boolean isVolco() {
		return this.volco;
	}
	public void setVolvo(boolean volco) {
		this.volco=volco;
	}
}
