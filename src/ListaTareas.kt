class ListaTareas {
    private val tareas = mutableListOf<Tarea>()
    private var ultimoId = 0

    fun agregarTarea(descripcion: String) {
        ultimoId++
        tareas.add(Tarea(ultimoId, descripcion))
    }

    fun eliminarTarea(id: Int) {
        tareas.removeIf { it.id == id }
    }

    fun cambiarEstadoTarea(id: Int) {
        tareas.find { it.id == id }?.marcarComoRealizada()
    }

    fun mostrarTodasLasTareas() {
        tareas.forEach { println(it) }
    }

    fun mostrarTareasPendientes() {
        tareas.filter { !it.estado }.forEach { println(it) }
    }

    fun mostrarTareasRealizadas() {
        tareas.filter { it.estado }.forEach { println(it) }
    }
}

