package com.totalcross;

import totalcross.ui.MainWindow;
import totalcross.ui.Label;
import totalcross.sys.Settings;

public class TotalCrossProject extends MainWindow {

    public TotalCrossProject() {
        setUIStyle(Settings.MATERIAL_UI);
    }

    @Override
    public void initUI() {
        Label helloWord = new Label("Hello World!");
        add(helloWord, CENTER, CENTER);
    }
}
