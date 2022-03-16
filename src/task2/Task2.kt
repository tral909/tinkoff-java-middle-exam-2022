package task2

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val n = input[0]
    val k = input[1]
    val secSchema = readLine()!!
    var jumpIndex = 0
    var delta = 1
    var result = "YES"
    while (jumpIndex < n - 1) {
        if (secSchema[jumpIndex + delta] != '1') {
            while (delta <= k) {
                if (secSchema[jumpIndex + delta] == '1') {
                    jumpIndex += delta
                    break
                }
                delta++
            }
        }
        jumpIndex++
        if (delta > k) {
            result = "NO"
            break
        }
        delta = 1
    }
    println(result)
}