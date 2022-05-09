public final class Director extends BaseManager {

    private static final int INDEX = 9;


    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getBaseSalary() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * getNumberOfSubordinates() / 100 * INDEX;
        }
    }
}
