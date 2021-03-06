
import code.Cliente;
import code.Producto;
import code.Venta;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("538730", "Ana Rios", "Calle 25 de Mayo 56", "456974", "538730");
		Cliente cliente2 = new Cliente("663873", "Pedro Mendez", "Calle Uruguay 47", "456974", "663873");
		
		Producto producto1 = new Producto("LAVA VAJILLAS OLA 500 ML", 12.5);
		Producto producto2 = new Producto("CERA DE PISO LORITO 20ML", 10.5);
		Producto producto3 = new Producto("DETERGENTE OMO 50GR", 3.0);
		
		ArrayList<Producto> detalleProductos = new ArrayList<Producto>();
		
		detalleProductos.add(producto1);
		detalleProductos.add(producto2);		
		Venta venta1 = new Venta(java.util.Calendar.getInstance().getTime(), cliente1, detalleProductos, 7.0);
		
		detalleProductos.clear();
		detalleProductos.add(producto2);
		detalleProductos.add(producto3);
		Venta venta2 = new Venta(java.util.Calendar.getInstance().getTime(), cliente2, detalleProductos, 5.5);
		
		detalleProductos.clear();
		detalleProductos.add(producto1);
		detalleProductos.add(producto2);
		detalleProductos.add(producto3);
		Venta venta3 = new Venta(java.util.Calendar.getInstance().getTime(), cliente1, detalleProductos, 3.0);	
				
		venta1.imprimirFactura();
		venta2.imprimirFactura();
		venta3.imprimirFactura();				
	}
}
