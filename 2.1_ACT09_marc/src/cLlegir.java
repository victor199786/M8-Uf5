import java.io.*;
/**
 * Aquesta classe realitza la interpretació de les dades 
 * obtingudes a partir del que ha introduit l'usuari
 *
 * @author VICTOR
 * @version DAW-M5-UF2
 */
public class cLlegir
{
     /**
     * Mètode que permet controlar excepcio
     *
     * 
     * @return String - Retorna cadena 
     */
  public static String dato()
  {
    String sdato = "";
    try
    {
      // Definir un flujo de caracteres de entrada: flujoE
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader flujoE = new BufferedReader(isr);
      // Leer. La entrada finaliza al pulsar la tecla Entrar
      sdato = flujoE.readLine();
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return sdato; // devolver el dato tecleado
  }
  
  /**
     * Mètode que permet controlar excepcio
     *
     * 
     * @return int short - Retorna valor mes petit
     */
  public static short datoShort()
  {
    try
    {
      return Short.parseShort(dato());
    }
    catch(NumberFormatException e)
    {
      return Short.MIN_VALUE; // valor mas pequeño
    }
  }
  
  /**
     * Mètode que permet controlar excepcio
     *
     * 
     * @return int - Retorna valor mes petit
     */
  public static int datoInt()
  {
    try
    {
      return Integer.parseInt(dato());
    }
    catch(NumberFormatException e)
    {
      return Integer.MIN_VALUE; // valor m�s peque�o
    }
  }
  /**
     * Mètode que permet controlar excepcio
     *
     * 
     * @return int long- Retorna valor mes petit
     */
  public static long datoLong()
  {
    try
    {
      return Long.parseLong(dato());
    }
    catch(NumberFormatException e)
    {
      return Long.MIN_VALUE; // valor m�s peque�o
    }
  }
  /**
     * Mètode que permet controlar excepcio
     *
     * 
     * @return float - Retorna valor float, no es un numero
     */
  public static float datoFloat()
  {
    try
    {
      Float f = new Float(dato());
      return f.floatValue();
    }
    catch(NumberFormatException e)
    {
      return Float.NaN; // No es un N�mero; valor float.
    }
  }
  /**
     * Mètode que permet controlar excepcio
     *
     * 
     * @return double - Retorna valor mes petit
     */

  public static double datoDouble()
  {
    try
    {
      Double d = new Double(dato());
      return d.doubleValue();
    }
    catch(NumberFormatException e)
    {
      return Double.NaN; // No es un N�mero; valor double.
    }
  }
} //cLlegir
