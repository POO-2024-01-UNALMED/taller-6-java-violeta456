package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	static int numAutomoviles;
	public Automovil(String placa,String nombre, long precio, int peso, Fabricante fabricante,int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=puestos;
		numAutomoviles++;
	}
	
	
	public int getPuestos() {
		return this.puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos=puestos;
	}

}
