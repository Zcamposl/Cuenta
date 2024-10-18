
package cuartoejercicio;

public class CuentaAhorro extends Cuenta{
     protected boolean activa;
    public CuentaAhorro(float saldo,double tasaAnual,boolean activa){
        super(saldo, tasaAnual);
        this.activa = activa;
    }    
    public void imprimir(){
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial = $" + saldo );
        System.out.println("Ingrese tasa de interés = " + tasaAnual);
      
    }
    public void imprimirF(){
        System.out.println("Comision mensual = " + comisionAnual);
        System.out.println("Número de transacciones = "+nTransacciones);
    }
    
}
