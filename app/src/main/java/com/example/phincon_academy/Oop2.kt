package com.example.phincon_academy


class Karyawan( val id: String,  val namaKaryawan: String, gajiAwal: Int){

    private var gaji = gajiAwal

    fun getInfomarsi(){
        println("id $id dengan nama $namaKaryawan")
    }

    fun naikGaji(tambahanGaji :Int){
        gaji += tambahanGaji
    }

    fun getGaji() : Int{
        return gaji
    }


}

fun main(){

    val karyawan = Karyawan("if20", "irfan", 5000)

    karyawan.getInfomarsi()
    println(karyawan.getGaji())
    karyawan.naikGaji(3000)
    println(karyawan.getGaji())
}

