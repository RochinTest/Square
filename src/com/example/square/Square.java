//Напишите статический перегруженный метод для расчета площади фигуры.
// Расчет площади квадрата – передаем 1 параметр double; круга – 1
// параметр int; прямоугольника – 2 параметра double
package com.example.square;

public class Square {
    // Вычисляем площадь круга
    public void square(int a) {
        System.out.println(" площадь круга " + Math.PI * a);
    }

    // Вычисляем площадь прямоугольника.
    public void square(double a, double b) {
        System.out.println("площадь прямоугольника: " + a * b);
    }

    // Вычисляем площадь квадрата
    public void square(double a) {
        System.out.println("площадь квадрата: " + a * a);
    }

    public static class Main {
        public static void main(String args[]) {
            Square sq = new Square();
            double result;
// вызов всех версий метода test()
            sq.square(1.2323);
            sq.square(10);
            sq.square(10.6546, 20.567456);

        }
    }
}

