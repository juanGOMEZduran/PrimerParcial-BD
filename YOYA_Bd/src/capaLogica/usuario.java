/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;
import java.sql.*;
import capaDatos.conexionYoyaBd;
import javax.management.Query;
/**
 *
 * @author ACER
 */
public class usuario {
    conexionYoyaBd objetoconectar =new conexionYoyaBd();
    ResultSet resultado=null;
    String query;
    
    public boolean validarPermiso(String Usuario) throws Exception{
        query="SELECT ESTADO FROM USUARIO WHERE  NAME_USUARIO='"+Usuario+"'";
        try{
            resultado= objetoconectar.consultarBD(query);
            while(resultado.next()){
                return resultado.getBoolean("ESTADO");
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return false;
    }
    
    public String iniciarSesion(String Usuario, String contrasena) throws Exception{
        query="SELECT NOMBRE_COMPLETO FROM USUARIO WHERE name_usuario ='"+Usuario+"' AND pass_usuario=md5('"+contrasena+"')";
        try{
            resultado=objetoconectar.consultarBD(query);
            if(resultado.next()){
                return  resultado.getString("NOMBRE_COMPLETO");
            }
            
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return "";
    }
    
    public String buscarCargo(String Usuario, String contrasena) throws Exception{
        query="SELECT CARGO FROM USUARIO WHERE name_usuario ='"+Usuario+"' AND pass_usuario=md5('"+contrasena+"')";
        try{
            resultado=objetoconectar.consultarBD(query);
            if(resultado.next()){
                return  resultado.getString("CARGO");
            }
            
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return "";
    }
    public String insertarUsusarios()throws Exception{
        
    }

}

