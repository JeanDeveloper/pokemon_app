package com.example.pokemon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var jean: Person = Person(name = "Jean Carlo", passport = "1203jf1")
        var anonimo: Person = Person()
        println(jean.name)
        println(jean.passport)
        println(jean.isLive)
        jean.die()
        println(jean.isLive)


        println(anonimo.name)
        println(anonimo.passport)
        println(anonimo.isLive)
        anonimo.die()
        println(anonimo.isLive)





    }


}