package task5

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val h = input[0]
    val w = input[1]
    val n = input[2]
    val samples = mutableListOf<Int>()
    repeat(n) {
        samples += readLine()!!.toInt()
    }
    val playListTracks = Array(h) { w }
    for(sample in samples) {
        var i = 0
        while(i <= h - 1) {
            if (playListTracks[i] >= sample) {
                playListTracks[i] -= sample
                println(i + 1)
                break
            }
            if (i == h - 1) {
                println("-1")
            }
            i++
        }
    }
}