package com.zafer.objectorientedprograming;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        /*User user =  new User("Zafer" , "İntepe" , 27);
        Mucusian mucusian = new Mucusian("James" , "Guitar" , 27);
        superMucusian superMucusian = new superMucusian("Eminem" , "Guitar" , 50);
        Animals animals = new Animals();
        user.informaition();
        Dog dog = new Dog();
        Mathematics mathematics = new Mathematics();
        mucusian.setAge(18 , "12");
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
        textView.setText(superMucusian.getName());
        textView2.setText(superMucusian.getAge());*/
        User user = new User("Zafer" , "İntepe" , 30);
        superMucusian superMucusian = new superMucusian("Eminem" , "Guitar" , 50);
        textView.setText("Name: " + user.Name + " Surname: " + user.Surname + " Age: " + user.Age);
        textView2.setText("Name: " + superMucusian.getName() + " Enturment: " + superMucusian.getInsturment() + " Age: " + superMucusian.getAge());
        superMucusian.setAge(20 , "123");
        textView2.setText("Name: " + superMucusian.getName() + " Enturment: " + superMucusian.getInsturment() + " Age: " + superMucusian.getAge());
    }
}