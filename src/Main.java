public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName  = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //task2
        System.out.println("задание 2");
        String name = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + name);

        //task3
        System.out.println("задание 3");
        String firstName1 = "Семён";
        String middleName1 = "Семёнович";
        String lastName1  = "Иванов";
        String fullName1 = lastName1  + " " + firstName1 + " " + middleName1;
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName1);
    }
}