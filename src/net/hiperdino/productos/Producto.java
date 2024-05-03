package net.hiperdino.productos;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Producto {
  final protected  ThreadLocalRandom R =ThreadLocalRandom.current();
  protected String nombre;
  protected float precio;
  protected Date fechaCaducidad = new Date(R.nextLong());

  public Producto (String nombre, float precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  } 
  
  public Date getFechaCaducidad() {
    return fechaCaducidad;
  }

  public void setFechaCaducidad(Date fechaCaducidad) {
    this.fechaCaducidad = fechaCaducidad;
  }

}
