package lk.mindwraps.pos.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodTextRun;
import lk.mindwraps.pos.db.DBConnection;
import lk.mindwraps.pos.model.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Sanjaya Sandakelum <sandakelumsanjaya@gmail.com> (CREATIVE-2)
 * @since 2021-10-09
 */
public class CustomerController {
    public TextField txtId;
    public TextField txtName;

    public void saveOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {

        Customer customer = new Customer(
                txtId.getText(),
                txtName.getText()
        );

        PreparedStatement stm = DBConnection.getInstance().
                getConnection().prepareStatement(
                "INSERT INTO Customer VALUES(?,?,?,?)");
        stm.setString(1, customer.getId());
        stm.setString(2, customer.getName());

        if (stm.executeUpdate() > 0) {
            new Alert(Alert.AlertType.CONFIRMATION,
                    "Saved!", ButtonType.OK).show();
        } else {
            new Alert(Alert.AlertType.WARNING,
                    "Try Again!", ButtonType.OK).show();
        }

    }

}
