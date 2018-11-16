package com.example.user.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    chkbxage.setOnClickListener() {
      if (chkbxage.isChecked == true) {
        chkbxvio.setVisibility(View.VISIBLE);
        chkbxlang.setVisibility(View.VISIBLE);
      } else {
        chkbxvio.setVisibility(View.INVISIBLE);
        chkbxlang.setVisibility(View.INVISIBLE);
      }
    }

    MyButton.setOnClickListener() {

      if (name.text.toString().isEmpty() == true)
      {
        name.setError("required")
      }
      if (desc.text.toString().isEmpty() == true)
      {
        desc.setError("required")
      }
      if (rd.text.toString().isEmpty() == true)
      {
        rd.setError("required")
      }


      val name = findViewById<EditText>(R.id.name)
      val desc = findViewById<EditText>(R.id.desc)
      val rd = findViewById<EditText>(R.id.rd)
      //var cb = findViewById<EditText>(R.id.)
      var movielang = "";
      var suitableAges = "";
      var yesornah = "";

      if (chkbxage.isChecked == true){
        yesornah = "Not suitable for everyone == true"
      }

      if (chkbxvio.isChecked == true){
        suitableAges = " Reason: Violent"
      }

      if (chkbxlang.isChecked == true){
        suitableAges = " Reason: language"
      }

      if (chkbxlang.isChecked == true && chkbxvio.isChecked == true){
        suitableAges = " Reason:  violence and language "
      }

      if (chkbxage.isChecked == false){
        suitableAges = ""
      }


      if (rbtneng.isChecked == true) {
        movielang = "english"
      }
      if (rbtnchi.isChecked == true) {
        movielang = "chinese"
      }
      if (rbtnmal.isChecked == true) {
        movielang = "Malay"
      }
      if (rbtntam.isChecked == true) {
        movielang = "Tamil"
      }


      Toast.makeText(
        this,
        "Title: " + name.text + "\n" + "Description: " + desc.text + "\n" + "Release Date: " + rd.text + "\n" + "Language: " + movielang + "\n" + yesornah  + suitableAges,
        Toast.LENGTH_LONG
      ).show();

    }
  }
}







