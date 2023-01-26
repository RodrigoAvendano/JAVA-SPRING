public class Inferencia {
    public static void main (String args[])
     {
        var miVariableEntera = 10;
         System.out.println(miVariableEntera+" es de tipo "+((Object)miVariableEntera).getClass().getSimpleName());
         
        var miVariableCadena = "Hola Mundo";
        System.out.println(miVariableCadena+" es de tipo "+((Object)miVariableCadena).getClass().getSimpleName());
        
     }
}


