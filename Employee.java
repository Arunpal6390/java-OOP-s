public class Employee {
 
    private String name;
    private int age;

    public String getName() {
        return name="Sohan";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        // emp.setName("John Doe");
        emp.setAge(30);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
    }
}


