import kotlin.system.exitProcess

class GestorTareas {
    private val listaTareas = ListaTareas()

    fun iniciar() {
        while (true) {
            mostrarMenu()
            when (val opcion = leerOpcion()) {
                1 -> agregarTarea()
                2 -> eliminarTarea()
                3 -> cambiarEstadoTarea()
                4 -> mostrarTodasLasTareas()
                5 -> mostrarTareasPendientes()
                6 -> mostrarTareasRealizadas()
                7 -> salir()
                else -> println("Opción no válida. Por favor, intente de nuevo.")
            }
        }
    }

    private fun mostrarMenu() {
        println("\n--- Gestor de Tareas ---")
        println("1. Agregar tarea")
        println("2. Eliminar tarea")
        println("3. Cambiar estado de tarea")
        println("4. Mostrar todas las tareas")
        println("5. Mostrar tareas pendientes")
        println("6. Mostrar tareas realizadas")
        println("7. Salir")
    }

    private fun leerOpcion(): Int {
        print("Seleccione una opción: ")
        return readLine()?.toIntOrNull() ?: 0
    }

    private fun agregarTarea() {
        print("Ingrese la descripción de la tarea: ")
        val descripcion = readLine() ?: ""
        listaTareas.agregarTarea(descripcion)
        println("Tarea agregada.")
    }

    private fun eliminarTarea() {
        print("Ingrese el ID de la tarea a eliminar: ")
        val id = readLine()?.toIntOrNull() ?: 0
        listaTareas.eliminarTarea(id)
        println("Tarea eliminada (si existía).")
    }

    private fun cambiarEstadoTarea() {
        print("Ingrese el ID de la tarea a marcar como realizada: ")
        val id = readLine()?.toIntOrNull() ?: 0
        listaTareas.cambiarEstadoTarea(id)
        println("Estado de la tarea actualizado (si existía).")
    }

    private fun mostrarTodasLasTareas() {
        println("Todas las tareas:")
        listaTareas.mostrarTodasLasTareas()
    }

    private fun mostrarTareasPendientes() {
        println("Tareas pendientes:")
        listaTareas.mostrarTareasPendientes()
    }

    private fun mostrarTareasRealizadas() {
        println("Tareas realizadas:")
        listaTareas.mostrarTareasRealizadas()
    }

    private fun salir() {
        println("¡Hasta luego!")
        exitProcess(0)
    }
}

fun main() {
    val gestor = GestorTareas()
    gestor.iniciar()
}

