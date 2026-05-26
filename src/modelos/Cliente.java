package modelos;

public class Cliente extends Persona {

    public Cliente(String nombre, String correo) {

        super(nombre, correo);
    }

    @Override
    public void mostrarDatos() {

        System.out.println("Cliente: " + nombre);
    }
}