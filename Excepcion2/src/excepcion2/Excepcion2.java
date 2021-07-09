
package excepcion2;

class GenExep
{
void prodExcep() //método de la clase donde se genera la excepción
{
int numero[]=new int[5];
System.out.println("Tratando de acceder a una posición fuera del vector");
numero[7]=0;
}
}


public class Excepcion2 {

    public static void main(String[] args) {
        GenExep objeto =new GenExep();
     try
        {
           objeto.prodExcep();
         }
        catch (Exception excep){// catch donde se resuelve la 
             // excepción que se genera en método prodExcep. 
            System.out.println(excep + " producida en el metodo objeto.prodExcep()");
        }
        {
            System.out.println("Excepción Generada en otro bloque");
           }

    }
    
}
