import ra.Caculator;
import ra.Calculator;
import ra.Student;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        // Functional InterFace : chỉ có 1 phương thức abstract duy nhất
        // có thể khởi tạo thông qua lamda epression : () -> {}
        // 4 loại functiona interface được xây dựng sẵn trong java 8 sử dụng thường xuyên
        // Consumers  -  chứa phương thức trừu tượng nhận 1 tham số và không trả về
        List<String> list = Arrays.asList("hung","nam","khánh");
        list.forEach((str)->{
            System.out.println(str);
        });

        // Predicate - nhận vào 1 tham số và trả về boolean
        Predicate<String> predicate = (str)->str.length()>=4;
        Stream<String> stream1 = list.stream().filter(predicate);
        stream1.forEach((str)->{
            System.out.println(str);
        });

        // Supplier - không có tham số nhưng trả về đối tượng

        // yêu cầu tạo 1 danh sách số ngẫu nhiên từ 1-9
        Supplier<Integer> supplier = ()->new Random().nextInt(9);
        Stream<Integer> stream2 = Stream.generate(supplier).limit(5);
        List<Integer> list1 = stream2.collect(Collectors.toList());
        System.out.println(list1);

        // Function - nhận vào 1 tham số nhưng trả về 1 đối tượng khác
       Function<Integer,Integer> function = (a)-> a*a;
       List<Integer> list2 = Arrays.asList(1,2,3,4,5);
       Stream<Integer> stream3 = list2.stream().map(function);
       List<Integer> list3 = stream3.collect(Collectors.toList());
        System.out.println(list3);



        // Method reference : tham chiếu của phương thức
        // có thể goi tham chiếu của 1 phương thức thông qua lớp ::
        // tính tổng của 1 danh sách
        List<Integer> list4 = Arrays.asList(1,2,3,4,5,2,3,4);
        int total = list4.stream().reduce(0,Integer::sum);
        System.out.println(total);
        // trong java đã xây  dựng sẵn hàm tính tổng trong lớp Integer

        // sắp  xếp các phần tử trong danh sách sinh viên theo  tuổi tăng dần
        List<Student> studentList = Arrays.asList(new Student("hùng",18),
                new Student("Nam",12),new Student("Khánh",20));
        System.out.println(studentList);
        Collections.sort(studentList,(o2,o1)->o1.getAge()-o2.getAge());
        System.out.println(studentList);
        // bài toán cho danh sách tên sinh viên
        // khởi tạo các dối tượng student tương ứng và đưa vào list
        Map<String,Integer> map= new LinkedHashMap<>();
        map.put("Hùng",23);
        map.put("Nam",24);
        map.put("Tuấn",20);
        map.put("Anh",18);
        map.put("Đức",30);
//        List<String>  name = Arrays.asList("Hùng","Nam","Tuấn","Anh","Đức");
        List<Student> students = map.entrySet().stream().map(Student::new).collect(Collectors.toList());
//        List<Student> students = name.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(students);


        // lọc các số nguyên lơn hơn 4 và tính lũy bậc 3 của các số đó
        List<Integer> list5 = list2.stream().filter(o->o>4).map(function).collect(Collectors.toList());
        System.out.println(list5);
        System.out.println(list4.stream().distinct().collect(Collectors.toList()));
        list4.forEach(System.out::println);


        // DateTime api
        // java.util.Date có thể bị thay đổi /  chỉnh sửa thời gian
        // Date time api không thể thay đổi thời gian
        // hỗ trợ nhiều hơn các phương thức làm việc

        // Local
        LocalDate localDate = LocalDate.now();
        System.out.println("Ngày hiện tại +" +localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("Thời gian hiện tại "+ localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Ngày giờ hiện tại "+localDateTime);

        // ZOne
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Thời gian + múi giờ "+zonedDateTime);
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime japan = ZonedDateTime.now(zoneId);
        System.out.println("Thời gian của tokyo" + japan);

        // hỗ trợ tính khoảng cách giữa 2 date
        LocalDate localDate2 = LocalDate.of(1999,6,18);
        Period period = Period.between(localDate,localDate2);
        System.out.println(" thời gian cách 18/6/1999 là "+period);
        LocalDateTime yesterday = localDateTime.minus(1, ChronoUnit.DAYS);
        // tính khoảng cách giuwax 2 datetime đến nano s
        Duration duration = Duration.between(localDateTime,yesterday);
        System.out.println(duration);
        Year y = Year.now();
        System.out.println(y);

        YearMonth yym = YearMonth.now();
        System.out.println(yym);

        // format date time
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm:ss");
        System.out.println(dateTimeFormatter.format(localDateTime));


        // Optional <> xử lí các trường hợp null
        Optional<String> optionalS = Optional.ofNullable("helooo");
        String s= optionalS.orElse("đang bị null");
        System.out.println(s);


        Student[] studentL = new  Student[10];
        studentL[5] = new Student("hung",18);
        for (Student ss:studentL) {
           Optional<Student> ssss =  Optional.ofNullable(ss);
        }



    }

//    public static String inputString(String str){
//        return str;
//    }





}