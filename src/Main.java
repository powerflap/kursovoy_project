import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[0];
        employee[0] = new Employee(" Иван ", "Иванов", "Иванович","5",32323);
        employee[0] = new Employee(" Серега ", "Сергеев", "Сергеевич","4",23123);
        employee[0] = new Employee(" Владимир ", "Владимиров", "Владимирович","5",23234);
        employee[0] = new Employee(" Степан ", "Разин", "Тимофеевич","4",44444);
        employee[0] = new Employee(" Ирина ", "Белкова", "Геннадьевна","3",100000);
        employee[0] = new Employee(" Светлана ", "Гербер", "Максимовна","3",45666);
        employee[0] = new Employee(" Берта ", "Лапина", "Евгеньевна","2",62300);
        employee[0] = new Employee(" Кирилл ", "Узелков", "Алексеевич","2",16500);
        employee[0] = new Employee(" Виталий ", "Пальцев", "Борисович","1",33200);
        employee[0] = new Employee(" Мирослава ", "Бублик", "Ашотовна", "1", 33123);
        System.out.println(employee[0]);


    }
}