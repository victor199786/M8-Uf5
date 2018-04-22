
/**
 * Aquesta classe realitza les operacions bàsiques d'un banc, consultar saldo, mostrar dades, ingresar o extreure
 *
 * @author VICTOR
 * @version DAW-M5-UF2
 */
public class CompteBancari {
    /**
     * Emmagatzema el primer valor del compte bancari
     */
    private String nom;
    /**
     * Emmagatzema el segon valor del compte bancari
     */
    private int numSecret;
    /**
     * Emmagatzema el tercer valor del compte bancari
     */
    private static float saldoInicial = (float) 100;
    /**
     * Emmagatzema el quart valor del compte bancari
     */
    private float saldo;
    /**
     * Constructor 
     * 
     * @param nom(String) Símbol associat al compte bancari que inicialitza el atribut
     * @param numSecret(int) Símbol associat al compte bancari que inicialitza el atribut
     */
    public CompteBancari(String nom, int numSecret) {
        this.nom = nom;
        this.numSecret = numSecret;
        this.saldo = CompteBancari.saldoInicial;
    }
    /**
     * Mètode que permet obtenir el valor de l'atribut valor1.
     *
     * @return int - Retorna el valor de l'atribut valor1
     */
    public String getNom() {
        return this.nom;
    }
    /**
     * Mètode que permet obtenir el valor de l'atribut valor2.
     *
     * @return int - Retorna el valor de l'atribut valor2
     */
    public int getNumSecret() {
        return this.numSecret;
    }
    /**
     * Mètode que permet obtenir el valor de l'atribut valor4.
     *
     * @return int - Retorna el valor de l'atribut valor4
     */
    public float consultarSaldo() {
        return this.saldo;
    }
    /**
     * Mètode que permet obtenir el valor de l'atribut valor3.
     *
     * @return int - Retorna el valor de l'atribut valor3
     */
    public static float getSaldoInicial() {
        return CompteBancari.saldoInicial;
    }
    /**
     * Mètode que permet enviar el valor de l'atribut valor3.
     *
     * @param saldoIncial(float) Símbol associat al compte bancari que assigna valor atribut static 
     */
    public static void setSaldoInicial(float saldoIncial) {
        CompteBancari.saldoInicial = saldoIncial;
    }
    /**
     * Mètode que serveix per mostrar les dades dels objectes de la classe
     * Operacions amb una frase amb sentit.
     *@return String - Retorna cadena concatenada
     */
    public String mostrarDades() {
        return ("El propietari es diu: " + this.nom + " amb número secret: "
                + this.numSecret + ". El saldo actual es: " + this.saldo);
    }
     /**
     * Mètode que permet realitzar ingress en el compte bancari.
     * 
     * @param quantitat(float) Símbol associat al compte bancari que s'ha realitzat.
     * @return Boolean - Retorna resultat del ingres
     */
    public boolean ingressar(float quantitat, CompteBancari compte) {
        boolean resultat = false;
       if(quantitat>compte.getSaldoInicial()){
           resultat= false;
       }
       else{
             this.saldo = this.saldo + quantitat;
             compte.extreure(quantitat);
            resultat = true;
       }
        
        /* if (quantitat >= 0) {
            this.saldo = this.saldo + quantitat;
            resultat = true;
        }*/
        return resultat;
    }
    /**
     * Mètode que permet realitzar extreure del compte bancari.
     * 
     * @param quantitat(float) Símbol associat al compte bancari que s'ha realitzat.
     * @return Boolean - Retorna resultat de extreure
     */
    public boolean extreure(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo - quantitat;
            resultat = true;
        }
        return resultat;
    }
    public void saludo2(){
        System.out.println("SAludo2 A BRANCA MASTER -By VICTOR CAÑERO JIMENEZ");
    }
    public void saludo(){
        System.out.println("Saludos! - By Cristian Torres");
    }
}
