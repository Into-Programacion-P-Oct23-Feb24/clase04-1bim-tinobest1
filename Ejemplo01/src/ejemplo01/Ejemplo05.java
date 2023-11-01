/*
René Rolando

Elizalde Solano

1983
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {
    public static void main(String[] args) {
        // Secuencia de escape \n y \t
        String nombreEstudiante = "Lenin Alejandro";
        String apellidoEstudiante = "Correa Velez";
        int nacimiento = 1983;
        
        /*System.out.println(nombreEstudiante+"\n"+apellidoEstudiante+ "\n"+ 
                nacimiento);
        /*el "\t" significa que hay un espacio en cambio "\n" significa que termina una linea y comienza otra mas abajo*\
        System.out.println(nombreEstudiante+"\n\n"+apellidoEstudiante+ "\n\n"+ 
                nacimiento);
        
        System.out.println(nombreEstudiante+"\n"+"\n"+apellidoEstudiante+ "\n"+
                "\n"+ nacimiento); */
        System.out.println(nombreEstudiante+"\t"+apellidoEstudiante);   
        System.out.println(nombreEstudiante+"\n\t"+apellidoEstudiante);   
    }
}
