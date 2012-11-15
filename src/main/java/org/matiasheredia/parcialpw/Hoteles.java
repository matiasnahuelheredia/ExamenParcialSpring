package org.matiasheredia.parcialpw;

public abstract class Hoteles implements IHoteles {
 private String nombre;
 private String Apellido;
 public Hoteles() {
	super();
}
private int cantCamas;
 private int tiempoEstimado;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
public int getCantCamas() {
	return cantCamas;
}
public void setCantCamas(int cantCamas) {
	this.cantCamas = cantCamas;
}
public int getTiempoEstimado() {
	return tiempoEstimado;
}
public void setTiempoEstimado(int tiempoEstimado) {
	this.tiempoEstimado = tiempoEstimado;
}
	
}
