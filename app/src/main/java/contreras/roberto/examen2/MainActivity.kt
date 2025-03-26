package contreras.roberto.examen2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var adaptador: CancionAdapter? = null
    private val listaCanciones = ListaCanciones()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val gridCanciones : GridView = findViewById(R.id.gridCanciones)
        val btnAgregar : Button = findViewById(R.id.btnAgregarCancion)

        adaptador = CancionAdapter(this, listaCanciones.canciones)
        gridCanciones.adapter = adaptador

        btnAgregar.setOnClickListener {
            val intent = Intent(this, AgregarCancion::class.java)
            startActivity(intent)
        }
    }

}
