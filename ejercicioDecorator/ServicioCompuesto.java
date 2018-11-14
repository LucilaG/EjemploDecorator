package ejercicioDecorator;

public abstract class ServicioCompuesto extends Servicio {
	Servicio s;
	protected double adicional;

	public ServicioCompuesto(String nombre, double monto, Servicio s, double adicional) {
		super(nombre, monto);
		this.s = s;
		this.adicional = adicional;
	}
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public abstract double calcular(int dias);
}
