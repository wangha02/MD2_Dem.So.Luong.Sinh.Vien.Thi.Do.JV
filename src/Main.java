import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size does not > 30");
            }
        } while (size > 30);

        // Khai báo kiểu dữ liệu của mảng
        int[] array;
        // Khai báo độ dài mảng
        array = new int[size];

        // Nhập vào danh sách điểm
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter a mark of student " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }

        // In ra danh sách điểm
        int count = 0;
        System.out.println("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }

        //In ra số lượng sinh viên thi đỗ
        System.out.print("\nThe number of students passing the exam is " + count);
    }