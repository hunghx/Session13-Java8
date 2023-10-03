package ra;

@FunctionalInterface // chương tình sẽ sinh ra lỗi nếu
// ko thỏa mãn là 1 functional interface

public interface MyFunctionalInterface extends IFace {

    default void hello(){};


}
