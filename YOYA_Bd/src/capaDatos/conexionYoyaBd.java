
package capaDatos;

import java.sql.*;
/**
 *
 * @author JUAN JOSE GOMEZ DURAN 191853
 */
public class conexionYoyaBd {
    private String driver;
    private String ruta;
    private String user;
    private String password;
    private Connection conexion;
    private Statement sentencia=null;

    public conexionYoyaBd() {
        driver="org.postgresql.Driver";
        ruta="jdbc:postgresql://localhost:5432/BDYOYADEFINITIVO";
        user="postgres";
        password="191853";
        conexion=null;                     
    }   
    public void ConBase() throws Exception{
        try {
            Class.forName(driver);
            conexion=DriverManager.getConnection(ruta, user, password);
                    
        } catch (Exception e) {
            throw  new Exception ("Error al conectar la base de datos para YOYA");
            
        }
        
    }
    
    public boolean getEstado() throws SQLException{
        return conexion.isClosed();
    }
    
    public void desconectarBD()throws Exception{
        try{
            conexion.close();
            
        }catch(Exception e){
            throw new Exception("ERROR AL DESCONECTAR");
        }
                 
    }
    public ResultSet consultarBD(String query) throws Exception{
        try{
            ConBase();
            sentencia=conexion.createStatement();
            return sentencia.executeQuery(query);
            
        }catch(Exception e){
            throw new Exception("Error al consultar");
            
        }
        finally{
            if(getEstado()== false){
                desconectarBD();
            }
        }
    }
 
}

