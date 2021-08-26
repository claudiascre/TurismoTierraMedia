package TierraMedia;

public class Absoluta extends Promociones {
	
	private final int DESCUENTO;
	
	public Absoluta(Atracciones[] pack, String nombre, int descuento) {
		this.pack = pack;
		this.nombre = nombre;
		this.DESCUENTO = descuento;
	}

	
	public int calcularCosto() {
		for (Atracciones atraccion : this.pack) {
			this.costoPromocion += atraccion.getCosto();
		}
		return this.costoPromocion - DESCUENTO;
	}
	
	public int calcularTiempo() {
		for (Atracciones atraccion : this.pack) {
			this.tiempoNecesario += atraccion.getTiempoNecesario();
		}
		return this.tiempoNecesario;
	}

}
