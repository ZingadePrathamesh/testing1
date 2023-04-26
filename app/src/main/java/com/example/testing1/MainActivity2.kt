package com.example.testing1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bookTitleTextView: TextView = findViewById(R.id.book_title_textview)
        val bookDescriptionTextView: TextView = findViewById(R.id.book_description)

        var descriptionOfBooks = mutableListOf<String>(getString(R.string.rich_dad_poor_dad_description),getString(R.string.atomic_habits_description),getString(R.string.epic_shit_book_description),getString(R.string.five_am_club_description) )
        var titleOfBook = mutableListOf<String>("Rich Dad Poor Dad", "Atomic Habits", "Do Epic Shit", "5 AM CLUB")
        var bundle: Bundle? = intent.extras
        val key = bundle?.get("1") as Int

        var bookTitle = titleOfBook[key]
        var bookDescription = descriptionOfBooks[key]

        bookTitleTextView.setText(bookTitle)
        bookDescriptionTextView.setText(bookDescription)

        Toast.makeText(this, bookTitle, Toast.LENGTH_LONG).show()
    }
}