package tierraMedia;

public class Porcentual extends Promociones {
	private final int PORCENTAJE;


	public Porcentual(Atracciones[] pack, String nombre, int porcentaje, TiposAtracciones tipo) {
		super(pack, nombre, tipo);
		this.PORCENTAJE = porcentaje;
	}
	
	@Override
    public double getCosto() {
        double costoSinPromo = 0;
        for (Atracciones atraccion : this.pack) {
            costoSinPromo += atraccion.getCosto();
        }
        double descuento = (this.PORCENTAJE / 100) * costoSinPromo;
        costoPromocion =  costoSinPromo - descuento;
        return costoPromocion;
    }

}
