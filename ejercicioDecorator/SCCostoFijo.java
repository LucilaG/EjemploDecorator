package ejercicioDecorator;

public class SCCostoFijo extends ServicioCompuesto {
	

	public SCCostoFijo(String nombre, double monto, Servicio s, double adicional) {
		super(nombre, monto, s, adicional);
	}

	@Override
	public double calcular(int dias) {
		return this.s.calcular(dias) + adicional * dias;
	}

	

}
