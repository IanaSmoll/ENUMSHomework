/*Создайте общедоступное перечисление Weekday с константами для MONDAY, 
TUESDAY, ..., SUNDAY.
Перечисление должно иметь метод экземпляра boolean isWeekDay() и 
метод экземпляра boolean isHoliday().
Метод isHoliday() должен возвращать значение, противоположное isWeekDay().
Напишите программу, демонстрирующую, как можно использовать это 
перечисление, в которой есть метод, который принимает день недели 
в качестве аргумента и печатает сообщение в зависимости от 
того, является ли день недели выходным или нет.
Мы предлагаем, чтобы основной метод перебирал все значения в 
перечислении Weekday и отправлял их в качестве аргумента методу.
Подсказка: каждое перечисление в Java имеет метод static values(), 
который возвращает массив значений в перечислении, поэтому вы можете 
использовать для этого цикл for-each (расширенный цикл for).
Подсказка: каждое перечисление имеет реализацию toString(), которая 
возвращает имя константы, как оно было объявлено в перечислении, например. "FRIDAY".
 */

public enum Weekday {
    MONDAY("Monday", "рабочий день"),
    TUESDAY("Tuesday", "рабочий день"),
    WEDNESDAY("Wednesday", "рабочий день"),
    THURSDAY("Thursday", "рабочий день"),
    FRIDAY("Friday", "рабочий день"),
    SATURDAY("Saturday", "выходной"),
    SUNDAY("Sunday", "выходной");

    private final String day;
    private String character;
    private static final String NAME_WEEK_DAY = "рабочий день";
    private static final String NAME_WEEKEND_DAY = "выходной";

    Weekday(String day, String character) {
        this.day = day;
        this.character = character;
    }
    public boolean isWeekDay()
    {
        return character.equals(NAME_WEEK_DAY);
    }
    public boolean isHoliday()
    {
        return character.equals(NAME_WEEKEND_DAY);
    }
 }

