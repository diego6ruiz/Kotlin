package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesYConstantes()
        //sentenciaIf()
        //sentenciaWhen()
        arrays()

    }


}

private fun variablesYConstantes(){
    //Variables

    var myFirstVariable ="Esta es una prueba"
    var myFirstNumber = 10000
    var mySecondVariable ="Segunda parte de la prueba"
    println(myFirstVariable)
    println(myFirstNumber)
    //var mySecondVariable : String = myFirstVariable
    println(mySecondVariable)

    //Constantes
    val myFirstConstante = "Seguimos con la prueba"
    println(myFirstConstante)

    //Tipos de datos String Enteros Decimales y booleanos
    val myString3 = myFirstVariable + "" + mySecondVariable

    println(myString3)

    //Enteros = Byte -127 +128 short -32768 +32767 Int Long

    val myInt = 100
    val myInt2 = 200
    val myInt3 = myInt + myInt2

    println(myInt3)

    //Decimales float 32 bit Double 64 bit

    val myFloat = 100.5
    val myFloat2 = 199.5
    val myInt10 = 10
    val myFloat3 = myFloat + myFloat2 + myInt

    //Boolean bool

    val myBool = true
    val myBool1 = false

    println(myBool)

}

//Operadores condicionales  < > <= >= == /=
private fun sentenciaIf(){

    val myNumber = 7

    if (myNumber <= 10 && myNumber>5){
        println("$myNumber es menor o igual que 10 y mayor que 5")
    } else {
        println("$myNumber es mayor que 10 o menor o igual que 5")
    }

}

//When
private fun sentenciaWhen(){
    val country = "Francia"

    when(country) {
        "Guatemala" -> {
            println("El idioma es Español")
        }"Nicaragua" -> {
        println("El idioma es Español")
    }"USA" -> {
        println("El idioma es Ingles")
    }else -> {
        println("No conocemos el idioma")
    }
    }

}

fun arrays(){

    val name = "Diego"
    val apellido = "Ruiz"
    val universidad = "Del Valle de Guatemala"
    val ciudad = "Guatemala"

    //crear array

    val myArray:ArrayList<String> = arrayListOf<String>()

    //agregar datos

    myArray.add(name)
    myArray.add(apellido)
    myArray.add(universidad)
    myArray.add(ciudad)

    println(myArray)

    //agregar un conjunto de datos

    myArray.addAll(listOf("prueba UVG", "Uso Array Kotlin"))
    println(myArray)

    //acceso a datos

    val myCompany:String = myArray[2]

    println(myCompany)

    //modificar datos

    myArray[2] = "Solo del Valle"
    print(myArray)

    //eliminar datos

    myArray.removeAt(2)
    println(myArray)

    //recorrer el array

    myArray.forEach{
        println(it)
    }

    myArray.last()


}