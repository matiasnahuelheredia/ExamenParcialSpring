package org.matiasheredia.parcialpw;

public class HotelesEconomicos extends Hoteles implements IHoteles{

private int Estrellas;
private boolean servicioHabitacion;
public int getEstrellas() {
	return Estrellas;
}
public HotelesEconomicos() {
	super();
}
public void setEstrellas(int estrellas) {
	Estrellas = estrellas;
}
public boolean isServicioHabitacion() {
	return servicioHabitacion;
}
public void setServicioHabitacion(boolean servicioHabitacion) {
	this.servicioHabitacion = servicioHabitacion;
}


}
