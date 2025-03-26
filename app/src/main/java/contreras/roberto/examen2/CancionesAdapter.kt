package contreras.roberto.examen2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout
import android.widget.TextView

class CancionAdapter: BaseAdapter {
    var canciones = ArrayList<Cancion>()
    var context: Context? = null

    constructor(context: Context, canciones: ArrayList<Cancion>) {
        this.context = context
        this.canciones = canciones
    }

    override fun getCount(): Int {
        return canciones.size
    }

    override fun getItem(position: Int): Any {
        return canciones[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var cancion = canciones[position]
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var vista = inflator.inflate(R.layout.cancion, null)

        var nme = vista.findViewById(R.id.txtTitulo) as TextView
        var art = vista.findViewById(R.id.txtArtista) as TextView
        var fnd = vista.findViewById(R.id.llFondo) as LinearLayout

        nme.setText(cancion.nombre)
        art.setText(cancion.artista)
        fnd.setBackgroundColor(cancion.color)

        vista.setOnClickListener {
            val intent = Intent(context, DetalleCancion::class.java)
            intent.putExtra("cancion", position)
            context!!.startActivity(intent)
        }

        return vista
    }
}