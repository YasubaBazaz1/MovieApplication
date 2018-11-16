package com.example.user.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main3)

    var movie = Movieentity(
      "Venom",
      "When Eddie Brock acquires the powers of a symboite, he will have to release his alter-ego Venom to save his life",
      "English",
      "03-10-2018",
      yesorno = "yes"
    )

    rettitle.text = movie.movtitle
    retdes.text = movie.movdesc
    retlang.text = movie.movlang
    retsuit.text = movie.movyes
    retrel.text = movie.movdate
  }
}
