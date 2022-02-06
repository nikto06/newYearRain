package com.company;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Okno extends JFrame {

    public Okno() {
        // Задаем параметры для окна
        setBounds(0,0,2000,1300);

        // Создадим заголовок
        setTitle("Дождь из подарков");

        // Отобразить окно
        setVisible(true);

        //Добавить слушателя
        addKeyListener(new MyKey());
    }
}
