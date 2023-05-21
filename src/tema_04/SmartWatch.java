package tema_04;

public class SmartWatch extends SmartDevice {

    String correa;
    boolean resistencia_agua;

    public SmartWatch(){

    }

    public SmartWatch(String marca, String modelo, String color, String sistema_operativo, double precio, String correa, boolean resistencia_agua) {
        super(marca, modelo, color, sistema_operativo, precio);
        this.correa = correa;
        this.resistencia_agua = resistencia_agua;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "correa='" + correa + '\'' +
                ", resistencia_agua=" + resistencia_agua +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", sistema_operativo='" + sistema_operativo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
