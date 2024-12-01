/**
 * Esta classe representa um usuário no sistema, contendo métodos para 
 * conectar ao banco de dados e verificar se as credenciais de login são válidas.
 * 
 * @author Otávio Pampolha
 * @version 1.0
 */

package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    /**
import java.sql.DriverManager;
     * Estabelece uma conexão com o banco de dados MySQL.
     * 
     * @return Retorna uma conexão com o banco de dados.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Lidar com exceção aqui
        }
        return conn;
    }

    /**
     * Verifica se o usuário com as credenciais fornecidas existe no banco de dados.
     * 
     * @param login O nome de usuário fornecido
     * @param senha A senha fornecida pelo usuário
     * @return Retorna true se o login e a senha forem válidos, caso contrário, retorna false.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        // Instrução SQL para verificar o login e senha
        sql += "SELECT nome FROM usuarios WHERE login = '" + login + "' AND senha = '" + senha + "';";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Lidar com exceção aqui
        }
        return result;
    }
}
