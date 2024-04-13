package org.example;

public class PrendaInvalidaException extends  RuntimeException{
  PrendaInvalidaException(String causa){
    super("Prenda Invalida: "+causa);
  }
}
