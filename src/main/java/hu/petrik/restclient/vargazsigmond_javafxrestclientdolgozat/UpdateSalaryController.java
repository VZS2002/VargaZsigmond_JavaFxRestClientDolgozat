package hu.petrik.restclient.vargazsigmond_javafxrestclientdolgozat;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class UpdateSalaryController extends Controller {
    @FXML
    private TextField nameField;
    @FXML
    private TextField salaryField;
    @FXML
    private Spinner<Integer> booleanField;
    @FXML
    private Button updateButton;

    private Salary salary;

    public void setPerson(Salary salary) {
        this.salary = salary;
        nameField.setText(this.salary.getName());
        salaryField.setText(this.salary.getSalary());
        booleanField.getValueFactory().setValue(this.salary.isDegree());
    }

    @FXML
    private void initialize() {
        SpinnerValueFactory.IntegerSpinnerValueFactory valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 200, 30);
        booleanField.setValueFactory(valueFactory);
    }

    @FXML
    public void updateClick(ActionEvent actionEvent) {
        String name = nameField.getText().trim();
        String email = salaryField.getText().trim();
        int age = booleanField.getValue();
        if (name.isEmpty()) {
            warning("Name is required");
            return;
        }
        if (salary.isEmpty()) {
            warning("Salary is required");
            return;
        }

        this.salary.setName(name);
        this.salary.setSalary(salary.getSalary());
        this.salary.setDegree(salary.isDegree());
        Gson converter = new Gson();
        String json = converter.toJson(this.salary);
        try {
            String url = App.BASE_URL + "/" + this.salary.getId();
            Response response = RequestHandler.put(url, json);
            if (response.getResponseCode() == 200) {
                Stage stage = (Stage) this.updateButton.getScene().getWindow();
                stage.close();
            } else {
                String content = response.getContent();
                error(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}