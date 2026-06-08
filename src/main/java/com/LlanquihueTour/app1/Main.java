package com.LlanquihueTour.app1;


import com.LlanquihueTour.utils.exceptions.RutInvalidoException;
import com.LlanquihueTour.model.clientesRegistrados.Cliente;
import com.LlanquihueTour.model.direccion.Direccion;
import com.LlanquihueTour.model.empleadosRegistrados.Empleado;
import com.LlanquihueTour.model.identidad.Rut;
import com.LlanquihueTour.model.proveedoresRegistrados.Provedores;

public class Main {
    /**
     * Creamos el metodo principal donde se inicializa el programa,
     * se ejecuta al iniciar el programa y permite
     * recibir argumentos desde la línea de comando.
     */
    public static void main(String[] args) {


        //creamos la validación de ruts
        Rut rutValido1 = new Rut();
        try{
            rutValido1.setNumero("28027202-5");
        }catch(RutInvalidoException e){
            throw new RuntimeException(e);
        }
        Rut rutValido2 = new Rut();
        try{
            rutValido2.setNumero("19241452-k");
        }catch(RutInvalidoException e){
            throw new RuntimeException(e);
        }
        Rut rutValidoEmpleado1 = new Rut();
        try{
            rutValidoEmpleado1.setNumero("14254526-1");
        }catch(RutInvalidoException e){
            throw new RuntimeException(e);
        }
        Rut rutValidoProveedor1 = new Rut();
        try{
            rutValidoProveedor1.setNumero("79452652-4");
        }catch(RutInvalidoException e){
            throw new RuntimeException(e);
        }



        //creamos las direcciones de los proveedores.
        Direccion direccionEmpleado1 = new Direccion("calle berlin", "santiago", "Region metropolitana");
        Direccion direccionProveedor1 = new Direccion("calle almendra", "Providencia", "region metropolitana");


       Cliente cliente1 = new Cliente("Carlos Ramirez", rutValido1, "car123@gmail.com", "+56 9 7894 7854");
       Cliente cliente2 = new Cliente("Adriana Gutierrez", rutValido2, "adriana12@gmail.com", "+56 9 4561 4587");


       // creamos a un empleado
       Empleado empleado1 = new Empleado("Pedro Miller", "Guia", rutValidoEmpleado1, direccionEmpleado1, "pedromiller3@gmail.com","+56 9 4587 7458" );

       //creamos un Proveedor
        Provedores proveedores1 = new Provedores("Folletos Larys Spa","Vendedores", rutValidoProveedor1, direccionProveedor1, "folletoscool@gmail.com","+56 9 4587 4332" );


        // Realizamos la simulación en la consola del IDE.

        System.out.println("==== INICIO ====");

        System.out.println("Datos Clientes:");
        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("-----------");
        System.out.println("Datos Empleados:");
        System.out.println(empleado1);

        System.out.println("------------");
        System.out.println(" Datos Provedores:");
        System.out.println(proveedores1);

        System.out.println("------------");
        System.out.println("==== FIN ====");


    }
}
