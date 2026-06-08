package com.LlanquihueTour.utils.exceptions;



/**
 * Creamos la clase "RutInvalidoException"
 *  con un extends para llamar la excepción
 *  personalizada.
 */
public class RutInvalidoException extends Exception {

    public RutInvalidoException(String mensaje){
        super(mensaje);
    }
}
