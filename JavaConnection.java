
package javaapplication1;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;



public class JavaConnection {
    
private Connection conectar = null;

public Connection javaconnection(){

try {
    //Class.forName("com.mysql.jdbc.Driver");
    conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?",
                                   "test","test");
    System.out.println("Conexión establecida");

    // Do something with the Connection

   
} catch (SQLException ex) {
    // handle any errors
    System.out.println("Error al conectar");
    System.out.println("SQLException: " + ex.getMessage());
    //System.out.println("SQLState: " + ex.getSQLState());
    //System.out.println("VendorError: " + ex.getErrorCode());
}

return conectar;
}
}
