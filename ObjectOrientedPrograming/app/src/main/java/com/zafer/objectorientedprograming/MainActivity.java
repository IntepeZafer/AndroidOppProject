package com.zafer.objectorientedprograming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user =  new User("Zafer" , "İntepe" , 27);
        Mucusian mucusian = new Mucusian("James" , "Guitar" , 27);
        superMucusian superMucusian = new superMucusian("Eminem" , "Guitar" , 50);
        Animals animals = new Animals();
        user.informaition();
        Dog dog = new Dog();
        Mathematics mathematics = new Mathematics();
        mucusian.setAge(18 , "123");
        textView = findViewById(R.id.textView);
        textView.setText(mucusian.getName() + " " + mucusian.getInsturment() + " " + mucusian.getAge());
        textView.setText(superMucusian.getName());
        String number = String.valueOf(mathematics.sum(1 , 2));
        textView.setText(number);
        textView.setText(animals.sing());
        dog.test();
        dog.sing();
        textView.setText(dog.sing());
        textView.setText(user.informaition());
        Piano piano = new Piano();
        piano.brand = "Yamaha";

    }
}