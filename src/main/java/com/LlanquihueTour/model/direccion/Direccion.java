package com.LlanquihueTour.model.direccion;

/**
 * Creamos una clase llamada direccion donde se alojan
 * los atributos relacionados al cliente.
 *
 */
public class Direccion {

    private String calle;
    private String ciudad;
    private String region;


    /**
     *  Generamos el constructor para los atributos.
     * @param calle: nombre de la calle.
     * @param ciudad: nombre de la ciudad.
     * @param region: nombre de la region.
     */
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }


    /**
     * Generamos el los get and set de cada atributo
     */
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Generamos el toString para su correcta lectura en consola
     *
     *
     * @return formato legible para la consola.
     */
    @Override
    public String toString() {
        return "Dirección{" +
                "calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}

