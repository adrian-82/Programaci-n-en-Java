import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
/*14. Escriba un programa Java de intercambio de dos elementos en un ArrayList. falta */
/*20. Escriba un programa Java para aumentar el tamaño de un ArrayList. */                  /*yo creo que es trampa, el tamaño es variable de por sí*/

/**
 * Write a description of class Enu1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enu13
{
    // instance variables - replace the example below with your own
    ArrayList<String>lista1;
    ArrayList<String>lista2;
    ArrayList<String>listaUnida;
    ArrayList<String>lista1Clonada;
    String lista1Limitada[];

    /**
     * Constructor for objects of class Enu1
     */
    public Enu13()
    {
        // initialise instance variables
        lista1=new ArrayList<>();
        lista2=new ArrayList<>();
        listaUnida=new ArrayList<>();
        lista1Clonada=new ArrayList<>();

        lista1.add("Rojo");
        lista1.add("Amarillo");
        lista1.add("Verde");
        lista1.add("Morado");
        lista1.add("Azul");

        lista2.add("Blanco");
        lista2.add("Rojo");
        lista2.add("Verde");
        lista2.add("Amarillo");
        lista2.add("Negro");

    }

    /**
     * 15. Escriba un programa Java para unir dos ArrayList. 
     * 
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void unir2Arrays()
    {

        for(String listilla1 : lista1)
        {

            listaUnida.add(listilla1);

        }

        for(String listilla2 : lista2)
        {

            listaUnida.add(listilla2);

        }

        for(String listilla1_2 : listaUnida)
        {
            System.out.println(listilla1_2);
        }
    }

    /**
     *16. Escriba un programa Java para clonar ArrayList  a otro ArrayList. 
     * 
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void clonarLista1()
    {
        lista1Clonada=(ArrayList<String>)lista1.clone();            /*los parentesis*/

        System.out.println("Vamos a imprimir la lista1 clonada.");
        Iterator it = lista1Clonada.iterator();

        while(it.hasNext()){
            {
                System.out.println(it.next());
            }

        }
    }

    /**
    17. Escriba un programa Java para vaciar un ArrayList. 
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void vaciarLista1()                                            
    {
        lista1.clear();

    }

    /**
    /*18. Escriba un programa Java para probar que un ArrayList está vacía o no. 
     * 
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void probarVacia()                                             
    {

        if(lista1.isEmpty())
        {
            System.out.println("La lista1 no contiene nada.");
        }else
        {
            System.out.println("Merluzo, la lista1 está vacía.");
        }

    }

    /**
    /*19. Escriba un programa Java para recortar el tamaño de un ArrayList al  tamaño de la lista actual.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void darLengh()                                             
    {
        int longitud=lista1.size();

        lista1Limitada=new String[lista1.size()];
        for (int i=0; i<=longitud-1; i++)
        {

            lista1Limitada[i]=lista1.get(i);
            System.out.println(lista1Limitada[i]);
        }

    }

    /**
    /*21. Escriba un programa Java para reemplazar el segundo elemento de una ArrayList con el elemento especificado. 
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void reemp2Elemento()                                             
    {
        Scanner teclado=new Scanner (System.in);

        System.out.println("Vamos a reemplazar el segundo elemento de lista1 con el elemento especificado");
        lista1.set(1, teclado.nextLine());

        Iterator it = lista1.iterator();

        while(it.hasNext()){
            {
                System.out.println(it.next());
            }

        }

    }
    
    /**
    /* 22. Escriba un programa Java para imprimir todos los elementos de una ArrayList 
     *usando la posición de los elementos.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void impriPosicion()                                             
    {
        
        System.out.println(" Vamos a imprimir todos los elementos de lista1 de acuerdo a su posición.");
        for(int i=0; i<=lista1.size()-1; i++)
        {
            System.out.println(lista1.get(i));

        }

    }

}