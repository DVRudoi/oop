
/**
 * Необходимо создать класс Employee со следующими методами:
 * getBaseSalary - получить базовую ставку
 * setBaseSalary
 * getName - получить имя
 * setName
 * getSalary - получить зарплату
 */
public abstract class Employee implements IPaidEntity {
    private double baseSalary;
    private String name;

    public Employee(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getSalary();  //abstract т.к.мы не зраем что этот метод будет возвращать

}
