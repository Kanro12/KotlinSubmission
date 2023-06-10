package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    fun divideNumbers(a: Int, b: Int): Int {
        return try {
            a / b
        } catch (e: ArithmeticException) {
            println("Terjadi kesalahan: ${e.message}")
            0
        }
    }

    fun main() {
        val number1 = 10
        val number2 = 0

        val result = divideNumbers(number1, number2)
        println("Hasil pembagian: $result")
    }



}