fun main() {
    var checkY : Int = 0
    println("Nhập hiển thị nam hay nữ: ")
    println("Bạn nhập: ")
    val youN : String? = readLine()
    if (youN != null)
       checkY = youN.toInt()
    when(checkY)
    {
       1 -> println("Nam")
        2 -> println("Nữ")
        else -> println("3D")
    }
}