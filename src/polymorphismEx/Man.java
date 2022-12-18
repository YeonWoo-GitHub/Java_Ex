package polymorphismEx;

// 구현 -> 인터페이스를 구현한 클래스
public class Man implements People {

    @Override
    public void talk() {
        System.out.println("Man.talk()");
    }

}
