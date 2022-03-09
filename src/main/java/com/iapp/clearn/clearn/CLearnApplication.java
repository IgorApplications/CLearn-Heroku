package com.iapp.clearn.clearn;

import com.iapp.clearn.clearn.dialog.Dialog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(CLearnApplication.class, args);
        showDialog();
    }

    private static void showDialog() {
        System.setProperty("java.awt.headless", "false");
        Dialog dialog = new Dialog();
        dialog.showDialog();
    }
}
