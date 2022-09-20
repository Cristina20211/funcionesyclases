package com.example.funcionesyclases

class Estudiante (val nombre:String, var  edad:Int, val lenguajes:Array<lengua>,val amigo:Array<Estudiante>?=null){


    enum class lengua {

        KOTLIN,
        PHP,
        JAVA,
        JAVASCRIPT,
        PYTHON
    }

    fun codigo(){
        for(lenguaje: lengua in lenguajes){
            println("los lenguajes de programacion que conose son: $lenguajes")

        }

    }

}