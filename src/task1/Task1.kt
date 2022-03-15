package task1

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val n = input[0]
    val m = input[1]
    var count = 0
    var restSymbols = ""
    if (n == m) {
        count = n
    } else if (n > m) {
        count = m
        restSymbols = "X".repeat(n - m)
    } else {
        count = n
        restSymbols = "Y".repeat(m - n)
    }
    var result = ""
    repeat(count) {
        result += "XY"
    }
    result += restSymbols
    println(result)
}