
public class Concatenacion {

    public static void main(String args[]) {
        var usuario = "Manuel";
        var titulo = "Arquitecto";

        var union = usuario + " " + titulo;
        System.out.println(union);
        
        var number1 = 3;
        var number2 = 4;
        
        System.out.println(number1 + number2);
        System.out.println(number1 + number2 + usuario);
        System.out.println(usuario + number1 + number2);
        System.out.println(usuario + (number1 + number2));
    }
}
