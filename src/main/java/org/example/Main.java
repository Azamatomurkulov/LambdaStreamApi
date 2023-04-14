package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //1. Найти среднее значение чисел в списке:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        OptionalDouble average = numbers.stream().mapToInt(e ->e).average();

        //2. Получить список квадратов чисел в списке:
        List<Integer> num = numbers.stream().map((x) -> x*x).toList();

        //3. Отфильтровать элементы списка, оставив только четные числа:
        List<Integer> num2 = numbers.stream().filter(s -> s%2==0).toList();

        //4. Проверить, содержит ли список число 3:
        Boolean num3 = numbers.stream().anyMatch(s -> s == 3);

        //5. Соединить элементы списка в одну строку через запятую:
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        String str = strings.stream().collect(Collectors.joining(", "));

        //6. Получить первые три элемента списка:
        List<Integer> num5 = numbers.stream().limit(3).toList();

        //7. Извлечь из списка все уникальные элементы:
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 3, 4, 6);
        List<Integer> num6 = numbers2.stream().distinct().toList();

        //8. Найти максимальное значение в списке:
        Integer num7 = numbers.stream().max(Integer::compare).get();

        //9. Отсортировать список в обратном порядке:
        List<Integer> num9 = numbers.stream().sorted(Comparator.reverseOrder()).toList();


        Multiply multiplying = (list) -> list.stream().map((x) -> x*2).collect(Collectors.toList()); //1. Напишите лямбда-выражение, которое умножает каждый элемент списка на 2.

        Operationable operationable = (x,y)->x+y; //2. Напишите лямбда-выражение, которое находит сумму двух чисел.

        Equalable equalable = (x)->x>10; //3. Напишите лямбда-выражение, которое возвращает True, если переданное число больше 10.

        StringLength stringLength = (str2)->str2.length()>5; //4. Напишите лямбда-выражение, которое возвращает True, если переданная строка содержит более 5 символов.

        StringLength2 stringLength2 = (str3)->str3.length(); //5. Напишите лямбда-выражение, которое возвращает длину переданной строки.

        Square square = (x)->x*x; //6. Напишите лямбда-выражение, которое возвращает квадрат переданного числа.

        ListSum listSum = (list)->list.stream().mapToInt(Integer::intValue).sum(); //7. Напишите лямбда-выражение, которое возвращает сумму элементов списка.

        ALetter IsALetter = (str5) -> str5.startsWith("A"); //8. Напишите лямбда-выражение, которое возвращает True, если переданная строка начинается с буквы "A".

        SquareOfList squareOfList = (list) -> list.stream().map((x) -> x*x).collect(Collectors.toList()); //9. Напишите лямбда-выражение, которое возвращает список квадратов элементов исходного списка.






    }
    public interface Operationable{
        int calculate(int x, int y);
    }
    public interface Equalable{
        boolean tenOrBigger(int x);

    }
    public interface StringLength{
        boolean stringLenght(java.lang.String str);
    }
    public interface SquareOfList{
        List squareOfList(List<Integer> list);
    }
    public interface StringLength2{
        int stringLenght2(java.lang.String str);
    }
    public interface Square{
        int square(int x);
    }
    public interface ListSum{
        Integer listSum(List<Integer> list);
    }
    public interface ALetter{
        boolean isALetter(String str);
    }
    public interface Multiply{
        List multiplying(List<Integer> list);
    }
}