package ejercicioDecorator;

public abstract class Servicio {
	private String nombre;
	protected double monto;

	public Servicio(String nombre, double monto) {
		this.setNombre(nombre);
		this.setMonto(monto);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public abstract double calcular(int dias);
}
