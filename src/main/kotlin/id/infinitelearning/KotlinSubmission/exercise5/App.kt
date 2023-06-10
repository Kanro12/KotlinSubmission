package id.infinitelearning.KotlinSubmission.exercise5

import kotlin.Int as Int1

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

    val hero = Hero()

// Mengatur profil hero
    hero.setProfile("John", 25, 180)

// Memanggil fungsi profile untuk menampilkan profil hero
    hero.profile()

// Memanggil fungsi jalan
    hero.jalan()



    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    data class Profile(val name: String, val age: Int1, val height: Int1)

    fun setProfile(name: String, age: Int1, height: kotlin.Int) {
        val profile = Profile(name, age, height)
        println("Data profile berhasil diisi:")
        println("Nama: ${profile.name}")
        println("Umur: ${profile.age} tahun")
        println("Tinggi: ${profile.height} cm")
    }

    fun main() {
        val name = "Kanro" // Kanro
        val age = 21 // 21
        val height = 169 // 169

        setProfile(name, age, height)
    }




    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    data class Profile(val name: String, val age: Int, val height: kotlin.Int)

    fun setProfile(name: String, age: Int, height: Double) {
        val profile = Profile(name, age, height)
        println("Data profile berhasil diisi:")
        println("Nama: ${profile.name}")
        println("Umur: ${profile.age} tahun")
        println("Tinggi: ${profile.height} cm")
    }

    fun getProfile(): Profile {
        val name = "Kanro" // Kanro
        val age = 21 // 21
        val height = 169 // 169

        return Profile(name, age, height)
    }

    fun main() {
        val profile = getProfile()

        println("Data profile sebelum melakukan aktivitas:")
        println("Nama: ${profile.name}")
        println("Umur: ${profile.age} tahun")
        println("Tinggi: ${profile.height} cm")

        // Panggil fungsi-fungsi aktivitas di sini
    }


    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    fun jalan() {
        println("Melakukan aktivitas jalan")
    }

    fun lari() {
        println("Melakukan aktivitas lari")
    }

    fun makan() {
        println("Melakukan aktivitas makan")
    }

    fun minum() {
        println("Melakukan aktivitas minum")
    }

    fun lompat() {
        println("Melakukan aktivitas lompat")
    }

    fun duduk() {
        println("Melakukan aktivitas duduk")
    }

    fun runChallenge(group: Int1) {
        when (group) {
            1 -> {
                repeat(5) { jalan() }
                repeat(2) { lari() }
                repeat(3) { makan() }
                repeat(1) { minum() }
                repeat(3) { lompat() }
                repeat(1) { duduk() }
            }
            2 -> {
                repeat(2) { jalan() }
                repeat(2) { lari() }
                repeat(1) { makan() }
                repeat(3) { minum() }
                repeat(1) { lompat() }
                repeat(2) { duduk() }
            }
            3 -> {
                repeat(3) { jalan() }
                repeat(1) { lari() }
                repeat(5) { makan() }
                repeat(1) { minum() }
                repeat(5) { lompat() }
                repeat(3) { duduk() }
            }
            4 -> {
                repeat(5) { jalan() }
                repeat(4) { lari() }
                repeat(4) { makan() }
                repeat(4) { minum() }
                repeat(3) { lompat() }
                repeat(2) { duduk() }
            }
            5 -> {
                repeat(4) { jalan() }
                repeat(1) { lari() }
                repeat(3) { makan() }
                repeat(5) { minum() }
                repeat(5) { lompat() }
                repeat(3) { duduk() }
            }
            6 -> {
                repeat(2) { jalan() }
                repeat(4) { lari() }
                repeat(2) { makan() }
                repeat(2) { minum() }
                repeat(7) { lompat() }
                repeat(4) { duduk() }
            }
            else -> println("Group tidak valid")
        }
    }

    fun main() {
        val groupNumber = 3 // Ganti dengan nomor group yang ingin dijalankan

        runChallenge(groupNumber)
    }



    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    fun profile(group: Int1) {
        var jalanCount = 0
        var lariCount = 0
        var makanCount = 0
        var minumCount = 0
        var lompatCount = 0
        var dudukCount = 0

        when (group) {
            1 -> {
                repeat(5) { jalanCount++ }
                repeat(2) { lariCount++ }
                repeat(3) { makanCount++ }
                repeat(1) { minumCount++ }
                repeat(3) { lompatCount++ }
                repeat(1) { dudukCount++ }
            }
            2 -> {
                repeat(2) { jalanCount++ }
                repeat(2) { lariCount++ }
                repeat(1) { makanCount++ }
                repeat(3) { minumCount++ }
                repeat(1) { lompatCount++ }
                repeat(2) { dudukCount++ }
            }
            3 -> {
                repeat(3) { jalanCount++ }
                repeat(1) { lariCount++ }
                repeat(5) { makanCount++ }
                repeat(1) { minumCount++ }
                repeat(5) { lompatCount++ }
                repeat(3) { dudukCount++ }
            }
            4 -> {
                repeat(5) { jalanCount++ }
                repeat(4) { lariCount++ }
                repeat(4) { makanCount++ }
                repeat(4) { minumCount++ }
                repeat(3) { lompatCount++ }
                repeat(2) { dudukCount++ }
            }
            5 -> {
                repeat(4) { jalanCount++ }
                repeat(1) { lariCount++ }
                repeat(3) { makanCount++ }
                repeat(5) { minumCount++ }
                repeat(5) { lompatCount++ }
                repeat(3) { dudukCount++ }
            }
            6 -> {
                repeat(2) { jalanCount++ }
                repeat(4) { lariCount++ }
                repeat(2) { makanCount++ }
                repeat(2) { minumCount++ }
                repeat(7) { lompatCount++ }
                repeat(4) { dudukCount++ }
            }
            else -> println("Group tidak valid")
        }

        println("Status terkini:")
        println("Jalan: $jalanCount kali")
        println("Lari: $lariCount kali")
        println("Makan: $makanCount kali")
        println("Minum: $minumCount kali")
        println("Lompat: $lompatCount kali")
        println("Duduk: $dudukCount kali")
    }

    fun main() {
        val groupNumber = 1 // Ganti dengan nomor group yang ingin dijalankan

        runChallenge(groupNumber)
        profile(groupNumber)
    }
    

}