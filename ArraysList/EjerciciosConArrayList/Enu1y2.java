import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

/**
 * Write a description of class Enu1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enu1y2
{
    // instance variables - replace the example below with your own
    ArrayList<String>misColores;
    ArrayList<String>misColoresCopia;
    ArrayList<String>arrayMezclado;
    int orden[];
    /**
     * Constructor for objects of class Enu1
     */
    public Enu1y2()
    {
        // initialise instance variables
        misColores=new ArrayList<>();
        misColoresCopia=new ArrayList<>();
        arrayMezclado=new ArrayList<>();
        orden=new int [3];

        misColores.add("Rojo");
        misColores.add("Amarillo");
        misColores.add("Verde");

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void imprimirColeccion()
    {
        // put your code here
        for( String colorcito : misColores){

            System.out.print(colorcito + ", ");

        }

    }

    /**
     * 2. Escriba un programa Java para iterar a través de todos los elementos
     *    en un ArrayList.   
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void imprimirColeccionIterator()
    {
        // put your code here
        Iterator<String> it = misColores.iterator();

        while( it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void imprimirColeccionCopiaIterator()
    {
        // put your code here
        copiaDeArray();
        System.out.println(" System.out.println(it.next());amos a imprimir la copia de la copia de la primera coleccion, llamandola internamente");
        Iterator<String> it = misColoresCopia.iterator();

        while( it.hasNext()){
            System.out.println(it.next());
        }
    }

    /**
     * 3. Escriba un programa Java para insertar un elemento en un ArrayList 
     *    en la primera posición.  
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void insertarEnPrimeraPosición() 
    {

        Scanner sc=new Scanner (System.in);
        System.out.print("Insertamos elemento en primera posición");
        misColores.add(0, sc.nextLine());

    }  

    /**
     * 4. Escriba un programa Java para recuperar 
     * un elemento (en un índice especificado) de ArrayList dado.  
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String recuperaElemento() 
    {

        Scanner sc=new Scanner (System.in);
        System.out.print("recuperar un elemento en un índice especificado");
        return misColores.get(sc.nextInt());

    }  

    /**
    6. Escriba un programa Java para eliminar el tercer elemento de ArrayList.   
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void eliminar3elemento() 
    {

        System.out.print("Vamos a eliminar el tercerelemento.");
        misColores.remove(2);

    }  

    /**
    8. Escriba un programa Java para ordenar  un ArrayList .

     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void ordenarColeccion() 
    {

        Collections.sort(misColores);

    }  

    /**   9. Escriba un programa Java para copiar un ArrayList en otro. 
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void copiaDeArray() 
    {
        misColoresCopia=new ArrayList();
        for(String colorcillo : misColores){

            misColoresCopia.add(colorcillo);

        }

    }  

    /**    10. Escriba un programa Java para mezclar elementos en un ArrayList. 
     * 
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void mezclaDeElementosDeArray() 
    {

        for(int i=0; i<3; i++)

        {

            orden[i]=(int)Math.random()*3;

        }

        for(int i=0; i<=orden.length-1; i++)
        {
            arrayMezclado.add(orden[i],misColores.get(i));

        }
        /*vamos a imprimir por si acaso*/

        for(String mezclita : arrayMezclado)
        {
            System.out.println(mezclita);
        }
        
        /*borro el arrayMezclado, se me incluye sucesivamente, debería crear otro método*/
        
    } 
    
        /**    11. Escriba un programa Java para invertir elementos en un ArrayList. 
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void invertirElementosDeArray() 
    {
        
       Collections.reverse(misColores);
 
    }
}
