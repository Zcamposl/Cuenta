package cuartoejercicio;

public class Cuenta {
    
    protected float saldo = 0;
    protected int nConsignaciones = 0;
    protected int nRetiros = 0;
    protected double tasaAnual = 0;
    protected float comisionAnual = 0;
    protected float retirar;
    protected float consignar;
    protected int nTransacciones;
    protected double interes;
    
    public Cuenta(float saldo, double tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }    
    public float consignar (float cantidad){
        consignar = cantidad;
         saldo = (saldo + cantidad);
        nTransacciones++;
         System.out.println("Ingresas catidad a consignar = $" + consignar);
        return consignar;
    }
    public float retirar(float cantidad){
         retirar = cantidad;
        saldo = (saldo - cantidad);
        nTransacciones++;
        System.out.println("Ingrese cantidad a retirar = $" + retirar);
        return retirar;
    }
    
    public void calcularInteres(){
       double interes = saldo * tasaAnual;
        saldo += interes;
        System.out.println("Tasa de interés = " + saldo); 
    }
    public int cantidadTransacciones(){
       nTransacciones = nRetiros + nConsignaciones;
       return nTransacciones;
    }
    
}
