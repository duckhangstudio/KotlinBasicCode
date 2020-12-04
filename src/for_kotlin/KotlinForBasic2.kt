package for_kotlin

fun main() {
        var dsSanPham= arrayOf("kotlin","java","c#","python","R")
    //lấy toàn bộ danh sách mảng
        for ((index,value) in dsSanPham.withIndex())
        {
            println("Sản phẩm thứ $index có tên $value")
        }
    println()
    //lấy ra theo vị trí
    for (i in dsSanPham.indices) {
        println("Sản phẩm thứ 3 có tên " + dsSanPham[3])
    }
}