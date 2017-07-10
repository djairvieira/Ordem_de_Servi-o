package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {
    
    // metodo responsavel por estabelecer conexao com o banco
    public static Connection conector(){
    
        java.sql.Connection conexao = null;
        // chamar driver
        String driver = "com.mysql.jdbc.Driver";
        String url= "jdbc:mysql://localhost:3306/dbinfox";
        String user= "root";
        String password = "";
        // estabelecendo a conexao com o banco de dados
        try {
            Class.forName(driver);
                    conexao = DriverManager.getConnection(url, user, password);
                    return conexao;
        } catch (Exception e) {
            // a linha abaixo serve de apoio para esclarecer erro de conexao com o banco
            //System.out.println(e);
            
            return null;
        }
    }
    
}
