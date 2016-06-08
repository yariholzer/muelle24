package muelle24;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExample {

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
		
  public static void main(String[] argv) {

	System.out.println("-------- MySQL JDBC Connection Testing ------------");

	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}

	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;

	try {
		connection = DriverManager
				.getConnection("jdbc:mysql://"+ CONNECTION_HOST + ":" + CONNECTION_PORT +"/" + SCHEMA_NAME, SCHEMA_USER, SCHEMA_PASSWORD);
	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
	}

	if (connection != null) {
		System.out.println("You made it, take control your database now!");
	} else {
		System.out.println("Failed to make connection!");
	}
  }
}