package Dos

fun main() {
    var name: String?
    var age: Int = 0
    var sex: String?
    var weight: Double = 0.00
    var height: Double = 0.00

    println("Ingresa tu nombre: ")
    name = readLine().toString() as String
    println("Dime tu edad: ")
    age = readLine()?.toInt() as Int
    println("Dime tu sexo: (H/M)")
    sex = readLine().toString() as String
    println("Dime tu peso: ")
    weight = readLine()?.toDouble() as Double
    println("Dime tu estatura: ")
    height = readLine()?.toDouble() as Double

    val personaUno = Persona(name,age,sex,weight, height)
    personaUno.calcularImc()
    personaUno.esMayor()
    personaUno.printData()

    val personaDos = Persona(name,age,sex,96.0,height)
    personaDos.calcularImc()
    personaDos.esMayor()
    personaDos.printData()

    val personaTres = Persona(name,age,sex,weight,height)
    personaTres.setName("Maria Felix")
    personaTres.setAge(40)
    personaTres.setSex("M")
    personaTres.setWeight(70.5)
    personaTres.setHeight(1.40)

    personaTres.calcularImc()
    personaTres.esMayor()
    personaTres.printData()

}
