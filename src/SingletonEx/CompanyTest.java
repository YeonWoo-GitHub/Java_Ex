package SingletonEx;

public class CompanyTest {

    public static void main(String[] args) {

        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        System.out.println(c1);
        System.out.println(c2);
    }
}

// 출력
// SingletonEx.Company@4517d9a3
// SingletonEx.Company@4517d9a3