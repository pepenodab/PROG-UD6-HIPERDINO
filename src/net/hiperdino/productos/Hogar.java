package net.hiperdino.productos;

public class Hogar extends Producto{
  private String color;
  private Float peso;

  public Hogar(String nombre, float precio, String color, Float peso) {
    super(nombre, precio);
    this.color = color;
    this.peso = peso;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Float getPeso() {
    return peso;
  }

  public void setPeso(Float peso) {
    this.peso = peso;
  }
  

}
