package muelle24.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionFactory {

	//Nombre de la BD
	private static final String SCHEMA_NAME = "muelle24";
	//User de la BD
	private static final String SCHEMA_USER = "root";
	//Password de la BD
	private static final String SCHEMA_PASSWORD = "root";
	//Puerto de conexion, por defecto en la instalación se setea 3306
	private static final int CONNECTION_PORT = 3306;
	//Host de la BD, si no funciona con localhost probar con 127.0.0.1 que es el equivalente a localhost.
	private static final String CONNECTION_HOST = "localhost";
	
	public static final Connection getConnection(){
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager
					.getConnection("jdbc:mysql://"+ CONNECTION_HOST + ":" + CONNECTION_PORT +"/" + SCHEMA_NAME, SCHEMA_USER, SCHEMA_PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}

