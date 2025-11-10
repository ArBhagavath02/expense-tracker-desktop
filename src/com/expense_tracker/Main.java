package com.expense_tracker;

import javafx.application.Application;
import javafx.stage.Stage;
import com.expense_tracker.ui.MainDashboard;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        MainDashboard dashboard = new MainDashboard();
        dashboard.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}