# Mi Proyecto de Ordenamiento Burbuja (El normal y el mejorado)

Hola. Este es mi código en Java donde aprendí cómo ordenar números usando el algoritmo de la burbuja. Al principio me confundí con los ciclos, pero al final quedó funcionando bien.

---

## ¿Qué hay dentro de este repositorio?

* **Metodoburbuja.java**: El único archivo donde está todo mi código. Aquí puse el metodo principal para probar las cosas y las dos formas de ordenar.

---

## ¿Qué hace este programa?

Tiene dos métodos diferentes para ordenar un grupo de números de menor a mayor:

1. **Burbuja Normal (ordenamientoBurbuja)**: 
   * Compara los números de dos en dos y los va acomodando. 
   * Hace todas las vueltas completas aunque el arreglo ya se haya quedado ordenado desde antes.

2. **Burbuja Mejorada (ordenamientoBurbujaMejorada)**: 
   * Hace lo mismo, pero le puse una banderita (boolean intercambiado). 
   * Si en una vuelta ya no movió ningún número, se da cuenta de que ya quedó ordenado y se sale antes de tiempo para ser más eficiente.

---

## ¿Cómo se corre? (Por si lo quieres probar)

Si quieres ver cómo funciona en tu computadora, abre tu terminal y escribe directamente esto:

javac Metodoburbuja.java
java Metodoburbuja

Listo. En la pantalla te va a salir cómo estaban los números antes y cómo quedan ya ordenados con los dos métodos.
