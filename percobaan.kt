package percobaan
import java.net.*

fun main(args: Array<String>){
	val a: Int = 100000
	println(a === a) // Prints 'true'
	val boxedA: Int? = a
	val anotherBoxedA: Int? = a
	println(boxedA === anotherBoxedA) // !!!Prints 'false'!!!
}