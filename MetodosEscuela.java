import java.util.Scanner; // Importa la clase Scanner para leer entradas desde el teclado

// Definición de la clase principal del programa
public class MetodosEscuela {

    // Método para ingresar las calificaciones
    public static void ingresaCalificaciones(int calif[]) {
        // Se crea un objeto Scanner para poder leer la entrada de datos desde el teclado
        Scanner teclado = new Scanner(System.in);

        // Ciclo for para recorrer cada posición del arreglo calif[] y solicitar las calificaciones
        for (int i = 0; i < calif.length; i++) {
            // Muestra el mensaje para que el usuario ingrese la calificación correspondiente
            System.out.println("Calificacion " + (i + 1) + ":");
            // Almacena la calificación ingresada por el usuario en la posición i del arreglo calif[]
            calif[i] = teclado.nextInt();
        }
    }

    // Método para calcular el promedio de las calificaciones
    public static void calcularPromedio(int calif[]) {
        // Variable para acumular la suma de las calificaciones
        int suma = 0;

        // Ciclo for que recorre el arreglo calif[] y suma cada calificación
        for (int i = 0; i < calif.length; i++) {
            suma = suma + calif[i]; // Suma cada calificación al total acumulado
        }

        // Calcula el promedio dividiendo la suma total entre el número de calificaciones
        System.out.println("El promedio es igual: " + (suma / calif.length));
    }

    // Método para contar la cantidad de aprobados y reprobados
    public static void aproReb(int calif[]) {
        // Variable para contar la cantidad de aprobados
        int aprobado = 0;

        // Ciclo for para recorrer todas las calificaciones
        for (int i = 0; i < calif.length; i++) {
            // Si la calificación es mayor o igual a 6, el estudiante está aprobado
            if (calif[i] >= 6) {
                aprobado++; // Incrementa el contador de aprobados
            }
        }

        // Muestra la cantidad de aprobados y reprobados
        System.out.println("La cantidad de aprobados es: " + aprobado);
        // La cantidad de reprobados es el total de estudiantes menos los aprobados
        System.out.println("La cantidad de reprobados es: " + (calif.length - aprobado));// nos muestra los repobados restando los aprobados del arreglo
    }

    // Método para calcular el porcentaje de reprobados
    public static void porcentajeReprob(int calif[]) {
        // Se llama al método aprobado() para obtener la cantidad de aprobados
        int reprobados = calif.length - MetodosEscuela.aprobado(calif);
        // Calcula el porcentaje de reprobados
        double porcentaje = (reprobados * 100.0) / calif.length;
        // Muestra el porcentaje de reprobados
        System.out.println("El porcentaje de reprobados es: " + porcentaje + "%");
    }

    // Método adicional para contar los aprobados, utilizado en el cálculo del porcentaje de reprobados
    public static int aprobado(int calif[]) {
        // Variable para contar los aprobados
        int aprobado = 0;
        // Ciclo for para recorrer todas las calificaciones
        for (int i = 0; i < calif.length; i++) {
            // Si la calificación es mayor o igual a 6, se cuenta como aprobado
            if (calif[i] >= 6) {
                aprobado++; // Incrementa el contador de aprobados
            }
        }
        // Retorna la cantidad de aprobados
        return aprobado;
    }

    // Método principal donde se ejecuta el programa
    public static void main(String[] args) {
        // Se declara un arreglo de tamaño 10 para almacenar las calificaciones
        int[] calif = new int[10];

        // Llama al método para ingresar las calificaciones
        MetodosEscuela.ingresaCalificaciones(calif);
        // Llama al método para calcular y mostrar el promedio
        MetodosEscuela.calcularPromedio(calif);
        // Llama al método para contar y mostrar los aprobados y reprobados
        MetodosEscuela.aproReb(calif);
        // Llama al método para calcular y mostrar el porcentaje de reprobados
        MetodosEscuela.porcentajeReprob(calif);
    }
}
