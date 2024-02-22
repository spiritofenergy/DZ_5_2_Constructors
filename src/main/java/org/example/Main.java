package org.example;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("1. Что такое конструктор по-умолчанию?\n");
        System.out.println("Ответ: Это метод без названия(по названию класса) и без параметров");

        /////////////////
        System.out.println("2. Как сделать так, чтобы при каждом создании экземпляра класса, в консоль что-то выводилось?" +
                " (Слежка за классом :) )");
        Tracking tracking = new Tracking();

        ///////////////////
        System.out.println("3. Сделайте класс, отображающий операционную систему; сделайте конструктор \n" +
                "для него. Создайте несколько экземпляров");
        Property property = new Property();
        Property property1 = new Property();
        Property property2 = new Property();
        Property property3 = new Property();

        //////////////////
        System.out.println("4. Сделайте класс WebSite, и несколько конструкторов для него; \n" +
                "продемонстрируйте использование ");
        WebSite webSite = new WebSite(3 );
        WebSite webSite1 = new WebSite("7");
        WebSite webSite2 = new WebSite(12.12);

          //////////////////
          System.out.println("5. Создайте экземпляры StringBuilder, используя несколько конструкторов ");
          Builder builder = new Builder("String",12.12,2);
          StringBuilder stringBuilder = new StringBuilder("String",12.12,2);

          System.out.println(stringBuilder.name + ", " + stringBuilder.date + ", " + stringBuilder.count);
          System.out.println(builder.name + ", " + builder.date + ", " + builder.count);


        System.out.println("6. Сделайте класс Url(ссылка) с несколькими конструкторами; сделайте класс \n" +
                "CurrencyCourse (курс валют) с несколькими конструкторами; внутри \n" +
                "конструктора CurrencyCourse вызывайте также конструктор Url -\n" +
                "инициализируйте ссылку, по которой будете получать курс валют; запросите \n" +
                "курс валют");
        String data = "12";
        CurrencyCourse currencyCourse = new CurrencyCourse(data);



       System.out.println("7. Создайте класс TextChecker. Его конструктор принимает строку и внутри него \n" +
                "будет происходить: Проверка текста на наличие инностранных букв вместо \n" +
                "русской раскладки и цифр вместо нуля и буквы «з». Если обнаружена такая \n" +
               "подмена - выбрасывается исключение");

        String str7 = "Кукла Dasha";
        TextChecker textChecker = new TextChecker(str7);


        System.out.println("8. Создайте класс KeyboardSwitch. Его конструктор принимает строку и внутри \n" +
                "него происходит: Перевод текста в нужный язык(забыл переключить клавиатуру \n" +
                "и напечатал другим языком). ");

        String str8 = "Ghbdtn z c dfvb";
       KeyboardSwitch keyboardSwitch = new KeyboardSwitch(str8);

    }

}
