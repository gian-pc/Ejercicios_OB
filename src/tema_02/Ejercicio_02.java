package tema_02;

public class Ejercicio_02 {
    public static void main(String[] args) {


        double precio = calcular_precio_total(100);
        System.out.println("El precio más 18% IVA en Perú es: " + precio);


    }

    static double calcular_precio_total(double precio) {
        return precio * 1.18;
    }
}
