package com.example.phincon_academy

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime

enum class Hari {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
data class Mahasiswa(val nama: String?, val nim: String?, val jurusan: String?)

object configApp{
    var bahasa = "indonesia"
    var tema = "light"
    var env = "prod"

    fun gantiBahasa(bahasaBaru: String){
        bahasa = bahasaBaru
        println(bahasa)
    }

    fun gantiTema(temaBaru: String){
        tema = temaBaru
        println(tema)
    }

    fun gantiTipe(tipeBaru: String){
        env = tipeBaru
        println(env)
    }
}

fun main() {

    println("bahasa")
    println(configApp.bahasa)
    configApp.gantiBahasa("inggris")
    println("tema")
    println(configApp.tema)
    configApp.gantiTema("dark")
    println("tipe")
    println(configApp.env)
    configApp.gantiTipe("dev")


//    val mahasiswa = Mahasiswa("irfan", "1907", null)
//    println(mahasiswa.copy("oki","192002","iief"))
//    println( mahasiswa.copy("iki").nama)
//    println(mahasiswa.nama)
//
//    println(mahasiswa.nama)
//    println(mahasiswa.jurusan)


//    val hari = LocalDateTime.now().dayOfWeek.toString().uppercase()
//
//    val enumHari = try {
//        Hari.valueOf(hari)
//    } catch (e: IllegalArgumentException) {
//        null
//    }
//    println(hari)
//    val result = when (enumHari) {
//        Hari.MONDAY -> "hari kerja"
//        Hari.TUESDAY -> "hari kerja"
//        Hari.WEDNESDAY -> "hari kerja"
//        Hari.THURSDAY -> "hari kerja"
//        Hari.FRIDAY -> "hari kerja"
//        Hari.SATURDAY -> "hari libur"
//        Hari.SUNDAY -> "hari libur"
//        else -> {
//            "hari tidak ditemukan"
//        }
//    }
//
//    println(result)

}

