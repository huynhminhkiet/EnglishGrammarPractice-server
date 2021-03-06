package com.bigcake.model;

import com.bigcake.service.Authority;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

/**
 * Created by Bigcake on 9/9/2017
 */
@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String username;
    private String password;
    private String fullname;
    private int highScore;
    private long lastActivity;
    private List<Authority> authorities;

    public User() {
    }

    public User(String id, String username, String password, String fullname, int highScore, long lastActivity, List<Authority> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.highScore = highScore;
        this.lastActivity = lastActivity;
        this.authorities = authorities;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public long getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(long lastActivity) {
        this.lastActivity = lastActivity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }
}
