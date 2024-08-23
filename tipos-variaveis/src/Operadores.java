/**
 * Operadores
 */
public class Operadores {

    public static void main(String[] args) {
        int a, b;
        a = 6;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso"; //Ternario

        System.out.println(resultado);

        String numeroUm = "Dayana";
        String numeroDois = new String("Dayana");

        System.out.println(numeroUm.equals(numeroDois));
    }
}