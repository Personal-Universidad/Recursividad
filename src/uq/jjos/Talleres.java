package uq.jjos;

public class Talleres {
    public static void main(String[] args) {

        /**
         * Construya un algoritmo que dados dos números enteros,
         * encuentre su cociente mediante restas sucesivas
         */
        int numero1 = 9;
        int numero2 = 2;
        //System.out.println(restasSucesivas(numero1,numero2));

        /**
         * Calcular la suma de 1 + 4 + 9 + 16 + 25 + ... + n²
         */
        //System.out.println(suma(5));

        /**
         * Construir un programa que obtenga todos los caracteres correspondientes a letras minusculas de la 'a' a la 'z' .
         * Texto "LOREM IPsuM dolor sit atmet.\n CANCIONES gtaDDSZP"
         */
        String texto = "LOREM IPsuM dolor sit atmet.\n CANCIONES gtaDDSZP";
        //System.out.println(obtenerMinusculaCadena(texto, 0));
    }

    public static String obtenerMinusculaCadena(String cadena, int pos) {
        if (pos == cadena.length()) {
            return "";
        } else {
            return (esMinuscula(cadena.charAt(pos)) ? String.valueOf(cadena.charAt(pos)) : "") + obtenerMinusculaCadena(cadena, pos + 1);
        }
    }

    public static boolean esMinuscula(char letra) {
        return !Character.isUpperCase(letra);

    }

    public static int suma(int i) {
        if (i == 1) {
            return 1;
        } else {
            return (i * i) + suma(i - 1);
        }
    }


    public static int restasSucesivas(int numero1, int numero2) {
        if (numero1 < numero2) {
            return 0;
        } else {
            return 1 + restasSucesivas(numero1 - numero2, numero2);
        }
    }
}
