package code;

public class Cliente {
	protected String ci;
	protected String nombre;
	protected String direccion;
	protected String telefono;
	protected Double patrimonio;
	protected String nroNit;
	
	public Cliente(String ci, String nombre, String direccion, String telefono, String nroNit){
		this.ci = ci;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nroNit = nroNit;
	}
	
	public void mostrarCliente(Cliente cliente){
		System.out.println("\nDatos del cliente:");
		System.out.println("\tCI: " + cliente.ci );
		System.out.println("\tNombre: " + cliente.nombre );
		System.out.println("\tDireccion: " + cliente.direccion );
		System.out.println("\tTelefono: " + cliente.telefono );
		System.out.println("\tNIT: " + cliente.nroNit );		
	}
	
	public void declararPatrimonio(Double patrimonio){
		this.patrimonio = patrimonio;
	}
}
