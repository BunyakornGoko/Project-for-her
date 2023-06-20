package forher.drink;

import java.sql.*;

public class Manage {
    private String name;

    public Manage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void allDay(){
        Connection connect = ConnectionDatabase.connect();
        try {
            Statement statement = connect.createStatement();
            String sql = "Select * from My_Girl_Friend.Diary";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2)
                        + " " + resultSet.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addDay(User account){
        Connection connect = ConnectionDatabase.connect();
        String sql = "insert into My_Girl_Friend.Diary(Day,Feels,Synopsis)" +
                "values (?,?,?) ";
        try {
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1 ,account.getDay());
            preparedStatement.setString(2 ,account.getFeels());
            preparedStatement.setString(3 ,account.getSynopsis());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteDay(String day){
        Connection connection = ConnectionDatabase.connect();
        String sql = "delete from My_Girl_Friend.Diary where Day=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,day);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
