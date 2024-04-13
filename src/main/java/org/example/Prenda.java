package org.example;

public class Prenda {
  private TipoPrenda tipo;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipo, Material material, Color colorPrincipal, Color colorSecundario) {
    if (tipo == null) {
      throw new PrendaInvalidaException("El tipo de la prenda es necesario");
    }
    if (material == null) {
      throw new PrendaInvalidaException("El material de la prenda es necesario");
    }
    if (colorPrincipal == null){
      throw new PrendaInvalidaException("El color principal de la prenda es necesario");
    }
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }
}

