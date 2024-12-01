// Código reescrito com os comentários pontuando cada nó identificado para a sequência de funcionamento do código.
// Algumas chaves e espaçamentos foram feitos, apenas para questão de melhor legibilidade.

package login;

import java.sql.Connection;
import java.sql.DriveManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    // 1 - Início do método conectarBD
    public Connection conectarBD(){
        Connection conn = null;
        try {
            // 2 - Tentativa de conexão
            Class.forName("com.mysql.Driver,manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriveManager.getConnection(url); // 3 - Conexão bem-sucedida
        }catch (Exception e) { // 4 - Tratamento de exceção
            // 5 - Conexão falhou
        }
        // 6 - Retorno da conexão
        return conn;
    }

    public String nome = ""; // 7 - Definição da variável nome
    public boolean result = false; // 8 - Definição da variável result

    // 9 - Início do método verificarUsuario
    public boolean verificarUsuario(String login, String senha){
        String sql = ""; // 10 - Definição da variável sql
        Connection conn = conectarBD(); // 11 - Chamada ao método conectarBD
        // 12 - Construção da instrução SQL
        sql += "Select nome from usuarios";
        sql += " where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";
        
        try{
            // 13 - Criação da statement
            Statement st = conn.createStatement();
            // 14 - Execução do SQL
            ResultSet rs = st.executeQuery(sql);
            // 15 - Decisão: Verifica ResultSet
            if(rs.next()){
                // 16 - Bloco result = true
                result = true;
                nome = rs.getString("nome"); // 17 - Armazenamento do nome
            }
        }catch (Exception e){  // 18 - Tratamento de exceção
            // 19 - Exceção capturada
        }
        // 20 - Retorno do resultado
        return result;
    }
}
