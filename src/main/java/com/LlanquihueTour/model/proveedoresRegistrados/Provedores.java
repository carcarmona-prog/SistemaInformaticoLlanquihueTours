package com.LlanquihueTour.model.proveedoresRegistrados;

import com.LlanquihueTour.model.direccion.Direccion;
import com.LlanquihueTour.model.empleadosRegistrados.Empleado;
import com.LlanquihueTour.model.identidad.Rut;


/**
 * Creamos la clase "Proveedores".
 * Usamos extends Empleado para traer los atributos de esa clase y usarlos,
 * para la clase donde se alojan los datos de los proveedores
 */
public class Provedores extends Empleado {

    private String nombre;
    private String cargo;
    private Rut rut;
    private Direccion direccion;
    private String email;
    private String telefono;

    /**
     * Constructor vacío.
     */
    public Provedores() {

    }

    /**
     * Generamos el Constructor con todos los atributos de la clase.
     * @param nombre: Nombre del Proveedor.
     * @param cargo: Cargo del Proveedor.
     * @param rut: Rut del Proveedor.
     * @param email: Correo electrónico.
     * @param telefono: Número de contacto.
     */

    public Provedores(String nombre, String cargo, Rut rut, Direccion direccion, String email, String telefono) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }



    /**
     * Generamos el toString.
     *
     */

    @Override
    public String toString() {
        return "Provedores{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", rut=" + rut +
                ", direccion=" + direccion +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
