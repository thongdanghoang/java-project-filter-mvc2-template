/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanhkt.account;

import java.io.Serializable;

/**
 *
 * @author natton
 */
public class AccountDTO implements Serializable{
    private String username;
    private String password;
    private String fullname;

    public AccountDTO() {
    }

    public AccountDTO(String username, String password, String fullname) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "AccountDTO{" + "username=" + username + ", password=" + password + ", fullname=" + fullname + '}';
    }
    
    
    
}
