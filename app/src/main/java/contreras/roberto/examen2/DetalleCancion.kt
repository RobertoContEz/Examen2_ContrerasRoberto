package contreras.roberto.examen2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetalleCancion : AppCompatActivity() {
    private val listaCanciones = ListaCanciones()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_cancion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val idCancion = intent.getIntExtra("cancion",0)
        val cancion = listaCanciones.canciones[idCancion]

        findViewById<TextView>(R.id.txtTitulo).text = cancion.nombre
        findViewById<TextView>(R.id.txtArtista).text = cancion.artista
        findViewById<TextView>(R.id.txtDuracion).text = cancion.duracion
        findViewById<TextView>(R.id.txtAlbum).text = cancion.album
        findViewById<LinearLayout>(R.id.llCabecera).setBackgroundColor(cancion.color)
        findViewById<LinearLayout>(R.id.btnPlay).setBackgroundColor(cancion.color)

        findViewById<Button>(R.id.btnPlay).text = "Play ${cancion.nombre}"
        findViewById<Button>(R.id.btnPlay).setOnClickListener {

        }

    }
}