package cn.it.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private String username;
    private User user;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    private String password;


    private Double money;


    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", user=" + user +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }
}
