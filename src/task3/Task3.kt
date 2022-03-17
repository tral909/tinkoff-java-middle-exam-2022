package task3

fun main() {
    val n = readLine()!!.toInt()
    val times = mutableListOf<List<Int>>()
    repeat(n) {
        times += readLine()!!.split(" ").map { it.toInt() }
    }
    var result = 0
    var i = 0
    while (i <= n - 1) {
        val minTime = times[i].withIndex().minByOrNull { it.value - it.index }!!
        when (minTime.index) {
            0 -> i++
            1 -> i += 2
            2 -> i += 3
        }
        result += minTime.value
    }
    println(result)
}