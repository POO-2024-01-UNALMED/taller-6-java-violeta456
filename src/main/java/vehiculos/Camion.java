package vehiculos;

public class Camion extends Vehiculo{
	int ejes;
	static int numCamiones;
	
	public Camion(String placa, String nombre, long precio, int peso,Fabricante fabricante,int ejes) {
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes=ejes;
		numCamiones++;
	}
	
	
	public int getEjes() {
		return this.ejes;
	}
	public void setEjes(int ejes) {
		this.ejes=ejes;
	}

}
