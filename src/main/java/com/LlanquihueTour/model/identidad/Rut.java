package com.LlanquihueTour.model.identidad;

import com.LlanquihueTour.exceptions.RutInvalidoException;

public class Rut {
    /**
     * Creamos un objeto llamado "número"
     * para contener el RUT ingresado.
     */
    private String numero;



    public Rut(String numero) {
        this.numero = numero;
    }

    public Rut() {

    }

    public String getNumero() {
        return numero;
    }

    /**
     *  Creamos un setNumero número donde declaramos arrojar "throws" una excepción que proviene de otra clase,
     * en este caso personalizado
     * @param numero: Clase donde se aloja el número de RUt
     * @throws RutInvalidoException: excepción personalizada para evitar erres de digitación del RUT.
     */
    public void setNumero(String numero) throws RutInvalidoException {
        if (numero == null || !numero.matches("[0-9]+-[0-9kK]")) {
            throw new RutInvalidoException("El rut "+ numero + "Error de formato, debes seguir el patron 12345678-x");
        }
        this.numero = numero;
    }

    /**
     * Generamos el toString.
     *
     */
    @Override
    public String toString() {
        return "Rut{" + "numero=" + numero + '}';
    }


}
