package am.alanThuring.model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Registration extends HttpServlet {
    final String name ="root";
    final String password ="root";
    final String url ="jdbc:sqlserver://localHost:1433/Registration";

@Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp) throws ServletException{
        String name = req.getParameter("name");
        String lastname = req.getParameter("lastname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        String sql = "insert into LOGIN_REGISTOR values('" + name + "','" + email + "','" + password + "')";
        Connection conn = null;
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

            conn = DriverManager.getConnection(name, password, url);
            Statement st = conn.createStatement();
            if (st.executeUpdate(sql) == 1) {
                System.out.println("Successfull" + sql);
            } else {
                System.out.println("insertion failed");
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }


}


