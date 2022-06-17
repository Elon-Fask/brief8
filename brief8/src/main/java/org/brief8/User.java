package org.brief8;

public class User {
    protected String idUser;
    protected String userName;
    protected String firstName;
    protected String lastName;
    protected String email;
    private String pa$$word;

    public  User(){
        super();
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPa$$word() {
        return pa$$word;
    }

    public void setPa$$word(String pa$$word) {
        this.pa$$word = pa$$word;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser='" + idUser + '\'' +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", pa$$word='" + pa$$word + '\'' +
                '}';
    }
}
