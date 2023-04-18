fun main() {
    var countP = 0;
    var countI = 0;
    val array: Array<Int> = arrayOf(2, 30, 3, 5, 7, 8, 9, 10, 4, 44, 55, 70)
    for (indice in array) {
        if (indice % 2 == 0) {
            countP++
            println("$indice é par")
        } else {
            countI++
            println("$indice é impar")
        }
    }
    println("De ${array.size} elementos temos $countP numeros pares")
    println("De ${array.size} elementos temos $countI numeros impares")
}