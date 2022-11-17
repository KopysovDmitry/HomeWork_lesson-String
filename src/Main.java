public class Main {
    public static void main(String[] args) {
        String FirstName = "Ivan";
        String MiddleName = "Ivanovich";
        String LastName = "Ivanov";
        String FullName = LastName+ " "+ FirstName+" "+FirstName;
        System.out.println(FullName);

        //task 2//

        String FullName_upper_case = FullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —  " + FullName_upper_case );

        //task 3//

        String fullname = "Иванов Семён Семёнович";
        String L = "е";
        System.out.println(fullname.replace("ё","е"));
    }
}