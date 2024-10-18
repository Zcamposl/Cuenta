package cuartoejercicio;

public class CuartoEjercicio {

    public static void main(String[] args) {
        CuentaAhorro cuenta1 = new CuentaAhorro(100000, 0.10, true);
        cuenta1.imprimir();
        cuenta1.consignar(50000);
        cuenta1.retirar(70000);
        cuenta1.calcularInteres();
        cuenta1.imprimirF();
        
    }
    
}
