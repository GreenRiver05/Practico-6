package Practico6_DirectorioTelefonico;

public class Cliente {

    String dni;  
    String nombre;
    String apellido;
    String ciudad;
    String direccion;

//    public Cliente(int dni, String nombre, String apellido, String ciudad, String direccion) {
//        this.dni = dni;
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.ciudad = ciudad;
//        this.direccion = direccion;
//    }

    public Cliente() {  //eliminamos los constructores ya que no los necesito
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    
    @Override
    public String toString() {
        return "Clientes{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }

    
    
 }

    
