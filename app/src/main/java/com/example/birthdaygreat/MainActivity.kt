package com.example.birthdaygreat

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { // onCreate : executed when activity first created in the lifecycle
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {

        //val name = nameInput.editableText.toString()
        //Toast.makeText(this, "Name : $name", Toast.LENGTH_LONG).show()   //toast : to show message

        val name = nameInput.editableText.toString()
        val intent = Intent(this, BirthdayGreatingActivity::class.java)
        intent.putExtra(BirthdayGreatingActivity.NAME_EXTRA, name)
        startActivity(intent)

    }

}