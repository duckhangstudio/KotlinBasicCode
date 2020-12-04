fun main() {
    var tuoi : Int = 0
    println("Nhập tuổi")
    print("Bạn  nhập: ")
    val youN = readLine()
    println()
    if ( youN != null)
        tuoi = youN.toInt()
    when(tuoi)
    {
        in 1..5 -> println("Thiếu nhi")
        in 6..9 -> println("Nhi Đồng")
        in 10..16 -> println("Thiếu niên")
        in 17..18 -> println("Thanh thiếu niên")
        else -> println("Già r")
    }
}