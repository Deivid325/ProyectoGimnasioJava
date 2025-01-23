public class Gimnasio {
    private String nombre;
    private String[] actividades = {"Yoga", "Boxeo", "Funcional"};
    private List<Usuario> usuariosRegistrados = new ArrayList<>();

    public Gimnasio(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarActividades() {
        System.out.println("Actividades disponibles en el gimnasio " + nombre + ":");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }

    public void registrarUsuario(String nombreUsuario, int edad) {
        Usuario nuevoUsuario = new Usuario(nombreUsuario, edad);
        usuariosRegistrados.add(nuevoUsuario);
        System.out.println("Usuario " + nombreUsuario + " registrado en el gimnasio " + nombre + ".");
    }

    public void mostrarUsuariosRegistrados() {
        System.out.println("Usuarios registrados en el gimnasio " + nombre + ":");
        if (usuariosRegistrados.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            for (Usuario usuario : usuariosRegistrados) {
                System.out.println("- " + usuario.getNombre() + ", Edad: " + usuario.getEdad());
            }
        }
    }

    public static void main(String[] args) {
        Gimnasio miGimnasio = new Gimnasio("FitLife Gym");
        miGimnasio.mostrarActividades();
        miGimnasio.registrarUsuario("David Delgado", 21);
        miGimnasio.registrarUsuario("Ana Gomez", 30);
        miGimnasio.mostrarUsuariosRegistrados();
    }
}

class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
