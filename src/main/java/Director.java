public final class Director extends BaseManager {

    private static final int INDEX = 9;


    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    protected int getIndex(){
        return INDEX;
    }
}
