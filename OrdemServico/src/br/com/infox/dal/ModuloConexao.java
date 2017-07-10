/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;
/**
 *
 * @author djair
 */
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
            System.out.println(e);
            return null;
        }
    }
    
    
    
}
