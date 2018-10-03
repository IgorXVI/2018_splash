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
        var c: ConstraintLayout = layout
        btn_rosario.setOnClickListener {
            var img = BitmapFactory.decodeResource(resources, R.drawable.rosario)
            c.setBackgroundResource(R.drawable.rosario)
        }
        btn_esfaqueador.setOnClickListener {
            var img = BitmapFactory.decodeResource(resources, R.drawable.esfaqueador)

        }
        btn_amoeba.setOnClickListener {
            var img = BitmapFactory.decodeResource(resources, R.drawable.amoeba)

        }
        btn_sair.setOnClickListener {
            finish()
        }
    }
}
