package com.example.birthdaygreat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greating.*

class BirthdayGreatingActivity : AppCompatActivity() {

    companion object {    //like static variable
        const val NAME_EXTRA = "name_extra"   //const will make it constant
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greating)

        val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreating.text = "Happy Birthday\n$name!"
    }
}