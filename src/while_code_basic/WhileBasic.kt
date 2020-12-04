package while_code_basic

fun main() {
    //khai báo
    var n : Int = 0
    var s : String?
    //nhập
    println("Nhập vào số muốn kiểm tra số nguyên tố")
    //thực hiện lặp
    while (true) {
        print("Bạn nhập: ")
        s = readLine()
        if (s != null)
            n = s.toInt()
        var dem : Int = 0
        for (i in 1..n)
        {
            if (n % i ==0)
            dem++
        }
        if (dem == 2)
            println("$n là số nguyên tố")
        else
            println("$n không là số nguyên tố")
        println()
        print("Có tiếp tục không (c/k)?: ")
        s = readLine()
        if (s == "k")
            break;
    }
    println("BYE")
}