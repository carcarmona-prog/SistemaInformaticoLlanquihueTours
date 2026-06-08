package com.LlanquihueTour.model.clientesRegistrados;

import com.LlanquihueTour.model.empleadosRegistrados.Empleado;
import com.LlanquihueTour.model.identidad.Rut;

  /**
   * En esta clase vamos a crear los atributos de los clientes
  */

public class Cliente extends Empleado {
    private String nombre;
    private Rut rut;
    private String email;
    private String telefono;



    /**
     *  Generamos un constructor con todos los atributos.
     * @param nombre: nombre del cliente.
     * @param rut: rut del cliente.
     * @param email: correo electrónico.
     * @param telefono: numero de contacto.
     */
    public Cliente(String nombre, Rut rut, String email, String telefono) {
        this.nombre = nombre;
        this.rut = rut;
        this.email = email;
        this.telefono = telefono;
    }


      /**
       * Generamos un toString para su correcta lectura de datos en la línea de comando.
       */
      @Override
      public String toString() {
          return "Cliente{" +
                  "nombre='" + nombre + '\'' +
                  ", rut=" + rut +
                  ", email='" + email + '\'' +
                  ", telefono='" + telefono + '\'' +
                  '}';
      }
  }

