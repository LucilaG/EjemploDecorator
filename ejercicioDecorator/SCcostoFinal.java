package ejercicioDecorator;

public class SCcostoFinal extends ServicioCompuesto {
	private double condicion;

	public SCcostoFinal(String nombre, double monto, Servicio s, double adicional, double condicion) {
		super(nombre, monto, s, adicional);
		this.condicion = condicion;
	}

	@Override
	public double calcular(int dias) {
		double parcial = this.adicional * dias;
		if (parcial <= condicion) {
			return parcial + this.s.calcular(dias);
		} else {
			return this.s.calcular(dias) + condicion;
		}
	}

	public double getCondicion() {
		return condicion;
	}

	public void setCondicion(double condicion) {
		this.condicion = condicion;
	}

}
