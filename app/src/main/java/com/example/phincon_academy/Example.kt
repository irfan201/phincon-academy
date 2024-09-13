package com.example.phincon_academy

fun hitungDiskon(harga: Double, diskon: Double): Double {
    return harga - (harga * (diskon / 100))
}

fun main() {
    val hargaBarang = 150000.0

    val diskon =
        when {
            hargaBarang < 50000.0 -> 0.0

            hargaBarang in 50000.0..100000.0 -> 10.0

            hargaBarang > 100000.0 -> 20.0

            else -> return
        }

    val hargaSetelahDiskon = hitungDiskon(hargaBarang, diskon)
    println("Harga setelah diskon: Rp.$hargaSetelahDiskon")

}