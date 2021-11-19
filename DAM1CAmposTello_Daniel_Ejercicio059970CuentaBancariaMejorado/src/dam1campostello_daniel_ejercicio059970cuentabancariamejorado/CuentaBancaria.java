/*
Ejercicio 05-99-70CuentaBancaria. Run. Completo.
    Diseña una clase denominada CuentaBancaria con los siguientes datos:
    Miembros dato:
    *Nombre del titular, número de cuenta, tipo de interés y saldo.
    Miembros método u operaciones:
    Dos constructores, uno con argumentos y otro por defecto. El constructor con argumentos invocará a unos métodos set que asignen un contenido a
    cada miembro dato. En lugar de llamar a un método setSaldo es preferible que inicialicemos el saldo de la cuenta invocando a un método llamado
    ingreso que reciba la cantidad a ingresar y actualice el saldo anterior.
    Los métodos set y get correspondientes.
    Un método ingreso que actualice el saldo de la cuenta. La cantidad a ingresar tiene que ser mayor que 0.
    Un método reintegro que saque dinero de la cuenta.
    La cantidad a reintegrar tiene que ser mayor que 0.
    Comprobar que si la cantidad a sacar supera el saldo se imprimirá un mensaje de error.
    Implementa la aplicación en dos ficheros fuente: uno para la clase CuentaBancaria, y otro, que contenga el método main, donde instanciaremos un objeto de
    tipo CuentaBancaria con un saldo inicial de 100 euros y le enviaremos los mensajes siguientes :
    Obtener el saldo.
    Sacar 50 euros (reintegro).
    Ingresar 100 euros.
    Volver a obtener el saldo.
 */
package dam1campostello_daniel_ejercicio059970cuentabancariamejorado;

/**
 *
 * @author user
 */
public class CuentaBancaria {

    private String nombreTitular;
    private int nroCuenta;
    private int tipoInteres;
    private int saldo;

    public CuentaBancaria(String nombreTitular, int nroCuenta, int tipoInteres, int saldo) {
        setNombreTitular(nombreTitular);
        setNroCuenta(nroCuenta);
        setTipoInteres(tipoInteres);
        this.saldo = saldo;
    }

    public CuentaBancaria() {
        //constructor por defecto
        nombreTitular = "0";
        nroCuenta = 0;
        tipoInteres = 0;
        saldo = 0;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public int getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(int tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public int getSaldo() {
        return saldo;
    }

    public void ingreso(int ParamIngreso) {//metodo para ingersar saldo
        saldo = getSaldo();
        if (ParamIngreso > 0){
            saldo = saldo + ParamIngreso;
        } else{
            System.out.println("La cantidad a ingresar debe ser mayor a 0.");
        }
        
    }

    public void retirar(int ParamRetirar) {//metodo para retirar saldo
        saldo = getSaldo();
        if (ParamRetirar < saldo){
            saldo = saldo - ParamRetirar;
        } else{
            System.out.println("La cantidad a retirar debe ser inferior a tu saldo.");
           
        }
    }

    @Override
    public String toString() {
        return "Nº cuenta: " + getNroCuenta() + " - nombre del titular: " + getNombreTitular() + " - tipo de Interes: " + getTipoInteres() + "%" + " - saldo actual: " + getSaldo()  + "€";
    }

}
