package ra;

public class Test {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.make();

        // gọi phương thucs tĩnh
        IFace.move();

        MyFunctionalInterface myFunctionalInterface = ()->{

        };

//        bài toán

//        xấy dựng phương thức tinh tổng hiệu tính
        // tính tổng 2 số
        calculator(2,3,(a,b)->{
            System.out.println(a+b);
        });

        // tính hiệu 2 số
        calculator(2,3,(a,b)->{
            System.out.println(a-b);
        });
        // tính tính 2 số
        calculator(2,3,(a,b)->{
            System.out.println(a*b);
        });
    }
    public static void calculator(int a,int b,Calculator cal){
        cal.cal(a,b);
    }

}
