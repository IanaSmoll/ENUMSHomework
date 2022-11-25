/*Перечисление должно содержать значения времён года,. т.е.: JAN, FEB, MAR... начиная с 10ти и с  прыжком 10
Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
Создать метод int getTemprature(AverageMonthTemprature month) который принимает на входе тип "месяц" и возвращает температуру в этом месяце
Добавить конструктор принимающий на вход принимает на входе тип "месяц" и среднюю температуру. */



public enum Month {
    JANUARY("Январь", 10),
    FEBRUARY("Февраль", 20),
    MARCH("Март", 30), 
    APRIL("Апрель", 40), 
    MAY("Май", 50),
    JUNE("Июнь", 60),
    JULY("Июль", 70),
    AUGUST("Август", 80),
    SEPTEMBER("Сентябрь", 90),
    OCTOBER("Октябрь", 100),
    NOVEMBER("Ноябрь", 110),
    DECEMBER("Декабрь", 120);

    private String name;
    private int averageTemp;

    Month(String name, int averageTemp) {
        this.name = name;
        this.averageTemp = averageTemp;
    }

    public static int getTemprature(Month month) {
        int locTemp = 0;

        switch(month) {
            case JANUARY:
            locTemp = month.averageTemp;
            break;

            case FEBRUARY:
            locTemp = month.averageTemp;
            break;

            case MARCH:
            locTemp = month.averageTemp;
            break;

            case APRIL:
            locTemp = month.averageTemp;
            break;

            case MAY:
            locTemp = month.averageTemp;
            break;

            case JUNE:
            locTemp = month.averageTemp;
            break;

            case JULY:
            locTemp = month.averageTemp;
            break;

            case AUGUST:
            locTemp = month.averageTemp;
            break;

            case SEPTEMBER:
            locTemp = month.averageTemp;
            break;

            case OCTOBER:
            locTemp = month.averageTemp;
            break;

            case NOVEMBER:
            locTemp = month.averageTemp;
            break;

            case DECEMBER:
            locTemp = month.averageTemp;
            break;

            default:
            break;
        }
        return locTemp;
    }
}



