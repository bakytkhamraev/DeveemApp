package com.example.deveemapp.ui.detail

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.deveemapp.R
import com.example.deveemapp.extensions.loadImage
import com.example.deveemapp.model.ItemModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setData()

        val button = findViewById<TextView>(R.id.call_btn)
        button.setOnClickListener {
            val dial = "tel:" + "+996700413001"
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse(dial)))
        }

        val buttonWA = findViewById<TextView>(R.id.messages)
        buttonWA.setOnClickListener {

            try {
                val mobile = "+996700413001"
                val msg = "Здравствуйте,"
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://api.whatsapp.com/send?phone=$mobile&text=$msg")
                    )
                )
            } catch (e: Exception) {
            }


        }


        val share = findViewById<ImageView>(R.id.share)
        share.setOnClickListener {

            try {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Print Bishkek")
                var shareMessage =
                    "\nПозвольте мне порекомендовать вам это приложение\n\n"
                shareMessage =
                    shareMessage + "https://play.google.com/store/apps/details?id=com.geektech.printbishkek"
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
                startActivity(Intent.createChooser(shareIntent, "Выберите приложение"))
            } catch (e: java.lang.Exception) {
            }

        }


        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            onBackPressed()
        }


        val star = findViewById<ImageView>(R.id.star)
        star.setOnClickListener {
            Toast.makeText(this, "Приветики Криветики!", Toast.LENGTH_SHORT).show()
        }


        val menu = findViewById<ImageView>(R.id.more)
        menu.setOnClickListener {
            Toast.makeText(this, "Меню нерабочий!", Toast.LENGTH_SHORT).show()
        }


    }


    private fun setData() {
        item_name.text = item?.title
        detail_location.text = item?.location
        amount_tv.text = item?.price.toString()
        currency_tv_detail.text = item?.currency
        imageView.loadImage(item?.url.toString())
        desc_detail_tv.text = item?.desc
        eye.text = item?.viewsAmount.toString()
        items_amount_tv.text = item?.itemsAmount.toString()
        update_day.text = item?.updateDay

    }

    companion object {
        var item: ItemModel? = null
        fun instanceDetail(activity: Activity?, id: ItemModel?) {
            val intent = Intent(activity, DetailActivity::class.java)
            activity?.startActivity(intent)
            item = id
        }
    }
}