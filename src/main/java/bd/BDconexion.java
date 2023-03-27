package bd;

import java.sql.*;

public class BDconexion{

    private  String bd = "dbmyself";
    private  String login = "root";
    private  String pwd = "12345";
    private  String url = "jdbc:mysql://localhost:3306/" + bd;

    private Connection conexion;

    public BDconexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, pwd);
            if (conexion != null){
                System.out.println("Conexion a la bd" + url + "lista para iniciar");
                conexion.close();
            }
        }catch(ClassNotFoundException cnfe){
            System.out.println("Driver jdbc no encontrado");
            cnfe.printStackTrace();
        }catch(SQLException sqle){
            System.out.println("Error de conexión BD");
            sqle.printStackTrace();
        }catch (Exception e){
            System.out.println("Error...");
            e.printStackTrace();
        }

    }

    public static void main(String[] args){

        BDconexion test = new BDconexion();
    }

}
