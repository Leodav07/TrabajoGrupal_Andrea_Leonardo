
package tiptapparejas;

public class Gestion {
   private Usuarios usuarios[] = new Usuarios[10];
   private static Gestion gestor;
   private Usuarios usuario;
   
   private Usuarios buscarUsuario(String nombre){
        for (Usuarios users : usuarios){
            if(users != null && users.getNombre().equals(nombre)){
                return users;
            } 
        }
        return null;
    }
    public static Gestion getGestor()
    {
            if (gestor == null){
                gestor = new Gestion();}
            return gestor;
        
    }
   
   public boolean agregarUsuario(String nombre, String password){
        if(buscarUsuario(nombre) == null){
            for (int i = 0; i < usuarios.length; i++){
               if(usuarios[i] == null){
                    usuarios[i] = new Usuarios(nombre, password);
                    return true;
               }
            }
         
        }
        return false;
    }
   
   public Usuarios getUsuario(String nombre){
        for (Usuarios u : usuarios) {
        if (u.getNombre().equals(nombre)) {
            return u;
        }
    }
    return null;
   }
   public Usuarios getUsuarioActual(){
       return usuario;
   }
   
   public Boolean acceder(String nombre, String password) {
        if (usuario != buscarUsuario(nombre)) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] == buscarUsuario(nombre)) {
                    if (nombre.equals(usuarios[i].getNombre()) && password.equals(usuarios[i].getPassword())) {
                        usuario = usuarios[i];
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
        
    }
   
   
   
}
