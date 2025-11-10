package com.expense_tracker.ui;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainDashboard {
    public void start(Stage stage) {
        Scene scene = new Scene(new Label("Expense Tracker Dashboard"), 600, 400);
        stage.setTitle("Personal Expense Tracker");
        stage.setScene(scene);
        stage.show();
    }
}