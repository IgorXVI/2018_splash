package uricer.edu.br.a2018_splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_splash2.*
import java.util.*

class Splash2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)

        var progresso = findViewById<ProgressBar>(R.id.barraProgresso)

        Thread(Runnable {
            carregar(progresso)
        }).start()
    }

    fun carregar(barraProgresso : ProgressBar) {
        var progresso = 0

        while (progresso < 100) {
            Thread.sleep(1000)
            mudarPorcento(progresso.toString() + "%")
            barraProgresso.progress = progresso
            var rand = Random().nextInt(100) + 1
            progresso += rand
        }

        mudarPorcento("100%")

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun mudarPorcento(texto: String){
        var porcento = findViewById<TextView>(R.id.porcento)
        runOnUiThread {
            porcento.text = texto
        }
    }

}
