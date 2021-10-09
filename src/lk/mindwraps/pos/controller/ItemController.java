package lk.mindwraps.pos.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import lk.mindwraps.pos.db.DBConnection;
import lk.mindwraps.pos.model.Customer;
import lk.mindwraps.pos.model.Item;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Sanjaya Sandakelum <sandakelumsanjaya@gmail.com> (CREATIVE-2)
 * @since 2021-10-09
 */
public class ItemController {
    public TextField txtId;
    public TextField txtName;

    public void itemOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {

        Item item = new Item(
                txtId.getText(),
                txtName.getText()
        );

        PreparedStatement stm = DBConnection.getInstance().
                getConnection().prepareStatement(
                "INSERT INTO Item VALUES(?,?,?,?)");
        stm.setString(1, item.getId());
        stm.setString(2, item.getName());

        if (stm.executeUpdate() > 0) {
            new Alert(Alert.AlertType.CONFIRMATION,
                    "Saved!", ButtonType.OK).show();
        } else {
            new Alert(Alert.AlertType.WARNING,
                    "Try Again!", ButtonType.OK).show();
        }

    }
}
