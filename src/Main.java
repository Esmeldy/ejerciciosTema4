public class Main {
    public static void main(String[] args) {
  //      NumeroIf(-2);
  //      bucleWhile();
  //      bucleDoWhile();
  //      bucleFor();
        bucleSwitch();
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

    /**
     * Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
     *
     *    -Incrementar el valor de la variable en uno cada vez que se ejecute.
     *
     *    -Mostrarlo por pantalla cada vez que se ejecute.
     */
    public static void bucleWhile (){
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    /**
     * Para el bucle Do While, deberás crear la misma estructura que en el While,
     * pero solo se debe ejecutar una vez.
     */

    public static void bucleDoWhile () {
        int numeroWhile = 0;
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        while (numeroWhile>3);
    }

    /**
     * Para el bucle For, crea una variable numeroFor,
     * esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
     * se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
     */

    public static void bucleFor (){
        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    /**
     * Por último, para el Switch, deberás crear la variable estacion,
     * y distintos case para las cuatro estaciones del año.
     * Dependiendo del valor de la variable estacion se deberá mandar
     * un mensaje por consola informando de la estación en la que está.
     * También habrá que poner un default para cuando el valor de la variable no sea una estación.
     */

    public static void bucleSwitch () {
        String estacion = "Verano";

        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No existe esa estación");
        }
    }
}