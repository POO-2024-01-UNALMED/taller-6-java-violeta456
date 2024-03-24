package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima; 
	private String nombre;
	private long precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;
	
	private static ArrayList<Pais> listadoPaises=new ArrayList<Pais>();
	private static ArrayList<Fabricante> listadoFabricantes=new ArrayList<Fabricante>();
	
	
	public Vehiculo(String placa, int puertas,int velocidadMaxima, String nombre, long precio, int peso, String traccion, Fabricante fabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima= velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		listadoPaises.add(this.fabricante.getPais());
		listadoFabricantes.add(this.fabricante);
		CantidadVehiculos++;
	}
	
	public static String vehiculosPorTipo(){
		return "Automoviles: "+Automovil.numAutomoviles+"\n"+
				"Camionetas: "+Camioneta.numCamionetas+"\n"+
				"Camiones: "+Camion.numCamiones;			
	}
	
	public static ArrayList<Fabricante> getListadoFabricantes(){
		return listadoFabricantes;
	}
	
	public static ArrayList<Pais> getListadoPaises(){
		return listadoPaises;
	}
	
	
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	public static void setCantidadVehiculos(int CantidadVehiculos) {
		Vehiculo.CantidadVehiculos=CantidadVehiculos;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas=puertas;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public long getPrecio() {
		return this.precio;
	}
	public void setPrecio(long precio) {
		this.precio=precio;
	}
	
	public int getPeso() {
		return this.peso;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion=traccion;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
	}
}
