package patrones_de_diseño.Singleton;

public class Conexion {
    // Declaracion
    private static Conexion instancia;

    private Conexion(){

    }

    private Conexion getInstancia(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }

    public void conectar(){
        System.out.println("Me conecte a la BD");
    }

}
