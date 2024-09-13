package com.example.phincon_academy

open class BentukGeometri {
    open fun hitungLuas() {

    }

    open fun hitungKeliling() {

    }
}

class Persegi(val sisi: Int) : BentukGeometri() {
    override fun hitungLuas() {
        println(sisi * sisi)
    }

    override fun hitungKeliling() {

        println(4 * sisi)
    }
}

class Lingkaran(val jari: Int) : BentukGeometri() {
    override fun hitungLuas() {
        println(Math.PI * jari * jari)
    }

    override fun hitungKeliling() {
        println(Math.PI * 2 * jari)
    }
}


class Segitiga(val alas: Int, val tinggi: Int, val sisi: Int) : BentukGeometri() {
    override fun hitungLuas() {
        println(alas * tinggi / 2)
    }

    override fun hitungKeliling() {
        println((2 * sisi) + alas)
    }
}


fun main() {
    val persegi = Persegi(3)
    println("persegi")
    persegi.hitungLuas()
    persegi.hitungKeliling()

    val lingkaran = Lingkaran(4)
    println("lingkaran")
    lingkaran.hitungLuas()
    lingkaran.hitungKeliling()

    val segitiga = Segitiga(3, 4, 5)
    println("segitiga")
    segitiga.hitungLuas()
    segitiga.hitungKeliling()
}