import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Tarea(val id: Int, val descripcion: String) {
    var estado: Boolean = false
    private var fechaRealizacion: LocalDateTime? = null

    fun marcarComoRealizada() {
        estado = true
        fechaRealizacion = LocalDateTime.now()
    }

    fun obtenerFechaRealizacion(): String {
        return fechaRealizacion?.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) ?: ""
    }

    override fun toString(): String {
        val estadoStr = if (estado) "Realizada" else "Pendiente"
        val fechaStr = if (estado) " (${obtenerFechaRealizacion()})" else ""
        return "ID: $id, Descripción: $descripcion, Estado: $estadoStr$fechaStr"
    }
}

