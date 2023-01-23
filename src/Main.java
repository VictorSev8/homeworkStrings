import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Task 1
        String firstName = "Ivan", middleName = "Ivanovich", lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Task 2
        String capsName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + capsName);

        //Task 3
        fullName = "Иванов Семён Семёнович";
        String fullNameWithoutYo = fullName.replace('ё', 'e');
        System.out.println("Данные ФИО сотрудника — " + fullNameWithoutYo);
    }
}