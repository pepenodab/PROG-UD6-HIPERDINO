package net.hiperdino.productos;

public class Higiene extends Producto{

  private boolean incluyeInstrucciones;
  private String duracionApertura;

  public Higiene(String nombre, float precio, boolean incluyeInstrucciones, String duracionApertura) {
    super(nombre, precio);
    this.incluyeInstrucciones = incluyeInstrucciones;
    this.duracionApertura = duracionApertura; 
  }

  public boolean isIncluyeInstrucciones() {
    return incluyeInstrucciones;
  }

  public void setIncluyeInstrucciones(boolean incluyeInstrucciones) {
    this.incluyeInstrucciones = incluyeInstrucciones;
  }

  public String getDuracionApertura() {
    return duracionApertura;
  }

  public void setDuracionApertura(String duracionApertura) {
    this.duracionApertura = duracionApertura;
  }
  
}
