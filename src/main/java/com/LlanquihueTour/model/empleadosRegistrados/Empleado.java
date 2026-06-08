package com.LlanquihueTour.model.empleadosRegistrados;

import com.LlanquihueTour.model.direccion.Direccion;
import com.LlanquihueTour.model.identidad.Rut;

  /**
   * Creamos la clase "Empleado".
   */
      public class Empleado {
      private String nombre;
      private String cargo;
      private Rut rut;
      private Direccion direccion;
      private String email;
      private String telefono;

     /**
     * Constructor vacío.
     */
    public Empleado() {

    }

    /**
     * Generamos el Constructor con todos los atributos de la clase.
     * @param nombre: Nombre del empleado.
     * @param cargo: Cargo del empleado.
     * @param rut: Rut del empleado.
     * @param email: Correo electrónico.
     * @param telefono: Número de contacto.
     */
    public Empleado(String nombre, String cargo, Rut rut, Direccion direccion, String email, String telefono) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * Generamos los Getters and Setters.
     *
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Generamos el toString.
     *
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", rut='" + rut + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
