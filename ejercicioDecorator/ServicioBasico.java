package ejercicioDecorator;

public class ServicioBasico extends Servicio{

	public ServicioBasico(String nombre, double monto) {
		super(nombre, monto);
	}
	
	
	public  double calcular(int dias) {
		return this.monto * dias;
	}
}
