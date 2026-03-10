import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");
        System.out.println("Danh sách TreeSet: " + names);

        System.out.println("Phần tử nhỏ nhất (First): " + names.first());
        System.out.println("Phần tử lớn nhất (Last): " + names.last());
    }
}