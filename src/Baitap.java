import ra.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Baitap {
    // cho danh sách sinh vien có 10 học sinh (tự chọn dữ liệu ngẫu nhiên) , mỗi học sinh gồm các thuộc tính:
    // id, name, age, sex , điểm tổng kết (dtb)
    // lọc các học sinh có đtb > 5 và < 6.5
    // tính số lượng sinh viên nam nữ trong danh sách
    // lấy ra sinh viên có điểm cao nhất, thấp nhất
    // tính điêm trung bình của danh sách các học sinh
    // tihs điểm trung bình của các bạn nam, nữ
    // tính tổng số tuổi của tất cả các học sinh
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"hùng",12,true,8.5));
        list.add(new Student(2,"nam",13,true,5.5));
        list.add(new Student(3,"khánh",22,false,6));
        list.add(new Student(4,"minh",23,false,5.5));
        list.add(new Student(5,"đức",25,true,6.1));
        list.add(new Student(6,"linh",14,false,5.6));
        list.add(new Student(7,"nghĩa",16,true,7));
        list.add(new Student(8,"đạt",18,false,5));
        list.add(new Student(9,"ánh",21,true,9));
        list.add(new Student(10,"kiên",17,true,5.9));

    }
}
