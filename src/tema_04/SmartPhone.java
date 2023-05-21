package tema_04;

public class SmartPhone extends SmartDevice {
    double pantalla;
    boolean lector_huella;
    double bateria;

    public SmartPhone(){

    }

    public SmartPhone(String marca, String modelo, String color, String sistema_operativo, double precio, double pantalla, boolean lector_huella, double bateria) {
        super(marca, modelo, color, sistema_operativo, precio);
        this.pantalla = pantalla;
        this.lector_huella = lector_huella;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pantalla=" + pantalla +
                ", lector_huella=" + lector_huella +
                ", bateria=" + bateria +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", sistema_operativo='" + sistema_operativo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
