package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    val firstName: String = "Kanro"
    val lastName: String = "Tarigan"
    val age: Int = 30
    val isSingle: Boolean = true

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age")
    println("Status: ${if (isSingle) "Single" else "Non-Single"}")
}

fun main () {
    myProfile()
}



/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")

    return arrayOf(groupId, groupMember, session)
}

fun main() {
    val groupMembers = listOf("Anggota 1", "Anggota 2", "Anggota 3")
    groupDetail(1, groupMembers, "Morning")
}


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String {
    val groupMembers = listOf("Kanro", "Delima Sembiring", "Dian Putri", "Aulia", "Annisa Laila Rahmawati") // Daftar Nama Anggota Grup(Kanro, Delima Sembiring, Dian Putri, Aulia, Annisa Laila Rahmawati)
    val myName = groupMembers[0] // Asumsikan nama Anda berada di indeks 0
    return "myName"
}
// Memanggil fungsi myGroup
val myName = myGroup()
println("Nama saya: $myName")

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val countOfGroup = 5

    return mentor.size + countOfGroup
}

fun main() {
    myProfile()

    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")
}


    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    fun groupDetail(groupNumber: Int, members: List<String>, activity: String) {
        println("Group $groupNumber: Anggota Grup - ${members.joinToString(", ")}, Aktivitas - $activity")
    }

    fun main() {
        val groupNumber = 1
        val members = listOf("Anggota Kanro", "Anggota Delima Sembiring", "Anggota Dian Putri", "Anggota Aulia", "Anggota Annisa Laila Rahmawati")
        val activity = "Afternoon"

        groupDetail(groupNumber, members, activity)
    }

}