package contreras.roberto.examen2

import android.graphics.Color

class ListaCanciones {

    val colores = listOf(
        Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.CYAN, Color.MAGENTA
    )

    public val canciones = ArrayList(mutableListOf<Cancion>(
        Cancion("Shape of You", "Ed Sheeran", "3:53", "Divide", obtenerColorAleatorio()),
        Cancion("Blinding Lights", "The Weeknd", "3:20", "After Hours", obtenerColorAleatorio()),
        Cancion("Bohemian Rhapsody", "Queen", "5:55", "A Night at the Opera", obtenerColorAleatorio()),
        Cancion("Smells Like Teen Spirit", "Nirvana", "5:01", "Nevermind", obtenerColorAleatorio()),
        Cancion("Rolling in the Deep", "Adele", "3:48", "21", obtenerColorAleatorio()),
        Cancion("Someone Like You", "Adele", "4:45", "21", obtenerColorAleatorio()),
        Cancion("Uptown Funk", "Mark Ronson ft. Bruno Mars", "4:30", "Uptown Special", obtenerColorAleatorio()),
        Cancion("Despacito", "Luis Fonsi ft. Daddy Yankee", "4:42", "Vida", obtenerColorAleatorio()),
        Cancion("Thinking Out Loud", "Ed Sheeran", "4:41", "X", obtenerColorAleatorio()),
        Cancion("Hotel California", "Eagles", "6:30", "Hotel California", obtenerColorAleatorio()),
        Cancion("Billie Jean", "Michael Jackson", "4:54", "Thriller", obtenerColorAleatorio()),
        Cancion("Sweet Child O' Mine", "Guns N' Roses", "5:56", "Appetite for Destruction", obtenerColorAleatorio()),
        Cancion("Shape of My Heart", "Sting", "4:39", "Ten Summoner's Tales", obtenerColorAleatorio()),
        Cancion("Halo", "Beyoncé", "4:21", "I Am... Sasha Fierce", obtenerColorAleatorio()),
        Cancion("Can't Stop the Feeling!", "Justin Timberlake", "3:56", "Trolls Soundtrack", obtenerColorAleatorio())
    ))

    fun obtenerColorAleatorio(): Int {
        return colores.random()
    }

    fun agregarCancion(cancion: Cancion) {
        canciones.add(cancion)
        println("Canción agregada: ${cancion.nombre} - ${cancion.artista}")
    }

    fun quitarCancion(nombre: String) {
        val iterador = canciones.iterator()
        while (iterador.hasNext()) {
            val cancion = iterador.next()
            if (cancion.nombre == nombre) {
                iterador.remove()
                println("Canción eliminada: ${cancion.nombre} - ${cancion.artista}")
                return
            }
        }
        println("Canción no encontrada: $nombre")
    }

}
