package tabla;

public class suma1n {

    static float numero, resultado;

    public static void suma(float numero) {
        for (float i = 1; i <= numero; i++) {
            resultado = 1 / i;
            System.out.println(resultado);
        }
    }
    
    public static void e(float numero){
        resultado = 1 +numero+(numero/2);
        for (float i = 1; i <= 100; i++) {
            
        }
    }

    public static void main(String[] args) {
        numero = 4;
        suma(numero);
    }
}
