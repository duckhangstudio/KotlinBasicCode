fun main() {
    println("Nhập dữ liệu từ bàn phím")
    //khai báo giá trị
    var a : Double = 0.0
    var b : Double = 0.0
    //bắt đầu nhập dữ liệu
    //xử lý dữ liệu
    println("Nhập a: ")
    var s : String? = readLine()
    if ( s != null)
        a = s.toDouble()
    println("Nhập b: ")
    s = readLine()
    if ( s != null)
        b = s.toDouble()
    // xử lý sự kiện tính phương trình bận nhất
    if ( a == 0.0 && b == 0.0)
        println("Phương trình vô số nghiệm")
    else if ( a == 0.0 && b != 0.0)
        println("Phương trình vô nghiệm")
    else
    {
        var x = (-b/a)
        println("Nghiệm: $x")
    }
}