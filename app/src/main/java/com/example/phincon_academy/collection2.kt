package com.example.phincon_academy

import kotlin.math.pow

fun main() {
//    val bilBulat = listOf(2,3,4,1,6,7,8)
//    println(bilBulat)
//    val bilBulatBaru = bilBulat.map { it.toDouble().pow(2) }
//    println(bilBulatBaru)

    val hewan = listOf("Ayam", "Sapi", "Kucing", "Kambing", "Angsa", "Anjing")
//    println(hewan.filter { it.startsWith("A") })
//    val hewanX = hewan.filter { it.startsWith("X") }
//    if ( hewanX.isEmpty()){
//        println("tidak ada nama hwan dengan awal X")
//    } else{
//        println("ada")
//    }

//    fun searchHewan(S: String){
//       val hewanCari =  hewan.filter { it.startsWith(S, ignoreCase = true) }
//       if (hewanCari.isEmpty()){
//           println("Tidak ada nama hewan dengan awal $S")
//       } else{
//           hewanCari.forEach { println(it) }
//       }
//    }
//    searchHewan("a")

//    val listOrang = listOf(
//        Orang("Messi", 34, "Cibinong"),
//        Orang("Ronaldo", 38, "Bandung"),
//        Orang("Neymar", 30, "Garut"),
//        Orang("Paes", 24, "Kediri"),
//        Orang("Ridho", 22, "Cibubur"),
//    )
//
//
//    println(listOrang.sortedByDescending { it.usia })
//    println(listOrang.sortedBy { it.usia }.take(3))

    val listProduct = listOf(
        Product("Kulkas", 3000000, "Elektronik"),
        Product("jaket", 200000, "Pakaian"),
        Product("AC", 150000, "Elektronik"),
        Product("Bakso", 20000, "Makanan"),
        Product("Ayam Goreng", 15000, "Makanan"),
        Product("Celana", 220000, "Pakaian")
    )
    println("1. $listProduct")
    val hasilProduct =
        listProduct.filter { it.kategori == "Elektronik" }.sortedBy { it.harga }.take(5)
            .map { it.nama to it.harga }
    println(hasilProduct)
}


data class Orang(val nama: String, val usia: Int, val alamat: String)

data class Product(val nama: String, val harga: Int, val kategori: String)



