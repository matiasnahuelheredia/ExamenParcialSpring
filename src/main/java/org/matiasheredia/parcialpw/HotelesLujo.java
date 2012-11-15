package org.matiasheredia.parcialpw;

public class HotelesLujo extends Hoteles implements IHoteles {
private boolean gold;
private String cifras;
public boolean isGold() {
	return gold;
}
public void setGold(boolean gold) {
	this.gold = gold;
}
public String getCifras() {
	return cifras;
}
public void setCifras(String cifras) {
	this.cifras = cifras;
}

public boolean checkSum(String cifras)
{
return true;	
}
public HotelesLujo() {
	super();
}
}
