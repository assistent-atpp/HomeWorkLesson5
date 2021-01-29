package GeekBrains.Java.Lessons;

public class Main {

    public static void main(String[] args) {
        Employee [] employeeArray = new Employee [5];
        employeeArray [0] = new Employee(
                "Antonov Sergey Mikhailovich",
                "Leading specialist",
                "Antonov@mail.ru",
                "+79274258954",
                50000,
                35);

        employeeArray [1] = new Employee(
                "Baranov Vyacheslav Borisovich",
                "Head of department",
                "Baranov@mail.ru",
                "+79177624178",
                75000,
                42);

        employeeArray [2] = new Employee(
                "Vasilyeva Elena Viktorovna",
                "Chief accountant",
                "Vasilyeva@mail.ru",
                "+79063448162",
                80000,
                46);

        employeeArray [3] = new Employee(
                "Gladkikh Mikhail Ivanovich",
                "Manager",
                "Gladkikh@mail.ru",
                "+79516661234",
                40000,
                27);
        employeeArray [4] = new Employee(
                "Elnikova Irina Olegovna",
                "Leading expert",
                "Elnikova@mail.ru",
                "+79038434928",
                45000,
                38);

        // вывод информации в консоль с помощью метода "Информация" из класса "Сотрудник"
        for (int i = 0; i < employeeArray.length; i++){
            if (employeeArray[i].getAge() > 40){
                employeeArray [i].information();
            };
        }
    }
}
