package ru.stqa.pft.sandbox;

/*
Демонстрация приведения типов
*/
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y); // приводим тип double к типу int (теряется дробная часть)
        System.out.println("Целочисленный результат деления x / y: " + i);

        i = 100;
        b = (byte) i; // информация не теряется, тип byte может содержать значение 100
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i; // информация теряется, тип byte не может содержать значение 257
        System.out.println("Значение b: " + b);

        b = 88; // представление символа X в коде ASCII
        ch = (char) b; // приведение несовместимых типов
        System.out.println("ch: " + ch);

    }
    
}
