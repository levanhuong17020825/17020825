public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    //name
    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    //ID
    public void setID(String id_) {
        this.id = id_;
    }

    public String getID() {
        return id;
    }

    //Group
    public void setGroup(String g) {
        this.group = g;
    }

    public String getGroup() {
        return group;
    }

    //Email
    public void setEmail(String e) {
        this.email = e;
    }

    public String getEmail() {
        return email;
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Nguyen Van An";
        s1.id = "17020001";
        s1.group = "K62CC";
        s1.email = "17020001@vnu.edu.vn";
        s1.getInfo();
    }


    String getInfo() {
        // TODO:
        System.out.printf("%-15s - \t", getName());
        System.out.printf("%-10s - \t", getID());
        System.out.printf("%-10s - \t", getGroup());
        System.out.printf("%s", getEmail());
        System.out.println("");
        return null; // xóa dòng này sau khi cài đặt
    }

    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    Student(Student s) {
        // TODO:
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
}