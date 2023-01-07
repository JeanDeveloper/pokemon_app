package com.example.pokemon

class Person(var name: String = "Anonimo", var passport: String? = null ) {


    fun Person(){
        name  = "Juan"
        passport = "345r3"


    }

    var isLive: Boolean = true

    fun die(){
        isLive = false;
    }


}