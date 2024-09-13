package com.example.phincon_academy

fun main() {

//    val listDay = mutableListOf("Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday")
//    println(listDay)
//    listDay[6] = "Holiday"
//    println(listDay)
//    listDay.remove("Monday")
//    println(listDay)
//
//
//    val setAngka = mutableSetOf(1,2,3,4,5)
//    println(setAngka)
//    setAngka.addAll(setOf(3,6))
//    println(setAngka)
//    setAngka.remove(1)
//    println(setAngka)
//    println(setAngka.contains(1))


    val listBuah = mutableMapOf("Durian" to 50000, "Anggur" to 40000, "Apel" to 30000)
    println(listBuah)
    listBuah.putAll(mapOf("Jeruk" to 20000, "Pisang" to 15000))
    println(listBuah)
    println(listBuah["Apel"])
    listBuah["pisang"] = 10000
    println(listBuah)
    listBuah.remove("Jeruk")
    println(listBuah)


    val angkaGanjil = generateSequence(seed = 5, nextFunction = {it + 2})

    angkaGanjil.take(3).forEach { println(it) }

    println("----------")
    val fibonnaci = generateSequence(seed = 0 to 1){
        (a,b) -> b to a + b
    }
    fibonnaci.take(5).forEach { println(it) }

}