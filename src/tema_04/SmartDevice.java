package tema_04;

public class SmartDevice {
    // atributos

    String marca;
    String modelo;
    String color;
    String sistema_operativo;
    double precio;


    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, String color, String sistema_operativo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.sistema_operativo = sistema_operativo;
        this.precio=precio;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", sistema_operativo='" + sistema_operativo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
