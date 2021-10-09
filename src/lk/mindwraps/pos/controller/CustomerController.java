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



    }

}
