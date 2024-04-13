package org.example;

public enum TipoPrenda {
  ZAPATO(Categoria.CALZADO),
  CAMISA(Categoria.PARTESUPERIOR);
  private Categoria categoria;
  TipoPrenda(Categoria categoria){
    this.categoria = categoria;
  }


}
