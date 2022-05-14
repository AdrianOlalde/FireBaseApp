package com.example.firebaseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val dataRef = database.reference
/*
        dataRef.child("Usuarios").child("01").setValue(User("Juan", "juan@gmail.com", "juan1234"))
        dataRef.child("Usuarios").child("02").setValue(User("Andres", "andres@gmail.com", "andres1234"))
        dataRef.child("Usuarios").child("03").setValue(User("Guillermo", "guillermo@gmail.com", "guillermo1234"))
        dataRef.child("Usuarios").child("04").setValue(User("Marcos", "marcos@gmail.com", "marcos1234"))
        dataRef.child("Usuarios").child("05").setValue(User("Dario", "dario@gmail.com", "dario1234"))
        dataRef.child("Usuarios").child("06").setValue(User("Evon", "evon@gmail.com", "evon1234"))
        dataRef.child("Usuarios").child("07").setValue(User("Yannis", "yannis@gmail.com", "yannis1234"))

 */
        dataRef.child("Usuarios").get().addOnSuccessListener { response ->
            Log.d("RespuestaBD", response.value.toString())
        }.addOnFailureListener{
            Log.e("RespuestaBD", "Error getting db")
        }
    }
}