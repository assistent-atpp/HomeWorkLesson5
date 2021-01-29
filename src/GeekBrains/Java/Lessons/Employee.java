package GeekBrains.Java.Lessons;

public class Employee {
    // поля класса "Сотрудник"
    private String fullName;    // ФИО
    private String post;        // должность
    private String email;       // эл.почта
    private String telephone;   // телефон
    private int salary;         // зарплата
    private int age;            // возраст

    // конструктор "Сотрудник"
    public Employee (String fullName, String post, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    // метод "Информация" для вывода данных о сотрудниках в консоль
    public void information (){
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + post);
        System.out.println("Эл.почта: " + email);
        System.out.println("Телефон: " + telephone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
    // метод для получения доступа к возрасту сотрудников
    public int getAge(){
        return age;
    }
}
