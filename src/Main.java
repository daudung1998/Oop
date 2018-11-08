import hust.edu.model.*;
import hust.edu.model.Class;

import java.util.Scanner;

public class Main {

    private static DataModel dataModel = new DataModel();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input input = new Input();
        input.initData();
        while (1>0){
            System.out.println("Danh sach cac lua chon: ");
            System.out.println("0. Them co so du lieu");
            System.out.println("1. In co so du lieu dang co");
            System.out.println("2. Tra cuu");
            System.out.println("3. Thoat");
            String flag = sc.nextLine();
            if (flag.equals("0"))
                input.inputData();
            if (flag.equals("1"))
                input.printData();
            if (flag.equals("2"))
                input.printQuery();
            if (flag.equals("3"))
                break;
            System.out.println();
        }
    }
}