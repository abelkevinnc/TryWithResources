package com.demo;

public class Caso2 {
	//Esta clase es didactica, no tiene que compilar
	
	//anidados
	/*
	try (Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	        PreparedStatement stmt = conn.prepareStatement("SELECT id FROM users WHERE id = ? LIMIT 1");
	        ResultSet rs = stmt.executeQuery()) {

        stmt.setInt(1, user);
	        // if no record found
	        if(!rs.isBeforeFirst()) {
	           return false;
	        }
	        // if record found
	        else {
	            return true;
	        }

	    } catch (SQLException e) {
	        // log error but dont do anything, maybe later
	        String error = "SQLException: " + e.getMessage() + "\nSQLState: " + e.getSQLState() + "\nVendorError: " + e.getErrorCode();
	        return false;

	    }
	*/
	//uno llama al otro
	
	/*
	try (Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS)) {
	    executeStatement(conn);
	} catch (SQLException e) {
	    // log error but dont do anything, maybe later
	    String error = "SQLException: " + e.getMessage() + "\nSQLState: " + e.getSQLState() + "\nVendorError: " + e.getErrorCode();
	    return false;
	}

	private void executeStatement(Connection con) throws SQLException {
	    try (PreparedStatement stmt = conn.prepareStatement("SELECT id FROM users WHERE id=? LIMIT 1")) {
	        stmt.setInt(1, user);
	        try (ResultSet rs = stmt.executeQuery()) {
	            // process result
	        }
	    }
	}
	*/
}
