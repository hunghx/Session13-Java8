package ra;

public interface IFace {
    // trước java8 chỉ được khai báo các phươngg thức trừu tượng
    // sau khi java8 ra đời thì cho phép khia báo các phương thức mặc dịnh

    void display();
//default method
    default void make(){
        System.out.println("hellloo");
    };
//    static method
    static void move(){
        System.out.println("moving...");
    }
}
