
import java.util.Scanner;
public class datosCuenta {

    private String name;
    private double saldo;

    private double retirar;

    public void cuenta (String name, double saldo){
        this.name=name;
        if(saldo>0.0){
            this.saldo=saldo;
        }
    }
    public void depositar (double montoDeposito){
        if(montoDeposito>0.0){
            this.saldo=saldo+montoDeposito;
        }
    }

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public void montoRetirar(double retirar) {

    }

   public void menu(){

        Scanner entra = new Scanner(System.in);
       System.out.println("saldo: "+getsaldo()+" nombre: "+ getName());
       System.out.println("""
                elige opcion a realizar:
                1.-depositar:
                2.-retirar""");
       int opcion= entra.nextInt();
       switch (opcion) {

           case 1 -> {
               System.out.println("escriba el monto a depositar");
               double montoDeposito = entra.nextDouble();
               System.out.println("sumando al " +  " saldo de la cuenta " + montoDeposito);
               depositar(montoDeposito);
               System.out.println("saldo: " +getsaldo());
           }

           case 2 -> {
               System.out.println("monto a retirar");
               double retirar = entra.nextDouble();
               double total = getsaldo() - retirar;
               System.out.println("saldo total:" + total);

           }
       }
    }


    public double getsaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



