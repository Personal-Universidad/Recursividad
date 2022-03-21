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

        /**
         *   4. Leer dos vectores A y B, e indicar si el uno está contenido en otro en orden estricto inverso
         *   Ejemplo A= 1,2,3,4,5,7    B=5,4,3   Debe indicar que B está contenido en A. Se sugiere hacer 2 métodos.
         */
        int[] vectorBase = {1,2,3,4,5,7};
        int[] vectorCotenido = {5,4,3};

        //System.out.println(buscarVectorContenido(vectorBase,vectorCotenido, vectorBase.length-1));

        /**
         *  5. Leer un  arreglo de Strings y suprimir todas las consonantes de cada de unas palabras contenidas.
         *  Se sugiere hacer 2 métodos
         */
        String[] arregloStrings = {"juan","jose","ortiz","santa"};
        String [] arregloVocales= new String[arregloStrings.length];
        //suprimirConsonantes(arregloStrings,arregloVocales,0);


        /**
         * 6. Dado un String, crear uno nuevo que contenga primero las vocales y luego las consonantes.
         * Ejemplo: “ensayo”eaonsy
         */

        String vocalesYConsonantes = "ensayo";
        System.out.println(separarVocalesYConsonantes(vocalesYConsonantes,0));
        /**
         * 7. Determine si una matriz es o no simétrica. Una matriz es simétrica si es cuadrada,
         * los elementos por encima de la diagonal son iguales a los elementos por debajo en forma de espejo.
         */
    }

    public static String separarVocalesYConsonantes(String palabra, int pos){
        if(palabra.length() * 2  ==  pos) {
            return "";
        }else {
            String concatenacion = pos + 1 > palabra.length() ?
                    (!esVocal(palabra.charAt(pos - palabra.length())) ? ("" + palabra.charAt(pos - palabra.length())) : "") :
                    (esVocal(palabra.charAt(pos)) ? ("" + palabra.charAt(pos)) : "");
            return  concatenacion + separarVocalesYConsonantes(palabra, pos + 1);
        }
    }

    public static void suprimirConsonantes(String[] arregloStrings,String[] arregloVocales, int pos){
     if(pos == arregloStrings.length) {
         for (int i = 0; i < arregloVocales.length; i++) {
             System.out.println(arregloVocales[i]);
         }
     }else{
         arregloVocales[pos] = formatearArreglo(arregloStrings[pos], 0);
         suprimirConsonantes(arregloStrings, arregloVocales, pos +1);
     }
    }
    public static String formatearArreglo(String cadena, int pos){
        if(cadena.length() == pos) {
            return "";
        }else{
         return  (esVocal(cadena.charAt(pos)) ? (""+ cadena.charAt(pos)): ("")) + formatearArreglo(cadena, pos +1);
        }
    }
    public static boolean esVocal(char letra) {
        String str = "aeiouAEIOU";
        return (str.indexOf(letra) != -1) ? true : false;
    }

    public static String buscarVectorContenido(int[] vectorBase, int[] vectorCotenido, int pos) {
        if(pos == vectorCotenido.length - 2){
            return "El vector B no esta contenido";
        }else {
            if(estaContenido(vectorBase, vectorCotenido , 0, pos, 0)){
                return "El vector A esta contenido en B";
            }else {
                return  buscarVectorContenido(vectorBase, vectorCotenido, pos - 1);
            }
        }
    }
    public static boolean estaContenido(int[] base, int[] contenido, int tamano, int pos, int coincidencias){
        if(tamano == contenido.length ){
            return coincidencias == contenido.length;
        }else {
            if(contenido[tamano] == base [pos]){
                return estaContenido(base,contenido, tamano  + 1, pos - 1, coincidencias +1);
            }else{
                return estaContenido(base,contenido, contenido.length, pos, 0);
            }
        }
    }

    public static String obtenerMinusculaCadena(String cadena, int pos) {
        if (pos == cadena.length()) {
            return "";
        } else {
            return (esMinuscula(cadena.charAt(pos)) ? String.valueOf(cadena.charAt(pos)) : "") + obtenerMinusculaCadena(cadena, pos + 1);
        }
    }
    public static boolean esMinuscula(char letra) {
        return Character.isLetter(letra) && !Character.isUpperCase(letra);
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
