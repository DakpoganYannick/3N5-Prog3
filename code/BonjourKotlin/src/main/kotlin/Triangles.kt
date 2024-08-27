package org.dakpogan

fun main() {


    fun  triangle(hauteur : Int) : String
    {
        var stringtriangle = ""

        for (i in 1..hauteur)
        {
            val nbCaractere = "*".repeat(i)

            stringtriangle += "\n" + nbCaractere


        }

        return stringtriangle


    }

    println(triangle(4))
    println(triangle(8))
    println(triangle(10))
    println(triangle(100))








}