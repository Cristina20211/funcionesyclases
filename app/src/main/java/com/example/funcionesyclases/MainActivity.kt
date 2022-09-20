package com.example.funcionesyclases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrays()
    }

    fun arrays(){
        val nombre= "Cristina"
        val apellido= "Rodriguez"
        val departamento= "Chalatenango"
        val edad ="22"

        // crear arreglo


        val miArreglo = arrayListOf<String>()


        // agregar los datos (anadir)

        miArreglo.add(nombre)
        miArreglo.add(apellido)
        miArreglo.add(departamento)
        miArreglo.add(edad)

        println(miArreglo)


        //miArreglo conjnto de datos

        miArreglo.addAll(listOf("Estudiante","Programacion IV"))

        println(miArreglo)

        //acceso a datos

        var miDepart =miArreglo[2]
        println (miDepart)
        println(miArreglo[5])


      //modificar

        miArreglo[0]="Beatriz"
        println(miArreglo[0])


        // eliminar datos

        miArreglo.removeAt(2)
        println(miArreglo)

        miArreglo.forEach {

            println(it)
        }


        //otros operaciones

        println (miArreglo.count())
        miArreglo.clear()
        println(miArreglo.count())


    }



    //seguridad contra nulos(null sufety)
    fun seguridadNula(){

        var miString:String ="Programacion IV 13/09/2022"

        // println = null: Esto daria error de compilacion

        println(miString)

        //variable, seguridad nula(null saety)

        var  miSeguridadNula:String?= "valor de seguridad nula"
        miSeguridadNula = null
        println(miSeguridadNula)



        miSeguridadNula="le volvemos a dar valor"

        if(miSeguridadNula != null) {
            println(miSeguridadNula.toString()!!)

        }else {

            println(miSeguridadNula.toString()!!)
        }

        println (miSeguridadNula?.length)
        miSeguridadNula.let{
            println(it.toString())
        }?:kotlin.run{}
        //continua






// funcion simple
        fun decirHola(){
            println("hola inge")


        }


// funcion
        fun decirNombre(nombre:String){
            println( "hola tu nombre es $nombre")



        }

        fun decirNombreyEdad(nombre:String,edad:Int){
            println( "hola tu nombre es $nombre y tu edad es $edad anos")

        }

fun sumarDosNum( num1: Int, num2:Int):Int{

    val suma=num1+num2
    return suma

}

        fun funciones (){

            decirHola()
             decirHola()
             decirHola()

            decirNombre("Manuel")
            decirNombre("alex")


            decirNombreyEdad("Cristina", 12 )
          //  sumarDosNum()
        }



        fun clases(){
            val persona1= Estudiante( "Kemberly",88 , arrayOf( Estudiante.lengua.JAVA,Estudiante.lengua.PYTHON) )
            println (persona1.nombre)
            persona1.edad=22
            println(persona1.codigo())

            val persona2= Estudiante("keiry",20, arrayOf( Estudiante.lengua.JAVASCRIPT), arrayOf(persona1))
            println(persona2.codigo())



            println("${persona2.amigo?.first()?.nombre}es amigo de ${persona2.nombre}")
        }




    }

}