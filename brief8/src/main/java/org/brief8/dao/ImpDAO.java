package org.brief8.dao;

import org.brief8.models.User;

public class ImpDAO implements SrcDAO{
/*	
    @Override
    public void SignIn(String username,String psw) {
        String SQL = "Select * From users WHERE username=? and psw=?";
        ResultSet rs = null;
        try {
            Connection connection = ConnectDB.connection();
            PreparedStatement ps = connection.prepareStatement(SQL);

            ps.setString(1,username);
            ps.setString(2,psw);

            rs = ps.executeQuery();



            if (!rs.next()){
                    infoBox("Enter Correct Email and Password", "Failed", null);

            }else{
                    infoBox("Login Successfull", "Success", null);
                }

            }catch(Exception e){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setHeaderText("Error");
                alert.setContentText(e.getMessage());
                alert.showAndWait();
            }

    }

    @Override
    public void SignUp(User user) {
        String SQL = "INSERT INTO users(name_User,prenom_User,username,psw) VALUES(?,?,?,?)";
        try (
                Connection connection = ConnectDB.connection();
                PreparedStatement ps =connection.prepareStatement(SQL)
        ){
            ps.setString(1, user.getName_User());
            ps.setString(2, user.getPrenom_User());
            ps.setString(3, user.getUsername());
            ps.setString(4, user.getPsw());

            int executeUpdate = ps.executeUpdate();

            if (executeUpdate == 1){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Create Success");
                alert.setHeaderText("Create Success");
                alert.setContentText("Created Successfully");
                alert.showAndWait();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
*/
}
