class Contador(private var contador: Int = 0) {
    /**
     * Esta clase representa un ejemplo de un Contador esencial para jugar con prima.
     * Contiene métodos para obtener e incrementar el contador.
     *
     * @param contador Contador que empieza en 0 y va incrementando cada vez que el bombo genere una bola.
     */

    fun incrementar() {
        /**
         * Incrementa el contador cada vez que el bombo genere un número.
         */
        contador++
    }
    fun obtenerContador(): Int {
        /**
         * Devuelve el contador.
         */
        return contador
    }
}
