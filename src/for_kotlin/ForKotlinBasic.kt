fun main() {
    //tính giai thừa
    var gt = 1
    var n = 0 //kotlin tự nhận biết giá trị và xét kiểu của biến
    println("Nhập n")
    print("Bạn nhập: ")
    val s = readLine()
    println()
    if (s != null) {
        n = s.toInt()
    }
    for (i in 1..n)
    {
        gt *= i
    }
    println("Giai thừa từ 1 đến $n là: $gt")
}