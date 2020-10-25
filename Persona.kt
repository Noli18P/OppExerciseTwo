package Dos

class Persona(name: String, age: Int, sex: String, weight: Double, height: Double) {
    private var name: String = name
    private var age: Int = age
    private var ife: String = "12345634"
    private var sex: String = sex
    private var weight: Double = weight
    private var height: Double = height


    internal fun calcularImc(): Int{
        println("-1 = Peso ideal \n 0 = Bajo \n 1 = Sobrepeso")
        var imc = this.weight / (this.height * this.height)
        var valor = 0
        if (imc < 20) {
            valor = -1
            println("Tienes tu peso ideal")
        }
        if (imc >= 20 && imc <= 25) {
            valor = 0
            println("Estas por debajo de tu peso ideal")
        }
        if (imc > 25) {
            valor = 1
            println("Tienes sobrepeso")
        }
        return valor
    }

    internal fun esMayor(): Boolean {
        if (this.age >= 18) {
            println("Eres mayor")
            return true
        } else {
            println("NO eres mayor")
            return false
        }
    }

    internal fun comprobarSex(letra: String) {
        if (letra.equals(this.sex)) {
            this.sex = this.sex
        } else {
            this.sex = "H"
        }
    }

    internal fun printData() {
        println("\nName: ${this.name} Age: ${this.age} IFE: ${this.ife}")
        println("Sex: ${this.sex} Weight: ${this.weight} Height: ${this.height}")
    }

    internal fun setName(name: String) {
        this.name = name
    }

    internal fun setAge(age: Int) {
        this.age = age
    }

    internal fun setSex(sex: String) {
        this.sex = sex
    }

    internal fun setWeight(weight: Double) {
        this.weight = weight
    }

    internal fun setHeight(height: Double) {
        this.height = height
    }
}
