package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    ObservableList<Contact> items = FXCollections.observableArrayList();


    @FXML
    ListView list;

    @FXML
    TextField name;

    @FXML
    TextField phone;

    @FXML
    TextField email;


    public void addItems() {
        items.add(new Contact(name.getText(), phone.getText(), email.getText()));
        name.setText("");
        phone.setText("");
        email.setText("");
    }

    public void removeItem() {
        Contact item = (Contact) list.getSelectionModel().getSelectedItem();
        items.remove(item);
    }

    public void toggleItem() {

        Contact item = (Contact) list.getSelectionModel().getSelectedItem();

        if (item != null) {
            list.refresh();
        }
        }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(items);
    }

    public void setItems(KeyEvent keyEvent) {
    }
}
