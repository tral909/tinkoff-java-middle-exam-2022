package task4

// какая-то попытка решения задачи, но тесты на сайте тинька не проходят...
fun main() {
    val n = readLine()!!.toInt()
    val playlist = mutableListOf<ArrayList<Int>>()
    repeat(n) {
        readLine()!!
        playlist.add(readLine()!!.split(" ").map { it.toInt() } as ArrayList<Int>)
    }

    for (i in 0 until n) {
        val max = playlist[i].withIndex().maxByOrNull { it.value }!!
        val length = playlist[i].size
        var nod: Int
        if (length > 1) {
            nod = calcNod(max.value, playlist[i][1])
        } else {
            break
        }
        val tmp2 = playlist[i][0]
        playlist[i][0] = playlist[i][max.index]
        playlist[i][max.index] = tmp2
        for (j in 1 until length - 1) {
            var idxToSwap = j
            for (k in j until length - 1) {
                val tmpNod = calcNod(max.value, playlist[i][k])
                if (nod < tmpNod) {
                    nod = tmpNod
                    idxToSwap = k
                    println("idxToSwap $idxToSwap")
                }
            }
            val tmp = playlist[i][j]
            playlist[i][j] = playlist[i][idxToSwap]
            playlist[i][idxToSwap] = tmp
            if (j < length - 1) {
                nod = calcNod(nod, playlist[i][j + 1])
            }
        }
    }
    for (p in playlist)
        println(p)
}

fun calcNod(n1: Int, n2: Int): Int {
    var a = n1
    var b = n2
    while (a != b) {
        if (a > b) {
            a -= b
        } else {
            b -= a
        }
    }
    return a
}