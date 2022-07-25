public class Main {
    public static void main(String[] args) {
  //      NumeroIf(-2);
    }

    /**
     * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
     * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
     */
    public static void NumeroIf (int num){

        if (num == 0){
            System.out.println("Es igual a 0");
        } else if (num < 0) {
            System.out.println("Es negativo");
        }
        else {
            System.out.println("Es positivo");
        }


    }
}