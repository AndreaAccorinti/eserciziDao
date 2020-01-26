package dao;

import java.sql.DriverManager;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoUtils {
	private static final String DB_PASSWORD="";
	private static final String DB_USER="root";
	private static final String JDBC_DRIVER="org.maria.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/dao";

	static PreparedStatement statement (String sql) throws ClassNotFoundException,SQLException{
		Class.forName(JDBC_DRIVER);
		Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER, DB_PASSWORD);
		PrepareStatement _return=conn.prepareStatement(sql);
		return _return;
	}

}
