package SingletonEx;

public class Company {

    private static Company instance = new Company(); // 유일하게 사용될 인스턴스

    private Company() {
    }

    public static Company getInstance() {

        if (null == instance)
            instance = new Company();

        return instance;
    }
}
