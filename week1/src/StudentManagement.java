import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public static int n = 100;
    public static Student[] arr = new Student[n];

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent){
        Scanner input = new Scanner(System.in);
        String x, y,z,t;
        System.out.print("nhap ten sv: ");
        x = input.nextLine();
        newStudent.setName(x);

        System.out.print("nhap id: ");
        y = input.nextLine();
        newStudent.setID(y);

        System.out.print("nhap group: ");
        z = input.nextLine();
        newStudent.setGroup(z);

        System.out.print("nhap email: ");
        t = input.nextLine();
        newStudent.setEmail(t);

    }
    static void studentsByGroup() {
        // TODO:
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i].getGroup());
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String a = it.next();
            for(int i=0; i<n; i++)
            {
                if(a.equals(arr[i].getGroup())){
                    System.out.printf("%s \n", arr[i].getGroup());
                    arr[i].getInfo();
                }
            }
        }
    }

    static void removeStudent(String id) {
        // TODO:
        int i;
        for( i=0; i<n; i++)
            if(id.equals(arr[i].getID())) break;
        for( ;i<n-1; i++)
        {
            arr[i] = arr[i+1];
        }
        n--;
    }

    public static void main(String[] args) {
        // TODO:
        Scanner input = new Scanner(System.in);

        Student sv = new Student();
        sv.setName("Nguyen Van An");
        sv.setID("17020001");
        sv.setGroup("K62CC");
        sv.setEmail("17020001@vnu.edu.vn");

        sv.getInfo();

        Student b = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");



        b.getInfo();
        if (sameGroup(sv, b)) {
            System.out.println("a,b in the same group");
        } else {
            System.out.println("a,b not in the same group");
        }

        //so sinh vien trong mang
        System.out.print("nhap so sinh vien: ");
        n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {

        }
        studentsByGroup();
        String removeStudent;
        System.out.println("nhap id sinh vien muon xoa: ");
        removeStudent = input.nextLine();
        removeStudent(removeStudent);
        System.out.print("\t\tdanh sach sau khi xoa \n");
        for(int i=0; i<n; i++) arr[i].getInfo();
    }
}