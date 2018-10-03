package uricer.edu.br.a2018_splash

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_rosario.setOnClickListener {
            img_back.setBackgroundResource(R.drawable.rosario)
        }
        btn_esfaqueador.setOnClickListener {
            img_back.setBackgroundResource(R.drawable.esaqueador)
        }
        btn_amoeba.setOnClickListener {
            img_back.setBackgroundResource(R.drawable.amoeba)
        }
        btn_sair.setOnClickListener {
            finish()
        }
    }
}
