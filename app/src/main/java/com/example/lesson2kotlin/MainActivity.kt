package com.example.lesson2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson2kotlin.extension.loadImage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

      private  var  listPicture = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addPicture()
        sumbitPicture()
        randomPicure()

    }

    private fun randomPicure() {
    btn_sumbit.setOnClickListener {
     iv_url_image.loadImage(listPicture.random())
    }
    }

    private fun sumbitPicture() {
   btn_sumbit.setOnClickListener {
       listPicture.add(et_url.text.toString())
   }

    }

    private fun addPicture() {
 listPicture.add("https://bit.ly/3sEC9ZG")
  listPicture.add("https://bit.ly/38asKPW")
  listPicture.add("https://bit.ly/3zahEql")
  listPicture.add("https://bit.ly/3yeGeEV")
  listPicture.add("shorturl.at/chkyL")
    }
}

