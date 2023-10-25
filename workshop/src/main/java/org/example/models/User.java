package org.example.models;

public class User {
    String userName;
    String userPhoneNumber;
    int userID;

    public User() {
    }

    public User(String userName, String userPhoneNumber, int userID) {
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
